package com.chixing.mapper;


import com.chixing.pojo.ShoesDetail;

import java.util.Map;

public interface ShoesDetailMapper {
    int deleteByPrimaryKey(Integer shoesDetailId);

    int insert(ShoesDetail record);

    int insertSelective(ShoesDetail record);

    ShoesDetail selectByPrimaryKey(Integer shoesDetailId);

    ShoesDetail selectBySizeAndColorAndShoesName(Map<String,Object> map);

    int updateByPrimaryKeySelective(ShoesDetail record);

    int updateByPrimaryKey(ShoesDetail record);
}