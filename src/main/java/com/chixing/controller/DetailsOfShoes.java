package com.chixing.controller;


import com.chixing.pojo.*;
import com.chixing.service.impl.DetailOfShoesImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DetailsOfShoes extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("shoesId",10001);
        Integer shoesId = (Integer) request.getAttribute("shoesId");
        //查找鞋子的分类
        DetailOfShoesImpl detailOfShoes = new DetailOfShoesImpl();
        Shoes shoes = detailOfShoes.findShoes(shoesId);
        request.setAttribute("shoesPrice",shoes.getShoesDiscount());
        request.setAttribute("shoesName",shoes.getShoesName());
        Byte shoesGender = shoes.getShoesGender();
                 //得到鞋子适用的性别
        if (shoesGender == 1) {
            request.setAttribute("gender", "女子");
        } else if (shoesGender == 0) {
            request.setAttribute("gender", "男子");
        }else {
            request.setAttribute("gender", "通用型");
        }
                  //得到鞋子的类别
        Integer categoryId = shoes.getCategoryId();
        Category category = detailOfShoes.findCategory(categoryId);
        request.setAttribute("categoryName",category.getCategoryName());
        //查找鞋子的颜色
        List<ShoesColor> shoesColors = detailOfShoes.findColorName(shoesId);
        request.setAttribute("shoesColors",shoesColors);
        //查找鞋子的大小
        List<ShoesSize> shoesSizes = detailOfShoes.findAllSize(shoesId);
        request.setAttribute("shoesSizes",shoesSizes);
        //查找鞋子的图片
        Integer colorId = (Integer) request.getAttribute("hidden_color");

        if (request.getAttribute("hidden_color")== null) {
            colorId = shoesColors.get(0).getShoesColorId();
            List<ShoesImg> shoesImgs = detailOfShoes.findAllImg(shoesId,colorId);
            request.setAttribute("shoesImgs",shoesImgs);
            request.setAttribute("fistImg",shoesImgs.get(0).getImgPath());
        }else{
            List<ShoesImg> shoesImgs = detailOfShoes.findAllImg(shoesId,colorId);
            request.setAttribute("shoesImgs",shoesImgs);
            request.setAttribute("fistImg",shoesImgs.get(0).getImgPath());
        }
        request.getRequestDispatcher("WEB-INF/page/productDetail.jsp").forward(request,response);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
