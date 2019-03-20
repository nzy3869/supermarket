package com.wyp.springboot.supermarket.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.wyp.springboot.supermarket.service.EmployeeService;
import com.wyp.springboot.supermarket.util.Constants;
import com.wyp.springboot.supermarket.util.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 员工登录接口
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public ResultMsg login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) throws JsonProcessingException {

        try {
            employeeService.login(username,password,session);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultMsg(null, e.getMessage(), ResultMsg.RESULT_FAIL);
        }
        return new ResultMsg(null, "登陆成功", ResultMsg.RESULT_SUCCESS);
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute(Constants.EMPLOYEE_TOKEN);
        return "redirect:/admin/domain";
    }
}
