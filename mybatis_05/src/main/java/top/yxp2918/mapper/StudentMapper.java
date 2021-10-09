package top.yxp2918.mapper;

import top.yxp2918.pojo.Student;
import top.yxp2918.pojo.Teacher;

import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-09-15:01
 */
public interface StudentMapper {
    List<Student> getStudents();
//  查询所有学生对应得老师
    List<Student> getTeacher();
}
