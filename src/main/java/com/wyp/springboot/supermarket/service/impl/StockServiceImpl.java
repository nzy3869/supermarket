package com.wyp.springboot.supermarket.service.impl;

import com.wyp.springboot.supermarket.dao.StockMapper;
import com.wyp.springboot.supermarket.pojo.Stock;
import com.wyp.springboot.supermarket.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockMapper stockMapper;

    @Override
    public int addStock(Stock stock) {
        return stockMapper.insertSelective(stock);
    }

    @Override
    public int delStock(Integer id) {
        return stockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateStock(Stock stock) {
        return stockMapper.updateByPrimaryKeySelective(stock);
    }

    @Override
    public Stock getStockById(Integer id) {
        return stockMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Stock> getAllStock() {
        return stockMapper.selectAllStock();
    }
}
