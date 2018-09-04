package com.chixing.mapper;


import com.chixing.pojo.ShoesDetail;

public interface ShoesDetailMapper {
    int deleteByPrimaryKey(Integer shoesDetailId);

    int insert(ShoesDetail record);

    int insertSelective(ShoesDetail record);

    ShoesDetail selectByPrimaryKey(Integer shoesDetailId);

    int updateByPrimaryKeySelective(ShoesDetail record);

    int updateByPrimaryKey(ShoesDetail record);
}