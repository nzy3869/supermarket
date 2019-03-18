package com.wyp.springboot.supermarket.pojo;

import java.io.Serializable;

/**
 * tb_supplier
 * @author 
 */
public class Supplier implements Serializable {
    private Integer id;

    /**
     * 供货商名称
     */
    private String supplierName;

    /**
     * 供货商地址
     */
    private String supplierAddress;

    /**
     * 供货商联系人
     */
    private String supplierPerson;

    /**
     * 供货商电话
     */
    private String supplierTel;

    /**
     * 合作状态 0: 未合作 1: 合作
     */
    private Integer state;

    private static final long serialVersionUID = 1L;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierPerson() {
        return supplierPerson;
    }

    public void setSupplierPerson(String supplierPerson) {
        this.supplierPerson = supplierPerson;
    }

    public String getSupplierTel() {
        return supplierTel;
    }

    public void setSupplierTel(String supplierTel) {
        this.supplierTel = supplierTel;
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
        Supplier other = (Supplier) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
            && (this.getSupplierAddress() == null ? other.getSupplierAddress() == null : this.getSupplierAddress().equals(other.getSupplierAddress()))
            && (this.getSupplierPerson() == null ? other.getSupplierPerson() == null : this.getSupplierPerson().equals(other.getSupplierPerson()))
            && (this.getSupplierTel() == null ? other.getSupplierTel() == null : this.getSupplierTel().equals(other.getSupplierTel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
        result = prime * result + ((getSupplierAddress() == null) ? 0 : getSupplierAddress().hashCode());
        result = prime * result + ((getSupplierPerson() == null) ? 0 : getSupplierPerson().hashCode());
        result = prime * result + ((getSupplierTel() == null) ? 0 : getSupplierTel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", supplierAddress=").append(supplierAddress);
        sb.append(", supplierPerson=").append(supplierPerson);
        sb.append(", supplierTel=").append(supplierTel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}