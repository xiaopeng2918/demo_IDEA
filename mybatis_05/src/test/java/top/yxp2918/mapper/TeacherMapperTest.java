package top.yxp2918.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.yxp2918.pojo.Student;
import top.yxp2918.pojo.Teacher;
import top.yxp2918.utils.MybatisTest1;

import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-09-15:16
 */
public class TeacherMapperTest {

    @Test
    public void getTeachers() {
        try (SqlSession sqlSession = MybatisTest1.getSqlSession()) {
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> teachers = mapper.getTeachers();

            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }

        }
    }

    //    根据老师id查询所教同学
    @Test
    public void getTeacherStudents() {
        try (SqlSession sqlSession = MybatisTest1.getSqlSession()) {
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

            Teacher teacherStudents = mapper.getTeacherStudents(1);
            System.out.println(teacherStudents);


        }
    }


}
