package com.chixing.service;


import com.chixing.pojo.Customer;

public interface UpdatePersonalInformationService {
    /**
     * 根据用户ID修改用户名和年龄
     * @param customerId  用户ID
     * @param username 用户名
     * @param age 用户年龄
     * @return 数据库受影响的行数
     */
    public Integer UpdatePersonalData(Integer customerId,String username,Integer age);

    /**
     * 根据用户名是否被占用
     * @param customerName
     * @return
     */
    public Customer UpdateByCustomerName(String customerName);
}
