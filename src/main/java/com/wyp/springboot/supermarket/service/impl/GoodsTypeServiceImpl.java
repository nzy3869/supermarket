package com.wyp.springboot.supermarket.service.impl;

import com.wyp.springboot.supermarket.dao.GoodsTypeMapper;
import com.wyp.springboot.supermarket.pojo.GoodsType;
import com.wyp.springboot.supermarket.service.GoodsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Resource
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public int addGoodsType(GoodsType goodsType) {
        return goodsTypeMapper.insertSelective(goodsType);
    }

    @Override
    public int delGoodsType(Integer id) {
        return goodsTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateGoodsType(GoodsType goodsType) {
        return goodsTypeMapper.updateByPrimaryKeySelective(goodsType);
    }

    @Override
    public GoodsType getGoodsTypeById(Integer id) {
        return goodsTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GoodsType> getAllGoodsType() {
        return goodsTypeMapper.selectAllGoodsType();
    }

    @Override
    public List<GoodsType> getAllEnabledGoodsType() {
        return goodsTypeMapper.selectAllEnabledGoodsType();
    }
}
