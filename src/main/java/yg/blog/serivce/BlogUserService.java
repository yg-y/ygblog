package yg.blog.serivce;

import org.springframework.stereotype.Service;
import yg.blog.pojo.BlogUser;

@Service
public interface BlogUserService {
    String selectAll();
}
