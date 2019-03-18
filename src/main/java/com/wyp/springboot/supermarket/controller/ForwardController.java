package com.wyp.springboot.supermarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 转发页面 控制层
 */
@Controller
public class ForwardController {
    @RequestMapping("/admin/domain")
    public String toAdminDomain(){
        return "index";
    }

    /**
     * 欢迎页
     * @return
     */
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    /**
     * 员工管理页
     */
    @RequestMapping("/employeeManagePage")
    public String employeeManagePage(){
        return "employeeManage";
    }

    /**
     * 商品类别管理页
     * @return
     */
    @RequestMapping("/goodsTypeManagePage")
    public String goodsTypeManagePage(){
        return "goodsTypeManage";
    }

    /**
     * 商品信息管理页
     * @return
     */
    @RequestMapping("/goodsManagePage")
    public String goodsManagePage(){
        return "goodsManage";
    }

    /**
     * 供货商管理页
     * @return
     */
    @RequestMapping("/supplierManagePage")
    public String supplierManagePage(){
        return "supplierManage";
    }

    /**
     * 入库管理页
     * @return
     */
    @RequestMapping("/stockManagePage")
    public String stockManagePage(){
        return "stockManage";
    }

}
