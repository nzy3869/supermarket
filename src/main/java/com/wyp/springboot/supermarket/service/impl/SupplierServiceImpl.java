package com.wyp.springboot.supermarket.service.impl;

import com.wyp.springboot.supermarket.dao.SupplierMapper;
import com.wyp.springboot.supermarket.pojo.Supplier;
import com.wyp.springboot.supermarket.service.SupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SupplierServiceImpl implements SupplierService {

    @Resource
    private SupplierMapper supplierMapper;

    @Override
    public int addSupplier(Supplier supplier) {
        return supplierMapper.insertSelective(supplier);
    }

    @Override
    public int delSupplier(Integer id) {
        return supplierMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateSupplier(Supplier supplier) {
        return supplierMapper.updateByPrimaryKeySelective(supplier);
    }

    @Override
    public Supplier getSupplierById(Integer id) {
        return supplierMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Supplier> getAllSupplier() {
        return supplierMapper.selectAllSupplier();
    }

    @Override
    public List<Supplier> getAllEnabledSupplier() {
        return supplierMapper.selectAllEnabledSupplier();
    }
}
