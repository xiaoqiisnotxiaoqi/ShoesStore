package com.chixing.mapper;



import com.chixing.pojo.ShoesColor;

import java.util.List;

public interface ShoesColorMapper {
    int deleteByPrimaryKey(Integer shoesColorId);

    int insert(ShoesColor record);

    int insertSelective(ShoesColor record);

    ShoesColor selectByPrimaryKey(Integer shoesColorId);

    int updateByPrimaryKeySelective(ShoesColor record);

    int updateByPrimaryKey(ShoesColor record);

    /**
     @param shoesId 指定的鞋子ID
     @return 返回指定鞋子的所有颜色
     */
    List<ShoesColor> queryAllColorByShoesId(Integer shoesId);
}