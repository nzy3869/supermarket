package com.wyp.springboot.supermarket.service.impl;

import com.wyp.springboot.supermarket.dao.EmployeeMapper;
import com.wyp.springboot.supermarket.pojo.Employee;
import com.wyp.springboot.supermarket.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.insertSelective(employee);
    }

    @Override
    public int delEmployee(Integer id) {
        return employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateByPrimaryKeySelective(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.selectAllEmployee();
    }

    @Override
    public int getEmployeeCount() {
        return employeeMapper.getEmployeeCount();
    }
}
