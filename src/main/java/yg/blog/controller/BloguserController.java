package yg.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yg.blog.serivce.BlogUserService;

@Controller
@RequestMapping("bloguser")
public class BloguserController {

    @Autowired
    BlogUserService blogUserService;

    @ResponseBody
    @RequestMapping("/select")
    public String selectAll(){
       String str =blogUserService.selectAll();
        System.out.println(str + ".........");
        return str;
    }
}
