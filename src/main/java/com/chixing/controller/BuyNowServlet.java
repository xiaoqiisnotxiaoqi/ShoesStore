package com.chixing.controller;

import com.chixing.pojo.ShoesDetail;
import com.chixing.service.impl.BuyNowServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BuyNowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;dcharset=utf-8");
        //token验证


        String colorName = request.getParameter("hidden_color");
        Integer shoesNum = Integer.parseInt(request.getParameter("hidden_num"));
        String shoesSize = request.getParameter("hidden_size");
        String shoesName = request.getParameter("hidden_name");
        //查询出该鞋子
        ShoesDetail shoesDetail = new BuyNowServiceImpl().selectShoes(shoesName,colorName,shoesSize);
        //创建订单
        if(shoesDetail!=null) {
            int a = new BuyNowServiceImpl().establishOrder(shoesDetail, colorName, shoesNum, shoesSize);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
