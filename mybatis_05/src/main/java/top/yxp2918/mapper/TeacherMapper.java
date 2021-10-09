package top.yxp2918.mapper;

import top.yxp2918.pojo.Teacher;

import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-09-15:13
 */
public interface TeacherMapper {
    List<Teacher> getTeachers();

//    根据老师id查询所教同学
    Teacher getTeacherStudents(int id);
}
