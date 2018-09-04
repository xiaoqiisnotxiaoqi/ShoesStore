package com.chixing.mapper;



import com.chixing.pojo.ShoesSize;

import java.util.List;

public interface ShoesSizeMapper {
    int deleteByPrimaryKey(Integer shoesSizeId);

    int insert(ShoesSize record);

    int insertSelective(ShoesSize record);

    ShoesSize selectByPrimaryKey(Integer shoesSizeId);

    int updateByPrimaryKeySelective(ShoesSize record);

    int updateByPrimaryKey(ShoesSize record);

    /**
     @param shoesId 指定的鞋子ID
     @return 返回指定鞋子的所有尺码
     */
    List<ShoesSize> queryAllSizeByShoesId(Integer shoesId);
}