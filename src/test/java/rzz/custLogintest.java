package rzz;

import Util.MybatisUtil;
import com.chixing.mapper.CustLoginMapper;
import com.chixing.pojo.CustLogin;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;

public class custLogintest {
    @Test
    public void save(){
        SqlSession sqlSession = MybatisUtil.getSession();
        CustLoginMapper mapepr =sqlSession.getMapper(CustLoginMapper.class);
        CustLogin login = new CustLogin(1001,"测试3","rz858521",new Date(2018-07-14),"192.168.1.90",1,123);
        int rows = mapepr.save(login);
        sqlSession.commit();
        sqlSession.close();
    }

}
