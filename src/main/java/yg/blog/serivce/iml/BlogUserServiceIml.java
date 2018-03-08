package yg.blog.serivce.iml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yg.blog.dao.BlogUserDao;
import yg.blog.pojo.BlogUser;
import yg.blog.serivce.BlogUserService;

import java.util.List;

@Service
public class BlogUserServiceIml implements BlogUserService {

    @Autowired
    BlogUserDao blogUserDao;

    @Override
    public List<BlogUser> selectAll() {
        List<BlogUser> blogUsers = blogUserDao.selectall();
        return blogUsers;
    }

    @Override
    public BlogUser login(String username, String password) {
        return blogUserDao.login(username, password);
    }
}
