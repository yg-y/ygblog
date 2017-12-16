package yg.blog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yg.blog.pojo.BlogLike;
import yg.blog.pojo.BlogLikeExample;

public interface BlogLikeDao {
    long countByExample(BlogLikeExample example);

    int deleteByExample(BlogLikeExample example);

    int deleteByPrimaryKey(Integer likeId);

    int insert(BlogLike record);

    int insertSelective(BlogLike record);

    List<BlogLike> selectByExample(BlogLikeExample example);

    BlogLike selectByPrimaryKey(Integer likeId);

    int updateByExampleSelective(@Param("record") BlogLike record, @Param("example") BlogLikeExample example);

    int updateByExample(@Param("record") BlogLike record, @Param("example") BlogLikeExample example);

    int updateByPrimaryKeySelective(BlogLike record);

    int updateByPrimaryKey(BlogLike record);
}