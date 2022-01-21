package i18n;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.IOException;
public class i18nTest {
    @Test
    public void testLocale(){
        //获取你系统默认的语言，国家信息
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        //获取中文，中国的常量的locale对象
        System.out.println(locale.CHINA);
        //获取英文，美国的常量的locale对象
        System.out.println(locale.US);
    }
    @Test
    public void testI18n() throws UnsupportedEncodingException {
        
        //得到我们需要的locale对象
        Locale locale = Locale.CHINA;
        //通过指定的basename和Locale对象，读取相应的配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", locale);
        System.out.println("username:"+new String(bundle.getString("username").getBytes("ISO-8859-1"),"UTF-8"));
        System.out.println("password:"+new String(bundle.getString("password").getBytes("ISO-8859-1"),"UTF-8"));
        System.out.println("sex:"+new String(bundle.getString("sex").getBytes("ISO-8859-1"),"UTF-8"));
        System.out.println("age:"+new String(bundle.getString("age").getBytes("ISO-8859-1"),"UTF-8"));
    }
}
