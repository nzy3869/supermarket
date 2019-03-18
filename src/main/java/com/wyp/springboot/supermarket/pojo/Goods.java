package com.wyp.springboot.supermarket.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * tb_goods
 * @author 
 */
@Data
public class Goods implements Serializable {
    private Integer id;
    /**
     * 商品编号
     */
    private String goodsCode;
    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品类型id
     */
    private String goodsTypeId;

    /**
     * 商品类型名
     */
    private String goodsTypeName;

    /**
     * 售价
     */
    private Integer salePrice;

    /**
     * 图片地址
     */
    private String picurl;

    /**
     * 是否上架: 0:下架 1:上架
     */
    private Integer state;


    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    private static final long serialVersionUID = 1L;




}