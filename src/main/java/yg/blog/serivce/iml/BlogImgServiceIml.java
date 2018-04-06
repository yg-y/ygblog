package yg.blog.serivce.iml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yg.blog.dao.BlogImDao;
import yg.blog.pojo.BlogImg;
import yg.blog.serivce.BlogImgService;
import yg.blog.utils.YgblogUtils;

import java.util.List;
import java.util.UUID;

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
        blogImg.setImgIndex("1");
        blogImg.setImgName(UUID.randomUUID().toString().replaceAll("-",""));
        blogImg.setImgPath(file);
        if (imgtext.isEmpty()){
            imgtext = "";
        }
        blogImg.setImgContent(imgtext);
        blogImg.setImgDate(y.date_yyyy_mm_dd());
        return blogImDao.upload(blogImg);
    }

    @Override
    public List<BlogImg> queryImgindex(String s) {
        return blogImDao.queryImgindex(s);
    }

    @Override
    public List<BlogImg> selectByWorks() {

        return  blogImDao.selectByWorks();
    }

    @Override
    public Integer uploadImgByWorks(String upload, String imgtext) {
        YgblogUtils y = new YgblogUtils();
        BlogImg blogImg = new BlogImg();
        blogImg.setImgIndex("2");
        blogImg.setImgName(UUID.randomUUID().toString().replaceAll("-",""));
        blogImg.setImgPath(upload);
        if (imgtext.isEmpty()){
            imgtext = "";
        }
        blogImg.setImgContent(imgtext);
        blogImg.setImgDate(y.date_yyyy_mm_dd());
        return blogImDao.upload(blogImg);
    }

    @Override
    public List<BlogImg> worksDate() {
        return blogImDao.worksDate();
    }
}
