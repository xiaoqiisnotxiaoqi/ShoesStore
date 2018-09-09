package com.chixing.service.impl;

import com.chixing.mapper.MyOrderMapper;
import com.chixing.mapper.OrderDetailMapper;
import com.chixing.mapper.ShoesDetailMapper;
import com.chixing.pojo.MyOrder;
import com.chixing.pojo.OrderDetail;
import com.chixing.pojo.ShoesDetail;
import com.chixing.service.BuyNowService;
import com.chixing.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.core.config.Order;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BuyNowServiceImpl implements BuyNowService {
    @Override
    public ShoesDetail selectShoes(String shoesName, String clodrName, String shoesSize) {
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesDetailMapper mapper =  sqlSession.getMapper(ShoesDetailMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("colorName",clodrName);
        map.put("shoesName",shoesName);
        map.put("shoesSize",shoesSize);
        ShoesDetail shoesDetail =  mapper.selectBySizeAndColorAndShoesName(map);
        sqlSession.commit();
        sqlSession.close();
        return shoesDetail;
    }


    @Override
    public int establishOrder(ShoesDetail shoesDetail,String colorName,Integer shoesNum,String shoesSize) {
        OrderDetail orderDetail = new OrderDetail(4,shoesDetail.getShoesDetailId(),shoesNum,colorName,shoesSize);
        MyOrder order = new MyOrder(4,"20189151451",123,new Date(),null,null,1);
        SqlSession sqlSession = MybatisUtil.getSession();
        MyOrderMapper myOrderMapper = sqlSession.getMapper(MyOrderMapper.class);
        Integer integer = myOrderMapper.saveSelective(order);
        OrderDetailMapper orderDetailMapper = sqlSession.getMapper(OrderDetailMapper.class);
        Integer integer1 = orderDetailMapper.saveDetails(orderDetail);
        sqlSession.commit();
        sqlSession.close();
        return integer+integer1;
    }
}
