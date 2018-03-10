package yg.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import yg.blog.pojo.BlogImg;
import yg.blog.serivce.BlogImgService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/img")
public class BlogImgController {

    @Autowired
    BlogImgService blogImgService;


    @ResponseBody
    @RequestMapping(value = "/system",method = RequestMethod.GET)
    public Map<String,Object> systems(){
        List<BlogImg> result = blogImgService.queryAll();
        Map<String,Object> map = new HashMap<String, Object>();
        if (result.size()!=0 && result.size()>0) {
            map.put("status",200);
            map.put("data",result);
            return map;
        }
        return (Map<String, Object>) map.put("status",500);
    }
}
