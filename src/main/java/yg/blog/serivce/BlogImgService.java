package yg.blog.serivce;


import org.springframework.stereotype.Service;
import yg.blog.pojo.BlogImg;

import java.util.List;

@Service
public interface BlogImgService {

    List<BlogImg> queryAll();

    List<BlogImg> editimg(String id);

    Integer del(String id);

    Integer updateEdit(BlogImg blogImg);

    Integer upload(String file, String imgtext);

    List<BlogImg> queryImgindex(String s);

    List<BlogImg> selectByWorks();

    Integer uploadImgByWorks(String upload, String imgtext);

    List<BlogImg> worksDate();
}
