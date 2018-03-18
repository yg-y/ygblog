import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import yg.blog.controller.BloguserController;
import yg.blog.utils.QiniuUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : YangGuang
 * @Description:
 * @Date:Created in 16:37 2018/3/5
 * @Modified By:
 **/


@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"}) //加载配置文件
//------------如果加入以下代码，所有继承该类的测试类都会遵循该配置，也可以不加，在测试类的方法上///控制事务，参见下一个实例
//这个非常关键，如果不加入这个注解配置，事务控制就会完全失效！
//@Transactional
//这里的事务关联到配置文件中的事务控制器（transactionManager = "transactionManager"），同时//指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//------------
public class test {

//    @Autowired
//    BloguserController bloguserController;
//
//    @Autowired
//    HttpServletRequest request;
//
//
//    @Test
//    public void run(){
//        bloguserController.uploadImg(request);
//    }


    public static void main(String[] args) {
//        Jedis jedis = new Jedis();
//        List<String> list = new ArrayList<String>();
//        list.add("List Hello Redis!");
//        list.add("List Hello Java!");
//        list.add("List Hello Word!");
//
//        Map<String,String> map = new HashMap<String, String>();
//        map.put("1","Map Hello Redis!");
//        map.put("2","Map Hello Java!");
//        map.put("3","Map Hello Word!");
//
//        jedis.set("greeting", String.valueOf(list));
//        jedis.set("map", String.valueOf(map));
//
//        System.err.println(jedis.get("map"));
//        System.err.println(jedis.get("greeting"));
            QiniuUtils qiniuUtils = new QiniuUtils();
            qiniuUtils.delImage("2018-03-18/120274846643");

    }


}


