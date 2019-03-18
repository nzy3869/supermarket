package com.wyp.springboot.supermarket.service;

import com.wyp.springboot.supermarket.pojo.GoodsType;

import java.util.List;

/**
 * 商品类型
 */
public interface GoodsTypeService {
    int addGoodsType(GoodsType goodsType);
    int delGoodsType(Integer id);
    int updateGoodsType(GoodsType goodsType);
    GoodsType getGoodsTypeById(Integer id);
    List<GoodsType> getAllGoodsType();

    /**
     * 获取所有启用的商品类型
     * @return
     */
    List<GoodsType> getAllEnabledGoodsType();
}
