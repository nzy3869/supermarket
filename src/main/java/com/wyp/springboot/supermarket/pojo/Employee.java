package com.wyp.springboot.supermarket.pojo;

import java.io.Serializable;

/**
 * tb_employee
 * @author 
 */
public class Employee implements Serializable {
    private Integer id;

    /**
     * 员工编号
     */
    private String employeeCode;

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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(Integer employeeSex) {
        this.employeeSex = employeeSex;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeTel() {
        return employeeTel;
    }

    public void setEmployeeTel(String employeeTel) {
        this.employeeTel = employeeTel;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeEntryDate() {
        return employeeEntryDate;
    }

    public void setEmployeeEntryDate(String employeeEntryDate) {
        this.employeeEntryDate = employeeEntryDate;
    }

    public String getEmployeeQuitDate() {
        return employeeQuitDate;
    }

    public void setEmployeeQuitDate(String employeeQuitDate) {
        this.employeeQuitDate = employeeQuitDate;
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
        Employee other = (Employee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEmployeeCode() == null ? other.getEmployeeCode() == null : this.getEmployeeCode().equals(other.getEmployeeCode()))
            && (this.getEmployeeName() == null ? other.getEmployeeName() == null : this.getEmployeeName().equals(other.getEmployeeName()))
            && (this.getEmployeeSex() == null ? other.getEmployeeSex() == null : this.getEmployeeSex().equals(other.getEmployeeSex()))
            && (this.getEmployeeAge() == null ? other.getEmployeeAge() == null : this.getEmployeeAge().equals(other.getEmployeeAge()))
            && (this.getEmployeeTel() == null ? other.getEmployeeTel() == null : this.getEmployeeTel().equals(other.getEmployeeTel()))
            && (this.getEmployeeAddress() == null ? other.getEmployeeAddress() == null : this.getEmployeeAddress().equals(other.getEmployeeAddress()))
            && (this.getEmployeeEntryDate() == null ? other.getEmployeeEntryDate() == null : this.getEmployeeEntryDate().equals(other.getEmployeeEntryDate()))
            && (this.getEmployeeQuitDate() == null ? other.getEmployeeQuitDate() == null : this.getEmployeeQuitDate().equals(other.getEmployeeQuitDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEmployeeCode() == null) ? 0 : getEmployeeCode().hashCode());
        result = prime * result + ((getEmployeeName() == null) ? 0 : getEmployeeName().hashCode());
        result = prime * result + ((getEmployeeSex() == null) ? 0 : getEmployeeSex().hashCode());
        result = prime * result + ((getEmployeeAge() == null) ? 0 : getEmployeeAge().hashCode());
        result = prime * result + ((getEmployeeTel() == null) ? 0 : getEmployeeTel().hashCode());
        result = prime * result + ((getEmployeeAddress() == null) ? 0 : getEmployeeAddress().hashCode());
        result = prime * result + ((getEmployeeEntryDate() == null) ? 0 : getEmployeeEntryDate().hashCode());
        result = prime * result + ((getEmployeeQuitDate() == null) ? 0 : getEmployeeQuitDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", employeeCode=").append(employeeCode);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", employeeSex=").append(employeeSex);
        sb.append(", employeeAge=").append(employeeAge);
        sb.append(", employeeTel=").append(employeeTel);
        sb.append(", employeeAddress=").append(employeeAddress);
        sb.append(", employeeEntryDate=").append(employeeEntryDate);
        sb.append(", employeeQuitDate=").append(employeeQuitDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}