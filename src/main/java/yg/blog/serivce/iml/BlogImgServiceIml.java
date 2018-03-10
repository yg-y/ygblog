package yg.blog.serivce.iml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yg.blog.dao.BlogImDao;
import yg.blog.pojo.BlogImg;
import yg.blog.serivce.BlogImgService;

import java.util.List;

@Service
public class BlogImgServiceIml implements BlogImgService {

    @Autowired
    BlogImDao blogImDao;

    @Override
    public List<BlogImg> queryAll() {
        return blogImDao.queryAll();
    }
}
