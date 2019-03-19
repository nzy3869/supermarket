package com.wyp.springboot.supermarket.service;

import com.wyp.springboot.supermarket.pojo.Order;

import java.util.List;

public interface OrderService {

    int addOrder(Order Order);
    int addOrderList(List<Order> Order) throws Exception;
    int delOrder(Integer id);
    int updateOrder(Order Order);
    Order getOrderById(Integer id);
    Order getOrderByCode(String code);
    List<Order> getAllOrder();
}
