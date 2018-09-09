package com.chixing.controller;

import com.chixing.pojo.Customer;
import com.chixing.service.impl.UpdatePersonalInformationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdatePersonalInformationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String clientToken = request.getParameter("token");
        System.out.println("客户端的token:" + clientToken);

        if(isValidToken(clientToken,request) ) {
            //1.接受用户名和年龄
            String username = request.getParameter("username").trim();
            request.setAttribute("username",username);
            Integer strAge = Integer.parseInt(request.getParameter("age").trim());
            request.setAttribute("age",strAge);
            //3.Customer调用service
            //4.判断用户名是否已被注册
            UpdatePersonalInformationServiceImpl updatePersonalInformationService = new UpdatePersonalInformationServiceImpl();
            Customer customer = updatePersonalInformationService.UpdateByCustomerName(username);
            /*Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");*/
            if (customer != null) {
                request.setAttribute("errormsg", "用户名以被注册");
                System.out.println(request.getAttribute("errormsg"));
                request.getRequestDispatcher("/customerCenter").forward(request,response);
                return;
            }

            Integer i = updatePersonalInformationService.UpdatePersonalData(123, username, strAge);
            if (i == 1) {
                request.setAttribute("success", "修改成功");
                request.getSession().removeAttribute("token");
            }
        }else {
            request.setAttribute("tokenTest", "请勿重复提交表单");
            request.getRequestDispatcher("/customerCenter").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }


    private boolean isValidToken(String clientToken,HttpServletRequest req ){
        String serverToken = (String)req.getSession().getAttribute("token");
        if(serverToken ==null)
            return false;// 表示 服务器端的token已经删除了，这次是重复提交
        else if (!clientToken.equals(serverToken))
            return false;// 表示 服务器端的token与客户端不一致，这次是重复提交
        else
            return true;
    }
}
