package top.yxp2918.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import top.yxp2918.pojo.Info;
import top.yxp2918.utils.MybatisTest1;

import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-07-13:58
 */
public class InfoMapperTest {

    static Logger logger = Logger.getLogger(InfoMapperTest.class);

    @Test
    public void test(){
        // 获取sqlSession对象
        SqlSession sqlSession = MybatisTest1.getSqlSession();

        // 使用sqlSession对象根据接口的反射机制获取mapper
        InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
        // 这个mapper可以当做xml文件的映射
        List<Info> infoList = mapper.getInfoList();

        for (Info info : infoList) {
            System.out.println(info);
        }

    }

    @Test
    public void testLog4j(){
        logger.info("info: 进入了 testLog4j");
        logger.debug("debug");
        logger.error("error 错误信息");
    }
}
