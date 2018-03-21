package yg.blog.serivce.iml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yg.blog.dao.BlogImDao;
import yg.blog.pojo.BlogImg;
import yg.blog.serivce.BlogImgService;
import yg.blog.utils.YgblogUtils;

import java.util.List;

@Service
public class BlogImgServiceIml implements BlogImgService {

    @Autowired
    BlogImDao blogImDao;

    @Override
    public List<BlogImg> queryAll() {
        return blogImDao.queryAll();
    }

    @Override
    public List<BlogImg> editimg(String id) {
        return blogImDao.editimg(id);
    }

    @Override
    public Integer del(String id) {
        return blogImDao.del(id);
    }

    @Override
    public Integer updateEdit(BlogImg blogImg) {
        return blogImDao.updateEdit(blogImg);
    }

    @Override
    public Integer upload(String file, String imgtext) {
        YgblogUtils y = new YgblogUtils();
        BlogImg blogImg = new BlogImg();
        blogImg.setImgName(file);
        blogImg.setImgPath(file);
        blogImg.setImgContent(imgtext);
        blogImg.setImgDate(y.date_yyyy_mm_dd());
        return blogImDao.upload(blogImg);
    }
}
