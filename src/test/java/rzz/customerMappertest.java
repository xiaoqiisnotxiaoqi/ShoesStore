package rzz;

import com.chixing.util.MybatisUtil;
import com.chixing.mapper.CustomerMapper;
import com.chixing.pojo.Customer;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;

public class customerMappertest {
//    SqlSession sqlSession = MybatisUtil.getSession();
//
//    int rows = sqlSession.insert("com.chixing.mapper.CustomerMapper.save",customer);  // 调用 CustomerMapper.xml 文件中对应的insert into sql 命令
//
//        sqlSession.commit();
//        MybatisUtil.closeSession();
//
//        return rows;



//    Customer c2 = new Customer("c1920003","raozhenzhen ","abc123",55,1738298493,"sunjian@163.com",new Date(),null,null);
//    CustomerMapper mapper  =   new CustomerMapperImpl();
//            mapper.update(c2);
    @Test
    public void selectByPrimaryKey(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper mapper =  sqlSession.getMapper(CustomerMapper.class);
        Customer c = (Customer) mapper.selectByPrimaryKey(123);
        sqlSession.close();
        System.out.println(c);
    }
    @Test
    public void updateByPrimaryKey(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper mapepr =sqlSession.getMapper(CustomerMapper.class);
        Customer c = new Customer(123,"测试2","rz858521",21,17681081258l,"1501520190@qq.com",new Date(2018-06-14),new Date(2018-7-07),null);
        int rows = mapepr.updateByPrimaryKey(c);
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void regist(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper mapepr =sqlSession.getMapper(CustomerMapper.class);
        Customer c = new Customer(128,"测试3","rz858521",21,17751124276l,"1501520190@qq.com",new Date(2018-06-14),new Date(2018-7-07),null);
        int rows = mapepr.regist(c);
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void updatePwd(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper mapepr =sqlSession.getMapper(CustomerMapper.class);
        Customer c = new Customer(126,"测试3","rzz8858521",21,17751124276l,"1501520190@qq.com",new Date(2018-06-14),new Date(2018-7-07),null);
        int rows = mapepr.updatePwd(c);
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void  isValidEmail(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper mapper =  sqlSession.getMapper(CustomerMapper.class);
        String email=mapper.isValidEmail("1@qq.com");
        sqlSession.close();

        System.out.println(email);
    }
    @Test
    public void  isValidTelno(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper mapper =  sqlSession.getMapper(CustomerMapper.class);
        Long telno =mapper.isValidTelno(17681081258L);
        sqlSession.close();

        System.out.println(telno);
    }
    @Test
    public void checkTelnoAndPwd(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper  mapepr =sqlSession.getMapper(CustomerMapper.class);
        //Customer c = new Customer(123,"测试2","rz858521",21,17681081258l,"1501520190@qq.com",new Date(2018-06-14),new Date(2018-7-07),null);
        Customer customer= mapepr.checkTelnoAndPwd(17681081258L,"rz858521");

        sqlSession.close();
        System.out.println(customer);
    }
    @Test
    public void checkEmailAndPwd(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper  mapepr =sqlSession.getMapper(CustomerMapper.class);
        Customer customer= mapepr.checkEmailAndPwd("1501520190@qq.com","rz858521");

        sqlSession.close();
        System.out.println(customer);
    }
}
