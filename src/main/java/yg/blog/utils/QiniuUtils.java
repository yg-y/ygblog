package yg.blog.utils;

import com.alibaba.fastjson.JSONObject;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

public class QiniuUtils {
    private static final Logger logger = LoggerFactory.getLogger(QiniuUtils.class);

    //设置账号的ACCESS_KEY和SECRET_KEY
    String ACCESS_KEY= "iCyFYFi7qKJQG6a-fVWaC9YJ15ai2eFjKHXAOLZg";
    String SECRET_KEY= "iCyFYFi7qKJQG6a-fVWaC9YJ15ai2eFjKHXAOLZg";
    //要上传的空间
    String bucketname= "ygblog";

    //密钥配置
    Auth auth= Auth.create(ACCESS_KEY,SECRET_KEY);
    //创建上传对象
    Configuration cfg= new Configuration(Zone.zone2());
    UploadManager uploadManager= new UploadManager(cfg);

    private static String QINIU_IMAGE_DOMAIN= "p5o4jj7kb.bkt.clouddn.com";

    //简单上传，使用默认策略，只需要设置上传的空间名就可以了
    public String getUpToken() {
        return auth.uploadToken(bucketname);
    }

    public String saveImage(MultipartFile file)throws IOException {
        // 获取文件名
        String filenames = file.getOriginalFilename();
        //获取文件类型
        String filetype=filenames.indexOf(".")!=-1?filenames.substring(filenames.lastIndexOf(".")+1, filenames.length()):null;

        try {
            String fileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + filetype;
            //调用put方法上传

            Response res = uploadManager.put(file.getBytes(), fileName, getUpToken());

            //打印返回的信息
            if (res.isOK() && res.isJson()) {
                return QINIU_IMAGE_DOMAIN + JSONObject.parseObject(res.bodyString()).get("key");
            } else{
                logger.error("七牛异常1:"+ res.bodyString());
                return "上传失败！";
            }
        } catch (QiniuException e) {
            // 请求失败时打印的异常的信息
            Response r=e.response;
            System.out.println(r.toString());
            logger.error("七牛异常2:"+ e.getMessage());
            return "上传失败！";
        }
    }

        }