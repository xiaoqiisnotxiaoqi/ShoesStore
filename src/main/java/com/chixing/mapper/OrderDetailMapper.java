package com.chixing.mapper;


import com.chixing.pojo.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer orderId, Integer shoesDetailId);

    /**
     @param orderDetail 添加的新订单详情对象
     @return 返回受影响行数
     */
    int saveDetails(OrderDetail orderDetail);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer orderId, Integer shoesDetailId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);


}