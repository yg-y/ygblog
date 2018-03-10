package yg.blog.serivce;

import org.springframework.stereotype.Service;
import yg.blog.pojo.BlogUser;

import java.util.List;
import java.util.Map;

@Service
public interface BlogUserService {
    List<BlogUser> selectAll();

    List<BlogUser> login(Map<String, String> map);
}
