package com.wyp.springboot.supermarket.controller;

import com.wyp.springboot.supermarket.pojo.Supplier;
import com.wyp.springboot.supermarket.service.SupplierService;
import com.wyp.springboot.supermarket.util.Constants;
import com.wyp.springboot.supermarket.util.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 供货商接口
 */
@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    /**
     * 添加供货商
     * @param supplier .
     * @return .
     */
    @RequestMapping("/addSupplier")
    public ResultMsg addSupplier(Supplier supplier){
        int i = supplierService.addSupplier(supplier);
        if(i==0){
            return new ResultMsg(null,Constants.ADD_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.ADD_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 删除供货商
     * @param id Supplier id
     * @return .
     */
    @RequestMapping("/delSupplier")
    public ResultMsg delSupplier(Integer id){
        int i = supplierService.delSupplier(id);
        if(i==0){
            return new ResultMsg(null,Constants.DEL_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.DEL_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 更改供货商
     * @param supplier .
     * @return .
     */
    @RequestMapping("/updateSupplier")
    public ResultMsg updateSupplier(Supplier supplier){
        int i = supplierService.updateSupplier(supplier);
        if(i==0){
            return new ResultMsg(null,Constants.UPDATE_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.UPDATE_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得供货商 by id
     * @param id .
     * @return .
     */
    @RequestMapping("/getSupplierById")
    public ResultMsg getSupplierById(Integer id){
        Supplier supplier = supplierService.getSupplierById(id);
        if(supplier==null){
            return new ResultMsg(null,Constants.REQUEST_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null,Constants.REQUEST_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得ALl供货商
     * @return .
     */
    @RequestMapping("/getAllSupplier")
    public ResultMsg getAllSupplier(){
        List<Supplier> list = supplierService.getAllSupplier();
        if(list.size()==0){
            return new ResultMsg(null,Constants.REQUEST_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(list,Constants.REQUEST_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得ALl 合作供货商
     * @return .
     */
    @RequestMapping("/getAllEnabledSupplier")
    public ResultMsg getAllEnabledSupplier(){
        List<Supplier> list = supplierService.getAllEnabledSupplier();
        if(list.size()==0){
            return new ResultMsg(null,Constants.REQUEST_FAIL,ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(list,Constants.REQUEST_SUCCESS,ResultMsg.RESULT_SUCCESS);
    }
}
