package com.wyp.springboot.supermarket.controller;

import com.wyp.springboot.supermarket.pojo.Employee;
import com.wyp.springboot.supermarket.service.EmployeeService;
import com.wyp.springboot.supermarket.util.Constants;
import com.wyp.springboot.supermarket.util.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 员工接口
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 添加员工
     *
     * @param employee .
     * @return .
     */
    @RequestMapping("/addEmp")
    public ResultMsg addEmployee(Employee employee) {
        String empNum = this.generateEmpNum();
        employee.setEmployeeCode(empNum);
        int i = employeeService.addEmployee(employee);
        if (i == 0) {
            return new ResultMsg(null, Constants.ADD_FAIL, ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null, Constants.ADD_SUCCESS, ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 删除员工
     *
     * @param id 员工id
     * @return .
     */
    @RequestMapping("/delEmp")
    public ResultMsg delEmployee(Integer id) {
        int i = employeeService.delEmployee(id);
        if (i == 0) {
            return new ResultMsg(null, Constants.DEL_FAIL, ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null, Constants.DEL_SUCCESS, ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 更改员工
     *
     * @param employee .
     * @return .
     */
    @RequestMapping("/updateEmp")
    public ResultMsg updateEmployee(Employee employee) {
        int i = employeeService.updateEmployee(employee);
        if (i == 0) {
            return new ResultMsg(null, Constants.UPDATE_FAIL, ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null, Constants.UPDATE_SUCCESS, ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得员工ById
     *
     * @param id .
     * @return .
     */
    @RequestMapping("/getEmpById")
    public ResultMsg getEmployeeById(Integer id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee == null) {
            return new ResultMsg(null, Constants.REQUEST_FAIL, ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(employee, Constants.REQUEST_SUCCESS, ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 获得ALl员工
     *
     * @return .
     */
    @RequestMapping("/getAllEmp")
    public ResultMsg getAllEmployee() {
        List<Employee> list = employeeService.getAllEmployee();
        if (list.size() == 0) {
            return new ResultMsg(null, Constants.REQUEST_FAIL, ResultMsg.RESULT_FAIL);
        }
        list.forEach(employee -> employee.setEmployeePassword(null));
        return new ResultMsg(list, Constants.REQUEST_SUCCESS, ResultMsg.RESULT_SUCCESS);
    }

    /**
     * 生成员工编号
     */
    private String generateEmpNum() {
        StringBuffer num = new StringBuffer();
        //获取当前人数
        int employeeCount = employeeService.getEmployeeCount();
        employeeCount += 1;
        num.append(new SimpleDateFormat("yyyyMMdd").format(new Date()));
        if(employeeCount<10){
            num.append("00"+employeeCount);
        }else if(employeeCount>10&&employeeCount<100){
            num.append("0"+employeeCount);
        }else {
            num.append(""+employeeCount);
        }
        return num.toString();
    }
}
