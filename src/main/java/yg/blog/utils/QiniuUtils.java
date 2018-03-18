package yg.blog.utils;


import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 七牛上传工具类
 * @author：younger
 * @date:2018/03/18
 */
public class QiniuUtils {

    YgblogUtils ygblogUtils = new YgblogUtils();
    PorpertyUtils porpertyUtils = new PorpertyUtils();

    //...生成上传凭证，然后准备上传
    String accessKey = PorpertyUtils.getProperty("accessKey");
    String secretKey = PorpertyUtils.getProperty("secretKey");
    String bucket = PorpertyUtils.getProperty("bucket");

    public String upload(MultipartFile file){
    //构造一个带指定Zone对象的配置类
    Configuration cfg = new Configuration(Zone.zone2());
    //...其他参数参考类注释
    UploadManager uploadManager = new UploadManager(cfg);

    //默认不指定key的情况下，以文件内容的hash值作为文件名
    String key = ygblogUtils.date_yyyy_mm_dd() + "/images/"+ygblogUtils.randoms(99999999)+ygblogUtils.randoms(9999);
        //byte[] uploadBytes = "hello qiniu cloud".getBytes("utf-8");
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        String path = null;
        try {
            Response response = uploadManager.put(file.getBytes(), key, upToken);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            path = putRet.key;
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                    try {
                        System.err.println(r.bodyString());
                    } catch (QiniuException ex2) {
                        ex.printStackTrace();
                    }
             } catch (IOException e) {
                e.printStackTrace();
            }
            return path;
    }

    public String delImage(String keyimage){
    //构造一个带指定Zone对象的配置类
            Configuration cfg = new Configuration(Zone.zone2());
    //...其他参数参考类注释
        String accessKey = this.accessKey;
        String secretKey = this.secretKey;
        String bucket = this.bucket;
        String key = keyimage;
        Auth auth = Auth.create(accessKey, secretKey);
        BucketManager bucketManager = new BucketManager(auth, cfg);
        String del = null;
        try {
            del = String.valueOf(bucketManager.delete(bucket, key));
        } catch (QiniuException ex) {
            //如果遇到异常，说明删除失败
            System.err.println(ex.code());
            System.err.println(ex.response.toString());
        }
        return del;
    }

    public static void main(String args[]){
        QiniuUtils qiniuUtils = new QiniuUtils();
        qiniuUtils.delImage("2018-03-18/120274846643");
    }
}