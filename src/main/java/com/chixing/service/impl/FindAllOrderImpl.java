package com.chixing.service.impl;

import com.chixing.mapper.MyOrderMapper;
import com.chixing.pojo.MyOrder;
import com.chixing.pojo.OrderDetail;
import com.chixing.service.FindAllOrders;
import com.chixing.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class FindAllOrderImpl implements FindAllOrders {
    @Override
    public List<MyOrder> FindMyOrder(Integer customerId) {
        SqlSession sqlSession = MybatisUtil.getSession();
        MyOrderMapper myOrderMapper = sqlSession.getMapper(MyOrderMapper.class);




        return null;
    }

    @Override
    public List<OrderDetail> findOrderDetail(List<MyOrder> myOrders) {
        return null;
    }
}
