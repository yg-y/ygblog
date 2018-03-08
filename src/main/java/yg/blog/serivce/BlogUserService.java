package yg.blog.serivce;

import org.springframework.stereotype.Service;
import yg.blog.pojo.BlogUser;

import java.util.List;
import java.util.Map;

@Service
public interface BlogUserService {
    List<BlogUser> selectAll();

    BlogUser login(String username, String password);
}
