package qinjb;

import com.chixing.mapper.*;
import com.chixing.pojo.*;
import com.chixing.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class tese1 {
    @Test
    public void testMapper(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper mapper =  sqlSession.getMapper(CustomerMapper.class);
        Customer c = (Customer) mapper.selectByPrimaryKey(123);
        System.out.println(c);
    }

    @Test
    public void testMyOrder(){
        SqlSession sqlSession = MybatisUtil.getSession();
        MyOrderMapper mapper =  sqlSession.getMapper(MyOrderMapper.class);
        MyOrder myOrder = new MyOrder(123,"158954665",126,null,null,1,1);
        int a  =  mapper.saveSelective(myOrder);
        System.out.println(a);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testOrderDetail(){
        SqlSession sqlSession = MybatisUtil.getSession();
        OrderDetailMapper mapper =  sqlSession.getMapper(OrderDetailMapper.class);
        OrderDetail orderDetail = new OrderDetail(2,2,10,"黑色","38");
        int a  =  mapper.saveDetails(orderDetail);
        System.out.println(a);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testQueryAllColorByShoesId(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesColorMapper mapper =  sqlSession.getMapper(ShoesColorMapper.class);
        List<ShoesColor> shoesColors=  mapper.queryAllColorByShoesId(10001);
        System.out.println(shoesColors);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testQueryByShoesName(){
        SqlSession sqlSession = MybatisUtil.getSession();
        MyOrderMapper mapper =  sqlSession.getMapper(MyOrderMapper.class);
        List<MyOrder> shoesColors=  mapper.queryByShoesName("鞋",123);
        System.out.println(shoesColors);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdateStatus(){
        SqlSession sqlSession = MybatisUtil.getSession();
        MyOrderMapper mapper =  sqlSession.getMapper(MyOrderMapper.class);
        int a =  mapper.updateStatus(0,1);
        System.out.println(a);
        sqlSession.commit();
        sqlSession.close();
    }



    @Test
    public void testQueryById(){
        SqlSession sqlSession = MybatisUtil.getSession();
        MyOrderMapper mapper =  sqlSession.getMapper(MyOrderMapper.class);
        List<MyOrder> list =  mapper.queryById(765,123);
        System.out.println(list);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateByPrimaryKeySelective(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper mapper =  sqlSession.getMapper(CustomerMapper.class);
        Customer customer = new Customer(123,"qinjianbao",null,18,null,null,null,null,null);
        int a =  mapper.updateByPrimaryKeySelective(customer);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void selectbycolor(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesDetailMapper mapper =  sqlSession.getMapper(ShoesDetailMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("colorName","红色");
        map.put("shoesName","测试鞋1");
        map.put("shoesSize",36);
        ShoesDetail shoesDetail =  mapper.selectBySizeAndColorAndShoesName(map);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void select(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesSizeMapper mapper =  sqlSession.getMapper(ShoesSizeMapper.class);
        List<ShoesSize> shoesDetail =  mapper.queryAllSizeByShoesId(10001);
        System.out.println(shoesDetail);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void color(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ShoesImgMapper mapper = sqlSession.getMapper(ShoesImgMapper.class);
        Map<String,Integer> map = new HashMap<>();
        map.put("shoesId",10001);
        map.put("colorId",1);
        List<ShoesImg> shoesImgs = mapper.selectAllImgByShoesIdAndColorId(map);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(shoesImgs);
    }
}
