package sunj;

import Util.MybatisUtil;
import com.chixing.mapper.ShoesMapper;
import com.chixing.pojo.Shoes;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ShoesMapperTest {

    @Test
    public void selectBySize() {//测试根据码数查询
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesMapper shoesMapper = sqlSession.getMapper(ShoesMapper.class);
        List<Shoes> shoesList = shoesMapper.selectBySize(41f);
        System.out.println(shoesList);
        MybatisUtil.closeSession();
    }

    @Test
    public void selectAll() {//测试查询所有鞋子
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesMapper shoesMapper = sqlSession.getMapper(ShoesMapper.class);
        List<Shoes> shoesList = shoesMapper.selectAll();
        System.out.println(shoesList);
        MybatisUtil.closeSession();

    }

    @Test
    public void selectByName() {//测试根据名字查询
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesMapper shoesMapper = sqlSession.getMapper(ShoesMapper.class);
        List<Shoes> shoesList = shoesMapper.selectByName("测试");
        System.out.println(shoesList);
        MybatisUtil.closeSession();

    }

    @Test
    public void selectByGender() {//测试根据性别查询鞋子
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesMapper shoesMapper = sqlSession.getMapper(ShoesMapper.class);
        List<Shoes> shoesList = shoesMapper.selectByGender(0);
        System.out.println(shoesList);
        MybatisUtil.closeSession();


    }

    @Test
    public void queryByPrice() {//根据价格区间查询
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesMapper shoesMapper = sqlSession.getMapper(ShoesMapper.class);
        List<Shoes> shoesList = shoesMapper.queryByPrice(400f,500f);
        System.out.println(shoesList);
        MybatisUtil.closeSession();

    }

    @Test
    public void queryByCategory(){//根据类别查询
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesMapper shoesMapper = sqlSession.getMapper(ShoesMapper.class);
        List<Shoes> shoesList = shoesMapper.queryByCategory(10001);
        System.out.println(shoesList);
        System.out.print("我真帅！");

    }

}