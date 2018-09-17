package com.chixing.service;

import com.chixing.pojo.*;

import java.util.List;

public interface DetailOfShoes {
    /**
     * 根据鞋子id查找鞋子
     * @param shoesId 鞋子id
     * @return
     */
    public Shoes findShoes(Integer shoesId);

    /**
     * 根据鞋子ID查找鞋子的类别
     * @param categoryId 鞋子的id
     * @return  鞋子的类别
     */
    Category findCategory(Integer categoryId);


    /**
     * 根据鞋子的ID查找鞋子的详情
     * @param shoesId
     * @return
     */
    List<ShoesDetail> findShoesDetail(Integer shoesId);

    /**
     * 根据鞋子的id查找颜色
     * @param shoesId 颜色的id
     * @return 颜色名
     */
    List<ShoesColor> findColorName(Integer shoesId);

    /**
     * 根据鞋子的id查找所有尺码
     * @param shoesId 鞋子id
     * @return 该鞋子的所有的尺码
     */
    List<ShoesSize> findAllSize(Integer shoesId);

    /**
     * 根据鞋子的id和颜色id 查找该y颜色鞋子的所有图片
     * @param shoesId 鞋子id
     * @param colorId 颜色id
     * @return 该颜色鞋子的所有图片
     */
    List<ShoesImg> findAllImg(Integer shoesId,Integer colorId);



}
