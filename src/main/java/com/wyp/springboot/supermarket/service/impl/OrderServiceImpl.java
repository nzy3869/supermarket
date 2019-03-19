package com.wyp.springboot.supermarket.service.impl;

import com.wyp.springboot.supermarket.dao.OrderMapper;
import com.wyp.springboot.supermarket.dao.StockMapper;
import com.wyp.springboot.supermarket.pojo.Order;
import com.wyp.springboot.supermarket.pojo.Stock;
import com.wyp.springboot.supermarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private StockMapper stockMapper;

    @Transactional
    @Override
    public int addOrder(Order order) {
        return 0;
    }

    @Transactional
    @Override
    public int addOrderList(List<Order> list) throws Exception{
        Date dt = new Date();
        //下单日期
        String orderDate = new SimpleDateFormat("yyyy-MM-dd").format(dt);
        //当前时间作为订单编号
        long currentTime = dt.getTime();
        //加入订单号和下单时间
        list.forEach(order -> {
            order.setOrderCode(currentTime+"");
            order.setOrderDate(orderDate);
        });
        for (Order order : list ) {
            //插入操作
            int i = orderMapper.insertSelective(order);
            //根据商品code查询所有入库记录(有序，第一条是最早入库的)
            List<Stock> stocks = stockMapper.selectByGoodsCode(order.getGoodsCode());
            //当前商品总数
            int allCount = stocks.stream().mapToInt(Stock::getStockMargin).sum();
            //判断购买数量是否超过总数
            if(order.getGoodsNum()>allCount){
                throw new RuntimeException("购买数量异常，请确认");
            }
            /*
                循环遍历入库记录，如果库存大于0则获取当前入库记录的 code 和商品code
             */

            //获取当前商品的购买数量
            int goodsNum = order.getGoodsNum();
            //执行队列
            List<Map<String,Object>> execList = new ArrayList<>();
            //外部定义执行参数
            Map<String,Object> map = null;

            for (Stock s : stocks ) {
                //如果库存>0
                if (s.getStockMargin()>0){
                    //如果剩余库存 少于购买数量
                    if(s.getStockMargin()<goodsNum){
                        map = new HashMap<>();
                        map.put("stockCode",s.getStockCode());
                        map.put("goodsCode",order.getGoodsCode());
                        map.put("goodsNum",s.getStockMargin());
                        execList.add(map);
                        goodsNum -= s.getStockMargin();
                    }else{
                        map = new HashMap<>();
                        map.put("stockCode",s.getStockCode());
                        map.put("goodsCode",order.getGoodsCode());
                        map.put("goodsNum",goodsNum);
                        execList.add(map);
                        break;
                    }

                }
            }
            //执行
            for (Map m : execList){
                stockMapper.updateByGoodsCodeAndStockCode(m);
            }


        }
        return 0;
    }

    @Override
    public int delOrder(Integer id) {
        return 0;
    }

    @Override
    public int updateOrder(Order Order) {
        return 0;
    }

    @Override
    public Order getOrderById(Integer id) {
        return null;
    }

    @Override
    public Order getOrderByCode(String code) {
        return null;
    }

    @Override
    public List<Order> getAllOrder() {
        return null;
    }
}
