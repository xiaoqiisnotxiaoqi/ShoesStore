package sunj;

import Util.MybatisUtil;

import com.chixing.mapper.CustomerMapper;
import com.chixing.mapper.MyOrderMapper;
import com.chixing.mapper.OrderDetailMapper;
import com.chixing.mapper.ShoesColorMapper;
import com.chixing.pojo.Customer;
import com.chixing.pojo.MyOrder;
import com.chixing.pojo.OrderDetail;
import com.chixing.pojo.ShoesColor;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

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


}
