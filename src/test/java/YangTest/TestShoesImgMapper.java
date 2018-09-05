package YangTest;

import Util.MybatisUtil;


import com.chixing.mapper.ShoesImgMapper;
import com.chixing.pojo.ShoesImg;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Created with IntelliJ IDEA.
 * @Description:
 * @Author: J41
 * @Date: 2018-08-31
 * @Time: 19:34
 * @Version 1.0
 */
public class TestShoesImgMapper {

    ShoesImg shoesImg=new ShoesImg(1001,10001,"ddddd",1001);

    @Test
    public void deleteByPrimaryKey(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesImgMapper mapper =  sqlSession.getMapper(ShoesImgMapper.class);
        Integer rows = (Integer)  mapper.deleteByPrimaryKey(1001);
        sqlSession.commit();
        MybatisUtil.closeSession();
        System.out.println(rows);
    }
    @Test
    public void insert(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesImgMapper mapper =  sqlSession.getMapper(ShoesImgMapper.class);
        Integer rows = (Integer)  mapper.insert(shoesImg);
        sqlSession.commit();
        MybatisUtil.closeSession();
        System.out.println(rows);
    }

    @Test
    public void updateByPrimaryKey(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesImgMapper mapper =  sqlSession.getMapper(ShoesImgMapper.class);
        Integer rows = (Integer)  mapper.updateByPrimaryKey(shoesImg);
        sqlSession.commit();
        MybatisUtil.closeSession();
        System.out.println(rows);
    }

    @Test
    public void  queryAllImgByShooesId (){
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesImgMapper mapper =  sqlSession.getMapper(ShoesImgMapper.class);
        List<ShoesImg> sIs = (List<ShoesImg>)mapper.queryAllImgByShooesId(10001);
        MybatisUtil.closeSession();
        System.out.println(sIs);
    }
}
