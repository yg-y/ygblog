package yg.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yg.blog.pojo.BlogUser;
import yg.blog.serivce.BlogUserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("bloguser")
public class BloguserController {

    @Autowired
    BlogUserService blogUserService;

    @ResponseBody
    @RequestMapping("/select")
    public List<BlogUser> selectAll(){
        List<BlogUser> blogUsers = blogUserService.selectAll();
        return blogUsers;
    }
}
