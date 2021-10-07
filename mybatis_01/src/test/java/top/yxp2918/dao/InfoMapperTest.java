package top.yxp2918.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.yxp2918.pojo.Info;
import top.yxp2918.utils.MybatisTest1;

import java.util.HashMap;
import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-07-13:58
 */
public class InfoMapperTest {
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
    public void getInfoById(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
            Info infoById = mapper.getInfoById(1);

            System.out.println(infoById);
        }
    }

    // 增改删需要提交事务
    @Test
    public void addInfo(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
            int i = mapper.addInfo(new Info(4, "yxx", "xx"));
            if (i > 0){
                System.out.println("增加成功");
            }
            sqlSession.commit();
        }
    }

    @Test
    public void updateInfo(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
            int i = mapper.updateInfo(new Info(2, "ddd", "xx"));
            if (i > 0){
                System.out.println("修改成功");
            }
            sqlSession.commit();
        }
    }

    @Test
    public void deleteInfo(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
            int i = mapper.deleteInfo(4);
            if (i > 0){
                System.out.println("删除成功");
            }
            sqlSession.commit();
        }
    }

    @Test
    public void updateInfo2(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
            HashMap<String, Object> map = new HashMap<>();
            map.put("usersex", "xy");
            map.put("id", 2);
            int i = mapper.updateInfo2(map);
            if (i > 0){
                System.out.println("更改成功");
            }
            sqlSession.commit();
        }
    }


    @Test
    public void dimQueryInfo(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
            List<Info> infos = mapper.dimQueryInfo("%笑%");
            for (Info info : infos) {
                System.out.println(info);
            }
        }
    }
}
