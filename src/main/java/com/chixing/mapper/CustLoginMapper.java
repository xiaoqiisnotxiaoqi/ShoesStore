package com.chixing.mapper;


import com.chixing.pojo.CustLogin;
import com.chixing.pojo.Customer;

public interface CustLoginMapper {
    int deleteByPrimaryKey(Integer loginId);

    int insert(CustLogin record);

    /**
     * 添加登录记录
     *
     * @param custLogin 用户登录信息对象
     * @return 返回添加受影响的行数
     */
    public int save(CustLogin custLogin);

    int insertSelective(CustLogin record);

    CustLogin selectByPrimaryKey(Integer loginId);

    int updateByPrimaryKeySelective(CustLogin record);

    int updateByPrimaryKey(CustLogin record);

    /**
     * 判断用户登录的邮箱与密码是否正确
     *
     * @param email    登录邮箱（注册时的邮箱）
     * @param loginPwd 登录密码
     * @return 返回登录用户信息，若返回null,表示账户或密码错误
     */
    public Customer checkEmailAndPwd(String email, String loginPwd);
}