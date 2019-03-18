package com.wyp.springboot.supermarket.service;

import com.wyp.springboot.supermarket.pojo.Goods;
import com.wyp.springboot.supermarket.pojo.Supplier;

import java.util.List;

/**
 * 供货商接口
 */
public interface SupplierService {
    int addSupplier(Supplier supplier);
    int delSupplier(Integer id);
    int updateSupplier(Supplier supplier);
    Supplier getSupplierById(Integer id);
    List<Supplier> getAllSupplier();

    List<Supplier> getAllEnabledSupplier();
}
