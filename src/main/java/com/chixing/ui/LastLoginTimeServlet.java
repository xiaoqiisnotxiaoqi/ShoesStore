package com.chixing.ui;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;


public class LastLoginTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;dcharset=utf-8");

        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR );
        int month = now.get(Calendar.MONTH )+1;
        int day = now.get(Calendar.DAY_OF_MONTH );
        int hour = now.get(Calendar.HOUR_OF_DAY );
        int minute = now.get(Calendar.MINUTE );
        int second = now.get(Calendar.SECOND );
        String nowTime = year+"年" +month+"月" +day+"日" +hour+":" +minute+":" +second;
        Cookie c1 = new Cookie("lsatTime",nowTime);

        c1.setMaxAge(10 * 60);

        response.addCookie(c1);
        response.getWriter().write("save ok");

        Cookie[] cookies = request.getCookies();
        if (cookies!=null){
            for (Cookie c:cookies) {
                if (c.getName().equals("lsatTime")) {
                    response.getWriter().write("上次登陆时间是"+ c.getValue());
                }
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
