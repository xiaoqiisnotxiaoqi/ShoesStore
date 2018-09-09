package com.chixing.service;

import com.chixing.pojo.Customer;
import com.chixing.pojo.MyOrder;
import com.chixing.pojo.OrderDetail;

import java.util.List;

public interface FindAllOrders{
    /**
     * 找到一个用户的所有的订单
     * @param customerId 用户id
     */
    public List<MyOrder> FindMyOrder(Integer customerId);

    /**
     * 根据订单id，查询到订单的详情
     * @param myOrders
     * @return
     */
    public List<OrderDetail> findOrderDetail(List<MyOrder> myOrders);
}
