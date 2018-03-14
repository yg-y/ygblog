package yg.blog.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.support.incrementer.HsqlMaxValueIncrementer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yg.blog.pojo.BlogImg;
import yg.blog.pojo.BlogUser;
import yg.blog.serivce.BlogUserService;
import yg.blog.utils.ImageUtils;

import javax.jws.WebMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
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
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam(value = "username") String username,@RequestParam(value = "password") String password){
        Map<String,String> map = new HashMap<String, String>();
        map.put("username",username);
        map.put("password",password);
        List<BlogUser> bl = blogUserService.login(map);
        if (bl.size()>0 && bl.size() !=0){
            return "success" ;
        }else {
            return "error";
        }
    }




}
