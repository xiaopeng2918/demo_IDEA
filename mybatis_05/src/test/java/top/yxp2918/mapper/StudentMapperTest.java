package top.yxp2918.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.yxp2918.pojo.Student;
import top.yxp2918.utils.MybatisTest1;

import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-09-15:05
 */
public class StudentMapperTest {
    @Test
    public void getStudents(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = mapper.getStudents();

            for (Student student : students) {
                System.out.println(student);
            }

        }
    }

    @Test
    public void getTeacher() {
        try (SqlSession sqlSession = MybatisTest1.getSqlSession()) {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> teacher = mapper.getTeacher();
            for (Student student : teacher) {
                System.out.println(student);
            }

        }
    }
}
