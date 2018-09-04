package com.chixing.mapper;


import com.chixing.pojo.Cart;
import com.chixing.pojo.ShoesDetail;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    int deleteByPrimaryKey(Integer cartId);

    /**
     @param shoesDetail 要从购物车中删除的鞋对象
     @param custId 当前用户ID
     @return 返回受影响行数
     */
    int delete(@Param("shoesDetail") ShoesDetail shoesDetail, @Param("custId") Integer custId);

    int save(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    /**
     @param shoes_detail_id 要修改的购物车中鞋ID
     @param custId 当前用户ID
     @param count 购物车中该鞋子的数量
     @return 返回受影响行数
     */
    int updateCount(@Param("shoes_detail_id") Integer shoes_detail_id, @Param("custId") Integer custId, @Param("count") Integer count);
}