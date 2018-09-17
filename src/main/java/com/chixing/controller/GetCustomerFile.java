package com.chixing.controller;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class GetCustomerFile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userSave(request,response);
    }

    private void userSave(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setHeaderEncoding("UTF-8");
        List<FileItem> items = null;
        try {
            items = upload.parseRequest(request); //获得前台提交过来的信息，两类：文件、form表单

        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        Iterator<FileItem> itr = items.iterator();

        while (itr.hasNext()) {
            FileItem item = itr.next();
            if (item.isFormField()) {
                //是表单数据
                System.out.println(item.getString("utf-8"));
            } else if (!"".equals(item.getName())) {//不是form表单数据而是文件上传
                try {

                    //上传到硬盘的一个绝对路径
                    String filePath = "E:\\Files\\" + item.getName();

                    item.write(new File(filePath));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
