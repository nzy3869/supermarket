package com.wyp.springboot.supermarket.dao;

import com.wyp.springboot.supermarket.pojo.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);
    Goods selectByCode(String code);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> selectAllGoods();

    List<Goods> selectAllEnabledGoods();
}