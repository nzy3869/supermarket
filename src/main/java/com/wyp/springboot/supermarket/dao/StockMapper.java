package com.wyp.springboot.supermarket.dao;

import com.wyp.springboot.supermarket.pojo.Stock;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface StockMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);

    List<Stock> selectAllStock();

    /**
     * 根据商品code
     * 查询仓库库存 (有序)
     */
    List<Stock> selectByGoodsCode(String code);

    /**
     * 根据商品code和库存code
     * 修改库存
     * @param map
     * @return
     */
    int updateByGoodsCodeAndStockCode(Map<String,Object> map);
}