package com.wyp.springboot.supermarket.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * tb_employee
 * @author 
 */
@Data
public class Employee implements Serializable {
    private Integer id;

    /**
     * 员工编号
     */
    private String employeeCode;

    /**
     * 密码
     */
    private String employeePassword;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 员工性别
     */
    private Integer employeeSex;

    /**
     * 员工年龄
     */
    private Integer employeeAge;

    /**
     * 员工电话
     */
    private String employeeTel;

    /**
     * 员工地址
     */
    private String employeeAddress;

    /**
     * 入职时间
     */
    private String employeeEntryDate;

    /**
     * 离职时间
     */
    private String employeeQuitDate;

    /**
     * 员工类型 0:未分配角色 1:收银员 2:入库员 3:管理员
     */
    private Integer employeeType;

    private static final long serialVersionUID = 1L;


}