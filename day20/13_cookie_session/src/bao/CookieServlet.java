package bao;

import util.Cookieutils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends BaseServlet{
    protected void getcookie(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        Cookie[] cookies=req.getCookies();
        Cookie iWantCookie= Cookieutils.findCookie("key1",cookies);
//        for(Cookie cookie :cookies){
//            //getName方法返回Cookie的key(名)
//            //getValue方法返回Cookie的value值
//
//            if("key2".equals(cookie.getName())){
//                iWantCookie=cookie;
//                break;
//            }
            //如果不等于null，说明赋过值
            if(iWantCookie!=null){
                resp.getWriter().write("找到了需要的cookie");
            }
        }
 //   }
    protected  void createCookie(HttpServletRequest req,HttpServletResponse resp)throws IOException {
        //1.创建Cookie对象
        Cookie cookie = new Cookie("key1", "value1");
        //2.通知客户端保存cookie
        resp.addCookie(cookie);
        resp.getWriter().write("Cookie创建成功");
    }
}
