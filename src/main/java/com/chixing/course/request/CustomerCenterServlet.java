package com.chixing.course.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomerCenterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获得到客户机中相关的信息
        StringBuffer requestURL = request.getRequestURL();
         String query = request.getQueryString();

        // getParameter 只接收url后面的参数 + form表单中的参数
        //获取用户表单中的 username和age
         String username = request.getParameter("username");



         String age = request.getParameter("age");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
