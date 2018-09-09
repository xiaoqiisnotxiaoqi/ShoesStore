package com.chixing.ui;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UpdatePersonalInformationServlet extends HttpServlet {
    private Integer integer = 1;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String tokenStr = getToken();
        session.setAttribute("token",tokenStr);
        request.getRequestDispatcher("/WEB-INF/page/customer_center.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    private String getToken(){
        String str="a"+integer;
        integer++;
       return str;
    }
}
