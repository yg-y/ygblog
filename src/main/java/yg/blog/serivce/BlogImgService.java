package yg.blog.serivce;


import org.springframework.stereotype.Service;
import yg.blog.pojo.BlogImg;

import java.util.List;

@Service
public interface BlogImgService {

    List<BlogImg> queryAll();
}
