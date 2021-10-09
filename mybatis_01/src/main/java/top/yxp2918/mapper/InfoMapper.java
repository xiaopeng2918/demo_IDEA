package top.yxp2918.mapper;

import top.yxp2918.pojo.Info;

import java.util.List;
import java.util.Map;

/**
 * @author yxp2918
 * @date 2021-10-07-13:49
 */
public interface InfoMapper {
    // 查询全部用户
    List<Info> getInfoList();
    // 根据id查询用户
    Info getInfoById(int id);
    // 增加一个用户
    int addInfo(Info info);
    // 修改用户
    int updateInfo(Info info);
    // 使用map修改用户指定信息
    int updateInfo2(Map<String,Object> map);
    // 删除一个用户
    int deleteInfo(int id);

    // 模糊查询
    List<Info> dimQueryInfo(String value);

}
