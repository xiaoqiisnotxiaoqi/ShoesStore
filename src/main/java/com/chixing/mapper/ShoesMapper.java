package com.chixing.mapper;



import com.chixing.pojo.Shoes;

import java.util.List;

public interface ShoesMapper {
    //查询所有鞋子
    List<Shoes> selectAll();

    //根据名字模糊查询
    List<Shoes> selectByName(String name);

    //根据性别查询
    List<Shoes> selectByGender(Integer gender);

    //根据鞋子码数查询
    List<Shoes> selectBySize(Float size);

    /**
     * 根据价格范围查询鞋子
     * @param minPrice  最小价格
     * @param maxPrice  最大价格
     * @return
     */
    List<Shoes> queryByPrice(Float minPrice, Float maxPrice);




    /**根据鞋子的类别查看鞋子信息
     @param categoryId 指定的鞋子类别ID
     @return 返回指定类别中的所有鞋子对象列表
     */
    List<Shoes> queryByCategory(Integer categoryId);

    int deleteByPrimaryKey(Integer shoesId);

    int insert(Shoes record);

    int insertSelective(Shoes record);

    Shoes selectByPrimaryKey(Integer shoesId);

    int updateByPrimaryKeySelective(Shoes record);

    int updateByPrimaryKey(Shoes record);
}