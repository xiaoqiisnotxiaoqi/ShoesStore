package com.chixing.mapper;


import com.chixing.pojo.ReceiveAddress;

public interface ReceiveAddressMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(ReceiveAddress record);

    int insertSelective(ReceiveAddress record);

    ReceiveAddress selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(ReceiveAddress record);

    int updateByPrimaryKey(ReceiveAddress record);
}