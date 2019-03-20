package com.wyp.springboot.supermarket.service.impl;

import com.wyp.springboot.supermarket.dao.EmployeeMapper;
import com.wyp.springboot.supermarket.pojo.Employee;
import com.wyp.springboot.supermarket.service.EmployeeService;
import com.wyp.springboot.supermarket.util.Constants;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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

    @Override
    public boolean login(String username, String password, HttpSession session) throws Exception {

        Employee employee = employeeMapper.selectByEmployeeCode(username);

        if(employee==null){
            throw new Exception("账号不存在");
        }

        if(!(employee.getEmployeePassword().equals(password))){
            throw new Exception("账号或密码错误");
        }
        employee.setEmployeePassword(null);
        session.setAttribute(Constants.EMPLOYEE_TOKEN,employee);
        return true;
    }
}
