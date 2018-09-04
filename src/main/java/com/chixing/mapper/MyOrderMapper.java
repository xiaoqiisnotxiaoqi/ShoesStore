package com.chixing.mapper;


import com.chixing.pojo.MyOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    /**
     @param order 添加的新订单对象
     @return 返回受影响行数
     */
    int save(MyOrder order);

    int saveSelective(MyOrder record);

    MyOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(MyOrder record);

    int updateByPrimaryKey(MyOrder record);

    /**
     @param custId 当前用户的ID
     @return 返回当前账户的所有订单列表
     */
    List<MyOrder> queryAll(Integer custId);

    /**
     @param shoesName 要查询的鞋的名称（模糊查询）
     @param custId 当前用户的ID
     @return 返回当前用户的要查询的订单列表
     */
    List<MyOrder> queryByShoesName(@Param("shoesName") String shoesName, @Param("custId") Integer custId);

    /**
     @param orderNumber 要查询的鞋编号（模糊查询）
     @param custId 当前用户的ID
     @return 返回当前用户的要查询指定的订单详情
     */
    List<MyOrder> queryById(@Param("orderNumber") Integer orderNumber, @Param("custId") Integer custId);


    /**
     @param status  修改订单状态
     @param orderId  指定的要修改的订单ID
     @return  返回受影响行数
     */
    public   int updateStatus(@Param("status") Integer status, @Param("orderId") Integer orderId);
}