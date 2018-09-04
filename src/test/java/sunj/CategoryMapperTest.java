package sunj;

import Util.MybatisUtil;
import com.chixing.pojo.Category;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CategoryMapperTest {

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectAll() {
        SqlSession sqlSession = MybatisUtil.getSession();
        List<Category> categoryList =  sqlSession.selectList("com.store.mapper.CategoryMapper.selectAll");
        System.out.println(categoryList);
    }
}