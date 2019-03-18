package com.wyp.springboot.supermarket.dao;

import com.wyp.springboot.supermarket.pojo.Stock;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StockMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);

    List<Stock> selectAllStock();
}