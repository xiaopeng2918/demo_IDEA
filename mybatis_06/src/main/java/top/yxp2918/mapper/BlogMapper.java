package top.yxp2918.mapper;

import top.yxp2918.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author yxp2918
 * @date 2021-10-09-16:59
 */
public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> queryBlogsIf(Map map);

    List<Blog> queryBlogsChoose(Map map);

    int updateBlogSet(Map map);
}
