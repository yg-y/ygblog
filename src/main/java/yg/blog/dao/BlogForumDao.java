package yg.blog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yg.blog.pojo.BlogForum;
import yg.blog.pojo.BlogForumExample;

public interface BlogForumDao {
    long countByExample(BlogForumExample example);

    int deleteByExample(BlogForumExample example);

    int deleteByPrimaryKey(Integer forumId);

    int insert(BlogForum record);

    int insertSelective(BlogForum record);

    List<BlogForum> selectByExample(BlogForumExample example);

    BlogForum selectByPrimaryKey(Integer forumId);

    int updateByExampleSelective(@Param("record") BlogForum record, @Param("example") BlogForumExample example);

    int updateByExample(@Param("record") BlogForum record, @Param("example") BlogForumExample example);

    int updateByPrimaryKeySelective(BlogForum record);

    int updateByPrimaryKey(BlogForum record);
}