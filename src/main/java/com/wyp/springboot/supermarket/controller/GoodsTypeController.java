package com.wyp.springboot.supermarket.controller;

import com.wyp.springboot.supermarket.pojo.GoodsType;
import com.wyp.springboot.supermarket.service.GoodsTypeService;
import com.wyp.springboot.supermarket.util.Constants;
import com.wyp.springboot.supermarket.util.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品类别接口
 */
@RestController
@RequestMapping("/goodsType")
public class GoodsTypeController {

    @Autowired
    private GoodsTypeService goodsTypeService;

    /**
     * 添加商品类别
     * @param goodsType .
     * @return .
     */
    @RequestMapping("/addGoodsType")
    public ResultMsg addGoodsType(GoodsType goodsType){
        int i = goodsTypeService.addGoodsType(goodsType);
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
    @RequestMapping("/delGoodsType")
    public ResultMsg delGoodsType(Integer id){
        int i = goodsTypeService.delGoodsType(id);
        if(i==0){
            return new ResultMsg(null,Constants.DEL_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.DEL_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 更改商品信息
     * @param goodsType .
     * @return .
     */
    @RequestMapping("/updateGoodsType")
    public ResultMsg updateGoodsType(GoodsType goodsType){
        int i = goodsTypeService.updateGoodsType(goodsType);
        if(i==0){
            return new ResultMsg(null,Constants.UPDATE_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.UPDATE_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得商品信息 by id
     * @param id .
     * @return .
     */
    @RequestMapping("/getGoodsTypeById")
    public ResultMsg getGoodsTypeById(Integer id){
        GoodsType goodsType = goodsTypeService.getGoodsTypeById(id);
        if(goodsType==null){
            return new ResultMsg(null,Constants.REQUEST_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.REQUEST_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得ALl商品信息
     * @return .
     */
    @RequestMapping("/getAllGoodsType")
    public ResultMsg getAllGoodsType(){
        List<GoodsType> list = goodsTypeService.getAllGoodsType();
        if(list.size()==0){
            return new ResultMsg(null,Constants.REQUEST_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(list,Constants.REQUEST_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得ALl启用商品信息
     * @return .
     */
    @RequestMapping("/getAllEnabledGoodsType")
    public ResultMsg getAllEnabledGoodsType(){
        List<GoodsType> list = goodsTypeService.getAllEnabledGoodsType();
        if(list.size()==0){
            return new ResultMsg(null,Constants.REQUEST_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(list,Constants.REQUEST_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }
}
