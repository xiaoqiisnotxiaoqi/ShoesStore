package com.chixing.mapper;


import com.chixing.pojo.ReceiveAddress;

import java.util.List;
import java.util.Map;

public interface ReceiveAddressMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(ReceiveAddress record);

    int insertSelective(ReceiveAddress record);

    ReceiveAddress selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(ReceiveAddress record);

    int updateByPrimaryKey(ReceiveAddress record);

    /**
     * 添加当前用户新收件地址
     *
     @param newAddress 新增的收件地址对象
     @param custId 当前用户ID
     @return 返回受影响行数
     */
    public  int save(ReceiveAddress newAddress,Integer custId);

    /**
     * 删除当前用户的收件地址
     * addressId 要删除的收件地址ID
     * custId 当前用户ID
     @return 返回受影响行数
     */
    public  int delete(Map map);

    /**
     * 修改当前用户收件地址的信息
     *
     @param address 要修改的收件地址对象
     @param custId 当前用户ID
     @return 返回受影响行数
     */
    public  int update(ReceiveAddress address,Integer custId);

    /**
     *  查看当前用户所有收件地址列表
     *
     @param custId 当前用户ID
     @return 返回当前客户所有的
     */
    public List<ReceiveAddress> queryAll(Integer custId);

    /**
     * 设置某一个收件地址为默认地址（只有一个）
     *
     * addressId 要设置为默认收件地址的地址ID
     * custId 当前用户ID
     @return 返回受影响行数
     */
    public  int updateDefaultAddress(Map map);
}