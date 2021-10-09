package top.yxp2918.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.yxp2918.pojo.Info;
import top.yxp2918.utils.MybatisTest1;

import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-09-14:18
 */
public class InfoMapperTest {
    @Test
    public void getInfoList(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
            List<Info> infoList = mapper.getInfoList();

            for (Info info : infoList) {
                System.out.println(info);
            }
        }
    }

    @Test
    public void getInfoById(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
            Info infoById = mapper.getInfoById(6);

            System.out.println(infoById);
        }
    }

    @Test
    public void addInfo(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
            int i = mapper.addInfo(new Info(3, "ao", "女"));

            if(i > 0){
                System.out.println("添加成功");
            }
        }
    }

    @Test
    public void updateInfo(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
            int i = mapper.updateInfo(new Info(1, "张三", "男"));

            if(i > 0){
                System.out.println("更改成功");
            }
        }
    }

    @Test
    public void deleteInfo(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
            int i = mapper.deleteInfo(7);

            if(i > 0){
                System.out.println("删除成功");
            }
        }
    }
}
