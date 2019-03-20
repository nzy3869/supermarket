package com.wyp.springboot.supermarket.intercept;

import com.wyp.springboot.supermarket.pojo.Employee;
import com.wyp.springboot.supermarket.util.Constants;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Employee employee = (Employee) session.getAttribute(Constants.EMPLOYEE_TOKEN);
        if(employee==null){
            response.setStatus(response.SC_MOVED_TEMPORARILY);
            response.setHeader("Location", "/login");

            return false;
        }

        return true;
    }
}
