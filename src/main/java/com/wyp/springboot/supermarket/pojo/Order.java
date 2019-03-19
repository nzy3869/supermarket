package com.wyp.springboot.supermarket.pojo;

import java.io.Serializable;

/**
 * tb_order
 * @author 
 */
public class Order implements Serializable {
    private Integer id;

    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 商品编号
     */
    private String goodsCode;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 商品售价
     */
    private Double salePrice;

    /**
     * 实际付款
     */
    private Double realPrice;

    /**
     * 是否打折 0:不打折 1:打折
     */
    private Integer isDiscount;

    /**
     * 下单时间
     */
    private String orderDate;

    /**
     * 收银员编号
     */
    private String employeeCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }

    public Integer getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(Integer isDiscount) {
        this.isDiscount = isDiscount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsNum() == null ? other.getGoodsNum() == null : this.getGoodsNum().equals(other.getGoodsNum()))
            && (this.getSalePrice() == null ? other.getSalePrice() == null : this.getSalePrice().equals(other.getSalePrice()))
            && (this.getRealPrice() == null ? other.getRealPrice() == null : this.getRealPrice().equals(other.getRealPrice()))
            && (this.getIsDiscount() == null ? other.getIsDiscount() == null : this.getIsDiscount().equals(other.getIsDiscount()))
            && (this.getOrderDate() == null ? other.getOrderDate() == null : this.getOrderDate().equals(other.getOrderDate()))
            && (this.getEmployeeCode() == null ? other.getEmployeeCode() == null : this.getEmployeeCode().equals(other.getEmployeeCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsNum() == null) ? 0 : getGoodsNum().hashCode());
        result = prime * result + ((getSalePrice() == null) ? 0 : getSalePrice().hashCode());
        result = prime * result + ((getRealPrice() == null) ? 0 : getRealPrice().hashCode());
        result = prime * result + ((getIsDiscount() == null) ? 0 : getIsDiscount().hashCode());
        result = prime * result + ((getOrderDate() == null) ? 0 : getOrderDate().hashCode());
        result = prime * result + ((getEmployeeCode() == null) ? 0 : getEmployeeCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsNum=").append(goodsNum);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", realPrice=").append(realPrice);
        sb.append(", isDiscount=").append(isDiscount);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", employeeCode=").append(employeeCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}