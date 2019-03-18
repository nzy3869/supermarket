package com.wyp.springboot.supermarket.dao;

import com.wyp.springboot.supermarket.pojo.Supplier;

import java.util.List;

public interface SupplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);

    List<Supplier> selectAllSupplier();

    List<Supplier> selectAllEnabledSupplier();
}