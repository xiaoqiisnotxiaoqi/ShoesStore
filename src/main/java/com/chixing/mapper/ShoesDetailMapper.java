package com.chixing.mapper;


import com.chixing.pojo.ShoesDetail;

import java.util.List;
import java.util.Map;

public interface ShoesDetailMapper {
    int deleteByPrimaryKey(Integer shoesDetailId);

    int insert(ShoesDetail record);

    int insertSelective(ShoesDetail record);

    ShoesDetail selectByPrimaryKey(Integer shoesDetailId);

    /**
     * 根据鞋子尺码，颜色，以及 鞋的名字 查找鞋子详情
     * @param map
     * @return
     */
    ShoesDetail selectBySizeAndColorAndShoesName(Map<String,Object> map);

    int updateByPrimaryKeySelective(ShoesDetail record);

    int updateByPrimaryKey(ShoesDetail record);

    List<ShoesDetail> seleceByShoesId(Integer shoesId);
}