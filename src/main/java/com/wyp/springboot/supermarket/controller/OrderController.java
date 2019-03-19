package com.wyp.springboot.supermarket.controller;

import com.wyp.springboot.supermarket.pojo.Employee;
import com.wyp.springboot.supermarket.pojo.Order;
import com.wyp.springboot.supermarket.service.OrderService;
import com.wyp.springboot.supermarket.util.Constants;
import com.wyp.springboot.supermarket.util.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 订单控制层接口
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    /**
     * 添加订单
     *
     * @param list .
     * @return .
     */
    @RequestMapping("/addOrder")
    public ResultMsg addOrder(@RequestBody ArrayList<Order> list) {

        try {
            orderService.addOrderList(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultMsg(null, e.getMessage(), ResultMsg.RESULT_FAIL);
        }

        return new ResultMsg(null, "订单完成", ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 删除订单
     *
     * @param id 员工id
     * @return .
     */
    @RequestMapping("/delOrder")
    public ResultMsg delOrder(Integer id) {

        return new ResultMsg(null, Constants.DEL_SUCCESS, ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 更改订单
     *
     * @param employee .
     * @return .
     */
    @RequestMapping("/updateOrder")
    public ResultMsg updateOrder(Employee employee) {

        return new ResultMsg(null, Constants.UPDATE_SUCCESS, ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得订单By code
     *
     * @param code .
     * @return .
     */
    @RequestMapping("/getOrderByCode")
    public ResultMsg getEmployeeById(String code) {

        return new ResultMsg(null, Constants.REQUEST_SUCCESS, ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得ALl订单
     *
     * @return .
     */
    @RequestMapping("/getAllOrder")
    public ResultMsg getAllEmployee() {

        return new ResultMsg(null, Constants.REQUEST_SUCCESS, ResultMsg.RESULT_SUCCESS);
    }




}
