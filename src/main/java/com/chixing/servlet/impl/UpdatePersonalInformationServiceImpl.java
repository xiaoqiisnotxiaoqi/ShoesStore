package com.chixing.servlet.impl;

import com.chixing.mapper.CustomerMapper;
import com.chixing.pojo.Customer;
import com.chixing.servlet.UpdatePersonalInformationService;
import com.chixing.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class UpdatePersonalInformationServiceImpl implements UpdatePersonalInformationService {


    @Override
    public Integer UpdatePersonalData(Integer customerId,String username,Integer age) {
        Customer customer =null;
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        customer = customerMapper.selectByPrimaryKey(customerId);
        customer.setCustAge(age);
        customer.setCustName(username);
        Integer integer = customerMapper.updateByPrimaryKeySelective(customer);
         return integer;
    }
}
