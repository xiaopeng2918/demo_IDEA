package top.yxp2918.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author yxp2918
 * @date 2021-10-06-22:59
 */
public class mybatisTest1 {
    private static SqlSessionFactory sqlSessionFactory;
    // 使用mybatis第一步 获取sqlSessionFactory对象
    static{
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }


}
