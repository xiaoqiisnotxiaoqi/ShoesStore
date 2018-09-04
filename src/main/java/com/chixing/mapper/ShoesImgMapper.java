package com.chixing.mapper;


import com.chixing.pojo.ShoesImg;

public interface ShoesImgMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(ShoesImg record);

    int insertSelective(ShoesImg record);

    ShoesImg selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(ShoesImg record);

    int updateByPrimaryKey(ShoesImg record);
}