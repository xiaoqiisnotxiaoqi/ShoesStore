package com.chixing.mapper;


import com.chixing.pojo.ShoesImg;

import java.util.List;
import java.util.Map;

public interface ShoesImgMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(ShoesImg record);

    int insertSelective(ShoesImg record);

    ShoesImg selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(ShoesImg record);

    int updateByPrimaryKey(ShoesImg record);

    /**
     @param shooesId 指定的鞋子ID
     @return 返回指定鞋子的所有图片
     */
    public List<ShoesImg> queryAllImgByShooesId(Integer shooesId);


    List<ShoesImg> selectAllImgByShoesIdAndColorId(Map<String,Integer> map);
}