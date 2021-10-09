package top.yxp2918.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.yxp2918.pojo.Blog;
import top.yxp2918.utils.IDutils;
import top.yxp2918.utils.MybatisTest1;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author yxp2918
 * @date 2021-10-09-17:05
 */
public class BlogMapperTest {
//    添加博客
    @Test
    public void addBlog(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

            Blog blog = new Blog();
            blog.setAuthor("yxp2918");
            blog.setViews(99999);
            blog.setId(IDutils.getRandomId());
            blog.setTitle("哈哈哈");
            blog.setCreatTime(new Date());

            mapper.addBlog(blog);

            blog.setId(IDutils.getRandomId());
            blog.setTitle("啊啊啊");
            mapper.addBlog(blog);

            blog.setId(IDutils.getRandomId());
            blog.setTitle("呵呵呵");
            mapper.addBlog(blog);

            blog.setId(IDutils.getRandomId());
            blog.setTitle("得得得");
            mapper.addBlog(blog);

            blog.setId(IDutils.getRandomId());
            blog.setTitle("呢呢呢");
            mapper.addBlog(blog);

        }
    }

//    if动态查询博客
    @Test
    public void queryBlogsIf(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
            objectObjectHashMap.put("title","啊啊啊");
            List<Blog> blogs = mapper.queryBlogsIf(objectObjectHashMap);

            for (Blog blog : blogs) {
                System.out.println(blog);
            }
        }
    }
    //    choose动态查询博客
    @Test
    public void queryBlogsChoose(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
            List<Blog> blogs = mapper.queryBlogsChoose(objectObjectHashMap);

            for (Blog blog : blogs) {
                System.out.println(blog);
            }
        }
    }

    //    set更新博客
    @Test
    public void updateBlogSet(){
        try(SqlSession sqlSession = MybatisTest1.getSqlSession()){
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
            objectObjectHashMap.put("id","66");
            objectObjectHashMap.put("title","噢噢噢噢");
            objectObjectHashMap.put("author","yxp2021");
            int i = mapper.updateBlogSet(objectObjectHashMap);

            if(i > 0){
                System.out.println("修改成功");
            }
        }
    }
}
