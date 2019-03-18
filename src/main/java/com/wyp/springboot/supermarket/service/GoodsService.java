package com.wyp.springboot.supermarket.service;

import com.wyp.springboot.supermarket.pojo.Goods;

import java.util.List;

/**
 * 商品信息接口
 */
public interface GoodsService {
    int addGoods(Goods goods);
    int delGoods(Integer id);
    int updateGoods(Goods goods);
    Goods getGoodsById(Integer id);
    Goods getGoodsByCode(String code);
    List<Goods> getAllGoods();
    List<Goods> getAllEnabledGoods();
}
