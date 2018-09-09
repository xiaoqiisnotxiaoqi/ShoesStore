package com.chixing.service.impl;

import com.chixing.mapper.CustomerMapper;
import com.chixing.pojo.Customer;
import com.chixing.service.UpdatePersonalInformationService;
import com.chixing.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class UpdatePersonalInformationServiceImpl implements UpdatePersonalInformationService {


    @Override
    public Integer UpdatePersonalData(Integer customerId,String username,Integer age) {
        Customer customer =null;
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        customer = customerMapper.selectByPrimaryKey(123);
        CustomerMapper customerMapper2 = sqlSession.getMapper(CustomerMapper.class);
        customer.setCustAge(age);
        customer.setCustName(username);
        Integer integer = customerMapper2.updateByPrimaryKeySelective(customer);
        sqlSession.commit();
        sqlSession.close();
         return integer;

    }

    @Override
    public Customer UpdateByCustomerName(String customerName) {
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = customerMapper.selectByUserName(customerName);
        sqlSession.commit();
        sqlSession.close();
        return customer;
    }


}
