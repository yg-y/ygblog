package yg.blog.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yg.blog.dao.BlogUserDao;
import yg.blog.pojo.BlogUser;
import yg.blog.serivce.BlogUserService;

import java.util.List;

@Service
public class BlogUserServiceImpl implements BlogUserService {

    @Autowired
    BlogUserDao blogUserDao;

    @Override
    public List<BlogUser> selectAll() {
        List<BlogUser> blogUsers = blogUserDao.selectall();
        return blogUsers;
    }
}
