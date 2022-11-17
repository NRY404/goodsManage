package com.whut.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录拦截器
 * */
public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();

        if (session.getAttribute("user") != null) { //读取session 中存储的 user对象，根据setAttribute("user",user);
            // 如果user为空，则表明没有登录，此时为 登录逻辑
            return true;
        } else {
            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return false;
        }

    }
}
