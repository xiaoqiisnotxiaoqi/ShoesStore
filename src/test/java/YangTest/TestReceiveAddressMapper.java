package YangTest;

import com.chixing.util.MybatisUtil;


import com.chixing.mapper.ReceiveAddressMapper;
import com.chixing.pojo.ReceiveAddress;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @Created with IntelliJ IDEA.
 * @Description:
 * @Author: J41
 * @Date: 2018-08-31
 * @Time: 19:35
 * @Version 1.0
 */
public class TestReceiveAddressMapper {
    ReceiveAddress receiveAddress=new ReceiveAddress(1001, "111", null, null, null, null, 1001, null, 1001L, 1, 123);

    @Test
    public void deleteByPrimaryKey(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ReceiveAddressMapper mapper =  sqlSession.getMapper(ReceiveAddressMapper.class);
        Integer rows = (Integer)  mapper.deleteByPrimaryKey(1001);
        sqlSession.commit();
        MybatisUtil.closeSession();
        System.out.println(rows);
    }

    @Test
    public void insert(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ReceiveAddressMapper mapper =  sqlSession.getMapper(ReceiveAddressMapper.class);
        Integer rows = (Integer)  mapper.insert(receiveAddress);
        sqlSession.commit();
        MybatisUtil.closeSession();
        System.out.println(rows);
    }

    @Test
    public void updateByPrimaryKey(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ReceiveAddressMapper mapper =  sqlSession.getMapper(ReceiveAddressMapper.class);
        Integer rows = (Integer)  mapper.updateByPrimaryKey(receiveAddress);
        sqlSession.commit();
        MybatisUtil.closeSession();
        System.out.println(rows);
    }

    //更新方法无效
    //添加方法无效

    @Test
    public  void delete(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ReceiveAddressMapper mapper =  sqlSession.getMapper(ReceiveAddressMapper.class);
        Map address=new HashMap();
        address.put("custId",123);
        address.put("addressId",1001);
        Integer rows = (Integer)  mapper.delete(address);
        sqlSession.commit();
        MybatisUtil.closeSession();
        System.out.println(rows);
    }


    @Test
    public void queryAll(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ReceiveAddressMapper mapper =  sqlSession.getMapper(ReceiveAddressMapper.class);
        List<ReceiveAddress> receiveAddresses = ( List<ReceiveAddress>)  mapper.queryAll(123);
        MybatisUtil.closeSession();
        System.out.println(receiveAddresses);
    }


    @Test
    public  void updateDefaultAddress(){
        SqlSession sqlSession = MybatisUtil.getSession();
        ReceiveAddressMapper mapper =  sqlSession.getMapper(ReceiveAddressMapper.class);
        Map address=new HashMap();
        address.put("custId",123);
        address.put("addressId",1);
        Integer rows = (Integer)  mapper.updateDefaultAddress(address);
        sqlSession.commit();
        MybatisUtil.closeSession();
        System.out.println(rows);
    }
}
