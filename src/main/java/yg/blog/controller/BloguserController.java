package yg.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yg.blog.pojo.BlogUser;
import yg.blog.serivce.BlogUserService;
import yg.blog.utils.ImageUtils;

import javax.servlet.http.HttpServletRequest;
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

    @ResponseBody
    @RequestMapping("/uploadImg")
    public void uploadImg(HttpServletRequest request){
        String path = request.getSession().getServletContext().getContextPath();
        path = path + "static/img/img01.jpg";

        String path2 = path + "static/img/img01scale.jpg";
        ImageUtils.scale(path,path2,2,true);
    }

}
