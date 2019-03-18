package com.wyp.springboot.supermarket.service.impl;

import com.wyp.springboot.supermarket.dao.GoodsMapper;
import com.wyp.springboot.supermarket.pojo.Goods;
import com.wyp.springboot.supermarket.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public int addGoods(Goods goods) {
        return goodsMapper.insertSelective(goods);
    }

    @Override
    public int delGoods(Integer id) {
        return goodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public Goods getGoodsById(Integer id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public Goods getGoodsByCode(String code) {
        return goodsMapper.selectByCode(code);
    }

    @Override
    public List<Goods> getAllGoods() {
        return goodsMapper.selectAllGoods();
    }

    @Override
    public List<Goods> getAllEnabledGoods() {
        return goodsMapper.selectAllEnabledGoods();
    }
}
