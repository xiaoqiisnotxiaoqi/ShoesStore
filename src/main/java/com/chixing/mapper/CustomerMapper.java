package com.chixing.mapper;

import com.chixing.pojo.Customer;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    /**
     * 判断用户登录的手机号与密码是否正确
     *
     * @param telno    登录手机号（注册时手机号）
     * @param password 登录密码
     * @return 返回登录用户信息，若返回null,表示账户或密码错误
     */

    public Customer checkTelnoAndPwd(@Param("telno") Long telno, @Param("password") String password);
    /**
     * 判断用户登录的邮箱与密码是否正确
     *
     * @param email    登录邮箱（注册时的邮箱）
     * @param loginPwd 登录密码
     * @return 返回登录用户信息，若返回null,表示账户或密码错误
     */
    public Customer checkEmailAndPwd(@Param("email") String email, @Param("loginPwd") String loginPwd);

    /**
     新用户注册
     @param record 需要注册的会员
     @return 返回添加受影响行数
     */
    int regist(Customer record);

    int insertSelective(Customer record);
    //根据用户的id查找所得的信息
    Customer selectByPrimaryKey(Integer custId);

    /**
     * 根据用户的用户名查找用户
     * @param userName 用户名
     * @return  用户对象
     */
    Customer selectByUserName(String userName);

    int updateByPrimaryKeySelective(Customer record);
      /**
      修改用户信息
       @param record 要修改的用户信息
       @return 返回受影响的行数
      */

    int updateByPrimaryKey(Customer record);

    /**
     设置用户密码 ，根据用户ID修改密码
     @param customer 需要设置密码的用户，该对象封装了新密码
     @return 返回修改受影响行数
     */
    public int updatePwd(Customer customer);
    /**
     判断邮箱是否已经注册过
     @param email 验证邮箱是否已经注册
     @return 若该邮箱已经注册，则返回已注册的邮箱，若没有注册过，则返回null
     */
    public String isValidEmail(String email);
    /**
     判断手机号是否已经注册过
     @param telno 验证手机号码是否已经注册
     @return 若该手机号已经注册，则返回已注册的手机号，若没有注册过，则返回null
     */
    public Long isValidTelno(Long telno);

}