import org.junit.Test;
import yg.blog.utils.QiniuUtils;

public class qiuniuTest {

    @Test
    public void test(){
        QiniuUtils qiniuUtils = new QiniuUtils();
        qiniuUtils.delImage("2018-03-18/120274846643");
    }

}
