package com.chixing.service.impl;

import com.chixing.mapper.*;
import com.chixing.pojo.*;
import com.chixing.service.DetailOfShoes;
import com.chixing.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetailOfShoesImpl implements DetailOfShoes {
    @Override
    public Shoes findShoes(Integer shoesId) {
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesMapper shoesMapper = sqlSession.getMapper(ShoesMapper.class);
        Shoes shoes = shoesMapper.selectByPrimaryKey(shoesId);
        sqlSession.commit();
        sqlSession.close();
        return shoes;
    }

    @Override
    public Category findCategory(Integer categoryId) {
        SqlSession sqlSession = MybatisUtil.getSession();
        CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
        Category category = categoryMapper.selectByPrimaryKey(categoryId);
        sqlSession.commit();
        sqlSession.close();
        return category;
    }

    @Override
    public List<ShoesDetail> findShoesDetail(Integer shoesId) {
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesDetailMapper shoesDetailMapper = sqlSession.getMapper(ShoesDetailMapper.class);
        List<ShoesDetail> shoesDetails = shoesDetailMapper.seleceByShoesId(shoesId);
        sqlSession.commit();
        sqlSession.close();
        return shoesDetails;
    }

    @Override
    public List<ShoesColor> findColorName(Integer shoesId) {
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesColorMapper shoesColorMapper = sqlSession.getMapper(ShoesColorMapper.class);
        List<ShoesColor> shoesColors = shoesColorMapper.queryAllColorByShoesId(shoesId);
        sqlSession.commit();
        sqlSession.close();
        return shoesColors;
    }

    @Override
    public List<ShoesSize> findAllSize(Integer shoesId) {
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesSizeMapper shoesSizeMapper = sqlSession.getMapper(ShoesSizeMapper.class);
        List<ShoesSize> shoesSizes = shoesSizeMapper.queryAllSizeByShoesId(shoesId);
        sqlSession.commit();
        sqlSession.close();
        return shoesSizes;
    }

    @Override
    public List<ShoesImg> findAllImg(Integer shoesId, Integer colorId) {
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesImgMapper mapper = sqlSession.getMapper(ShoesImgMapper.class);
        Map<String,Integer> map = new HashMap<>();
        map.put("shoesId",shoesId);
        map.put("colorId",colorId);
        List<ShoesImg> shoesImgs = mapper.selectAllImgByShoesIdAndColorId(map);
        sqlSession.commit();
        sqlSession.close();
        return shoesImgs;
    }

}
