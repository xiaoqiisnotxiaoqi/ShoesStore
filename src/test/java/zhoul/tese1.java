package zhoul;

import com.chixing.util.MybatisUtil;
import com.chixing.mapper.CartMapper;
import com.chixing.mapper.ShoesSizeMapper;
import com.chixing.pojo.Cart;
import com.chixing.pojo.ShoesDetail;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class tese1 {
    @Test
    public void testShoesSizeMapper(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesSizeMapper mapper = sqlSession.getMapper(ShoesSizeMapper.class);
        mapper.queryAllSizeByShoesId(10001);
        MybatisUtil.closeSession();
    }

    @Test
    public void testCartMapperTwo(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CartMapper mapper =  sqlSession.getMapper(CartMapper.class);
        ShoesDetail shoesDetail = new ShoesDetail(1,10002,1,2,12,231,0);
        mapper.delete(shoesDetail,123);
        MybatisUtil.closeSession();
        System.out.println("555");
    }

    @Test
    public void testCartMapperThree(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CartMapper mapper =  sqlSession.getMapper(CartMapper.class);
        Cart cart = new Cart(2,123,1,"23",new Date(),new Date());
        mapper.save(cart);
        MybatisUtil.closeSession();
    }

    @Test
    public void testCartMapperOne(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CartMapper mapper =  sqlSession.getMapper(CartMapper.class);
        mapper.updateCount(1,123,23);
        MybatisUtil.closeSession();
    }
}
