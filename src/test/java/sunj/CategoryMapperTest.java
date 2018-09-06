package sunj;

import com.chixing.util.MybatisUtil;
import com.chixing.mapper.CategoryMapper;
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
        CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
        List<Category> categoryList = categoryMapper.selectAll();
        MybatisUtil.closeSession();
        System.out.println(categoryList);
    }
}