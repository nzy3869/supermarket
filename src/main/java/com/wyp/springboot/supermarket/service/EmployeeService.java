package com.wyp.springboot.supermarket.service;

import com.wyp.springboot.supermarket.pojo.Employee;

import java.util.List;

/**
 * 员工接口
 */
public interface EmployeeService {

    int addEmployee(Employee employee);
    int delEmployee(Integer id);
    int updateEmployee(Employee employee);
    Employee getEmployeeById(Integer id);
    List<Employee> getAllEmployee();
    int getEmployeeCount();

}
