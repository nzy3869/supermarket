package com.wyp.springboot.supermarket.controller;

import com.wyp.springboot.supermarket.pojo.Stock;
import com.wyp.springboot.supermarket.service.StockService;
import com.wyp.springboot.supermarket.util.Constants;
import com.wyp.springboot.supermarket.util.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    /**
     * 添加入库信息
     * @param stock .
     * @return .
     */
    @RequestMapping("/addStock")
    public ResultMsg addStock(Stock stock){
        //入库编号
        String code = this.generateStockCode(stock);
        if(code == null){
            return new ResultMsg(null,Constants.ADD_FAIL,ResultMsg.RESULT_FAIL);
        }
        stock.setStockCode(code);
        //添加入库时间
        stock.setCreateDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        //添加录入人员code
            //...

        int i = stockService.addStock(stock);
        if(i==0){
            return new ResultMsg(null,Constants.ADD_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.ADD_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 删除入库信息
     * @param id Stock id
     * @return .
     */
    @RequestMapping("/delStock")
    public ResultMsg delStock(Integer id){
        int i = stockService.delStock(id);
        if(i==0){
            return new ResultMsg(null,Constants.DEL_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.DEL_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 更改入库信息
     * @param stock .
     * @return .
     */
    @RequestMapping("/updateStock")
    public ResultMsg updateStock(Stock stock){
        //入库编号
        String code = this.generateStockCode(stock);
        if(code == null){
            return new ResultMsg(null,Constants.ADD_FAIL,ResultMsg.RESULT_FAIL);
        }
        stock.setStockCode(code);

        int i = stockService.updateStock(stock);
        if(i==0){
            return new ResultMsg(null,Constants.UPDATE_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.UPDATE_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得入库信息 by id
     * @param id .
     * @return .
     */
    @RequestMapping("/getStockById")
    public ResultMsg getStockById(Integer id){
        Stock stock = stockService.getStockById(id);
        if(stock==null){
            return new ResultMsg(null,Constants.REQUEST_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.REQUEST_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得ALl入库信息
     * @return .
     */
    @RequestMapping("/getAllStock")
    public ResultMsg getAllStock(){
        List<Stock> list = stockService.getAllStock();
        if(list.size()==0){
            return new ResultMsg(null,Constants.REQUEST_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(list,Constants.REQUEST_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 生成入库信息编号
     * @return
     */
    private String generateStockCode(Stock stock){
        if(stock.getSupplierId()==null){
            return null;
        }
        StringBuffer sb = new StringBuffer();
        sb.append(new SimpleDateFormat("yyyyMMdd").format(new Date()));
        sb.append(stock.getSupplierId()+"");
        return sb.toString();
    }

}
