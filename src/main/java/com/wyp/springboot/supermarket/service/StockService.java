package com.wyp.springboot.supermarket.service;

import com.wyp.springboot.supermarket.pojo.Stock;

import java.util.List;

public interface StockService {
    int addStock(Stock stock);
    int delStock(Integer id);
    int updateStock(Stock stock);
    Stock getStockById(Integer id);
    List<Stock> getAllStock();
}
