package com.chixing.controller;

import com.chixing.pojo.MyOrder;
import com.chixing.pojo.ShoesDetail;
import com.chixing.service.impl.BuyNowServiceImpl;
import com.chixing.service.impl.FindAllOrderImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Add2Cart extends HttpServlet{
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
        //添加到购物车
        FindAllOrderImpl findAllOrder = new FindAllOrderImpl();
        List<MyOrder> myOrders = findAllOrder.FindMyOrder(1);

        for (MyOrder m:myOrders){
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
