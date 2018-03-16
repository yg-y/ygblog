package yg.blog.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

    /**
     * @Author : YangGuang
     * @Description:文件上传工具类
     * @Date:Created in 13:05 2018/1/9
     * @Modified By:
     **/
    public class UploadFileUtils extends JSONObject {
//        LearningUtils learningUtils = new LearningUtils();
        /**
         *@Author : YangGuang
         *@Description:文件上传
         *@Date:Created in 13:13 2018/1/9
         *@request ：HttpServletRequest request
         *@response ： HttpServletResponse response
         *@file ：file 页面传输过来的文件
         * 页面发送文件必须带上 enctype = multipart/form-data 属性
         **/
        public JSONObject filesUpload(HttpServletRequest request, HttpServletResponse response, MultipartFile file){
            //设置返回信息的编码格式及类型
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=utf-8");
            String callbackName = request.getParameter("callback");

            JSONObject resultJson = new JSONObject();

            // 获取文件名
            String filename = file.getOriginalFilename();

            //获取文件类型
            String filetype = null;

            // 判断文件是否为空
            if (!file.isEmpty()) {
                try {
                    //获取文件类型
                    filetype=filename.indexOf(".")!=-1?filename.substring(filename.lastIndexOf(".")+1, filename.length()):null;
                    System.err.println("filetype: " + filetype);
                    filename=new Date().getTime()+"_"+new Random().nextInt(1000)+"."+filetype;//新的文件名

                    // 传入的文件保存的路径，如果没有先进行创建文件
                    //创建保存图片的文件夹
                    String FilePathImg = request.getSession().getServletContext().getRealPath("/") + "upload/image/"
                            + filename;
                    //创建保存其他文件的文件夹
                    String FilePath = request.getSession().getServletContext().getRealPath("/") + "upload/file/"
                            + filename;

                    System.err.println("未转换斜杠：" + FilePath);

                    //路径转化，统一转换为浏览器访问斜杠/，防止因为路径斜杠问题报错
                    String filepath = FilePathImg.replaceAll("\\/", "/");
                    String filepaths = FilePath.replaceAll("\\/", "/");

                    //判断文件类型
                    if (filetype.equals("jpg") || filetype.equals("png")|| filetype.equals("jpeg") || filetype.equals("gif")){
                        File dir = new File(filepath);
                        if (!dir.exists()) {
                            dir.mkdirs();
                        }
                        // 转存文件，否则所创建的是个文件夹
                        file.transferTo(dir);
                    }else {
                        File dir = new File(filepaths);
                        if (!dir.exists()) {
                            dir.mkdirs();
                        }
                        // 转存文件，否则所创建的是个文件夹
                        file.transferTo(dir);
                    }
                    System.err.println(request.getSession().getServletContext().getRealPath("/") + "upload/");
                    System.err.println("原生FilePath : " + filepath);

                    resultJson.put("path1",filepath);
                    //截取后的路径，存入数据库
                    String str = filepath.substring(41);
                    System.err.println("截取后FilePath : " + str );

                    // 获取需要处理的文件
                    resultJson.put("data", "文件上传成功");
                    resultJson.put("path", str);
                    response.getWriter().write(callbackName + "([" + resultJson + "])");
                } catch (Exception e) {
                    System.out.println("文件转存失败");
                    e.printStackTrace();
                }
            } else {
                try {
                    resultJson.put("data", "空文件");
                    response.getWriter().write(callbackName + "([" + resultJson + "])");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            response.reset();
            return resultJson;
        }


    }

