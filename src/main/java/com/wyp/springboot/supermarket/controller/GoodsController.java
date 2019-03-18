package com.wyp.springboot.supermarket.controller;

import com.wyp.springboot.supermarket.pojo.Goods;
import com.wyp.springboot.supermarket.service.GoodsService;
import com.wyp.springboot.supermarket.util.Constants;
import com.wyp.springboot.supermarket.util.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品信息接口
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 添加商品信息
     * @param goods .
     * @return .
     */
    @RequestMapping("/addGoods")
    public ResultMsg addGoods(Goods goods){
        int i = goodsService.addGoods(goods);
        if(i==0){
            return new ResultMsg(null,Constants.ADD_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.ADD_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 删除商品类别
     * @param id Goods id
     * @return .
     */
    @RequestMapping("/delGoods")
    public ResultMsg delGoods(Integer id){
        int i = goodsService.delGoods(id);
        if(i==0){
            return new ResultMsg(null,Constants.DEL_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.DEL_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 更改商品信息
     * @param goods .
     * @return .
     */
    @RequestMapping("/updateGoods")
    public ResultMsg updateGoods(Goods goods){
        int i = goodsService.updateGoods(goods);
        if(i==0){
            return new ResultMsg(null,Constants.UPDATE_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.UPDATE_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得商品信息 by id
     * @param code .
     * @return .
     */
    @RequestMapping("/getGoodsByCode")
    public ResultMsg getGoodsByCode(String code){
        Goods goods = goodsService.getGoodsByCode(code);
        if(goods==null){
            return new ResultMsg(null,Constants.REQUEST_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(goods,Constants.REQUEST_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得ALl商品信息
     * @return .
     */
    @RequestMapping("/getAllGoods")
    public ResultMsg getAllGoods(){
        List<Goods> list = goodsService.getAllGoods();
        if(list.size()==0){
            return new ResultMsg(null,Constants.REQUEST_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(list,Constants.REQUEST_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得ALl商品信息
     * @return .
     */
    @RequestMapping("/getAllEnabledGoods")
    public ResultMsg getAllEnabledGoods(){
        List<Goods> list = goodsService.getAllEnabledGoods();
        if(list.size()==0){
            return new ResultMsg(null,Constants.REQUEST_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(list,Constants.REQUEST_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }
}
