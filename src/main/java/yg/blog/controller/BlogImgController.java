package yg.blog.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import yg.blog.pojo.BlogImg;
import yg.blog.serivce.BlogImgService;
import yg.blog.utils.QiniuUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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

    @ResponseBody
    @RequestMapping("/uploadImg")
    public JSONObject uploadImg(@RequestParam(value = "files")MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws IOException {

        QiniuUtils qiniuUtils = new QiniuUtils();
        qiniuUtils.saveImage(file);
        return null;
    }

//    @ResponseBody
//    @RequestMapping("/uploadImg")
//    public JSONObject uploadImg(@RequestParam(value = "files")MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
//
//        CommonsMultipartFile cf = (CommonsMultipartFile)file;
//        //这个myfile是MultipartFile的
//        DiskFileItem fi = (DiskFileItem) cf.getFileItem();
//        File f = fi.getStoreLocation();
//
//        request.setCharacterEncoding("UTF-8");
//        //获取文件的路径
////        String path = session.getServletContext().getRealPath("/")+"webapp/static/img/img01.jpg";
////        String url = session.getServletContext().getRealPath("/") + "resources / images / act / worldcup_merge / worldcup720.png” ;
////        String path = request.getSession().getServletContext().getContextPath();
////        String path2 = session.getServletContext().getRealPath("/")+"webapp/static/imgChange/img001.jpg";
//
//        String path2 = request.getSession().getServletContext().getRealPath("/")+"static/imgChange/img05-indexscale2.jpg";
//        UploadFileUtils uploadFileUtils = new UploadFileUtils();
//        JSONObject jsonObject = uploadFileUtils.filesUpload(request, response, file);
//        Object path1 = jsonObject.get("path1");
//        String spath1 = (String) path1;
//        System.err.println("path1: "+spath1);
//        System.err.println("path2: " + path2);
//        String path = request.getSession().getServletContext().getRealPath("")+spath1;
//        System.err.println("path: "+path);
////        System.err.println(jsonObject);
////        System.out.println("path: " + path);
//        ImageUtils.scale2(f,path2,1080,1920,true);
////        System.out.println("path: " + path);
////        String path2 = path + "static/img/img01scale.jpg";
////        ImageUtils.scale(path,path2,2,true);
//        return jsonObject;
//    }
}
