package yg.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    @ResponseBody
    @RequestMapping(value = "/editImg",method = RequestMethod.POST)
    public Map<String,Object> editImg(@RequestParam("imgid")String id){
        System.err.println(id);
        List<BlogImg> list = blogImgService.editimg(id);
        Map<String,Object> map = new HashMap<String, Object>();
        if (list.size()!=0&&list.size()>0){
            map.put("status",200);
            map.put("data",list);
            return map;
        }
        return (Map<String, Object>) map.put("status",500);
    }

    @ResponseBody
    @RequestMapping(value = "/delImg",method = RequestMethod.POST)
    public Map<String,Object> del(@RequestParam("imgid")String id){
        System.err.println(id);
        int count = blogImgService.del(id);
        Map<String,Object> map = new HashMap<String, Object>();
        if (count == 1){
            map.put("status",200);
            return map;
        }
        return (Map<String, Object>) map.put("status",500);
    }

    @ResponseBody
    @RequestMapping(value = "updateEdit",method = RequestMethod.POST)
    public Map<String, Object> updateEdit(@RequestBody BlogImg blogImg){
        Integer count = blogImgService.updateEdit(blogImg);
        Map<String,Object> map = new HashMap<String, Object>();
        if(count == 1){
            map.put("status",200);
            return map;
        }
        return (Map<String, Object>) map.put("status",500);
    }
}
