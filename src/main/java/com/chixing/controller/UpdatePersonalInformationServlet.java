package com.chixing.controller;

import com.chixing.mapper.CustomerMapper;
import com.chixing.pojo.Customer;
import com.chixing.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

public class UpdatePersonalInformationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接受用户名和年龄
        String username = request.getParameter("username").trim();
        String strAge = request.getParameter("age").trim();
        //2.判断用户名和年龄是否正确
        //3.Customer调用service
        //4.判断用户名是否已被注册
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = customerMapper.selectByUserName(username);
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        if (username==null){
            request.setAttribute("errormsg","用户名不能为空");
        }else if (customer != null){
            request.setAttribute("errormsg","用户名以被注册");
        }else if(pattern.matcher(strAge).matches()){
            request.setAttribute("errormsg","年龄格式错误");
        }
        Integer intAge = Integer.getInteger(strAge);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
