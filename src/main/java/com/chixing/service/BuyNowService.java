package com.chixing.service;

import com.chixing.pojo.ShoesDetail;

public interface BuyNowService {
    /**
     * 查找欲购买鞋子的详情
     * @param colorName 鞋子颜色
     * @param shoesName 鞋子名
     * @param shoesSize 鞋子尺码
     * @return
     */
    public ShoesDetail selectShoes(String colorName,String shoesName,String shoesSize);

    public int establishOrder(ShoesDetail shoesDetail,String colorName,Integer shoesNum,String shoesSize);
}
