package top.yxp2918.mapper;

import org.apache.ibatis.annotations.*;
import top.yxp2918.pojo.Info;

import java.util.List;
import java.util.Map;

/**
 * @author yxp2918
 * @date 2021-10-07-13:49
 */
public interface InfoMapper {
    // 查询全部用户
    @Select("select * from info")
    List<Info> getInfoList();
    // 根据id查询用户
    @Select("select * from info where id = #{iid}")
    Info getInfoById(@Param("iid") int id);
    // 增加一个用户
    @Insert("insert into info(id,name,sex) values(#{id},#{name},#{sex})")
    int addInfo(Info info);
    // 修改用户
    @Update("update info set name=#{name},sex=#{sex} where id=#{id}")
    int updateInfo(Info info);
    @Delete("delete from info where id=#{iid}")
    // 删除一个用户
    int deleteInfo(@Param("iid") int id);

}
