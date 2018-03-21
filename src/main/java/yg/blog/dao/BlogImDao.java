package yg.blog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yg.blog.pojo.BlogImg;
import yg.blog.pojo.BlogImgExample;

public interface BlogImDao {
    long countByExample(BlogImgExample example);

    int deleteByExample(BlogImgExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(BlogImg record);

    int insertSelective(BlogImg record);

    List<BlogImg> selectByExample(BlogImgExample example);

    BlogImg selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") BlogImg record, @Param("example") BlogImgExample example);

    int updateByExample(@Param("record") BlogImg record, @Param("example") BlogImgExample example);

    int updateByPrimaryKeySelective(BlogImg record);

    int updateByPrimaryKey(BlogImg record);

    List<BlogImg> queryAll();

    List<BlogImg> editimg(String id);

    Integer del(String id);

    Integer updateEdit(BlogImg blogImg);

    Integer upload(BlogImg blogImg);

}