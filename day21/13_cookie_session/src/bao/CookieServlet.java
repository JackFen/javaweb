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
    protected  void defaultLife(HttpServletRequest req,HttpServletResponse resp)throws IOException {
        Cookie cookie = new Cookie("defaultlife", "defaultlife");
        cookie.setMaxAge(-1);//设置存活时间
        resp.addCookie(cookie);
    }
    protected  void deletenow(HttpServletRequest req,HttpServletResponse resp)throws IOException {
        //先找到你要删除的cookie对象
        Cookie cookie=Cookieutils.findCookie("key4",req.getCookies());
        if(cookie!=null){
        //调用setMAxage(0);
            cookie.setMaxAge(0);//表示马上删除，不需要等待浏览器关闭
        //调用response.addCookie(cookie);
            resp.addCookie(cookie);
            resp.getWriter().write("key4的cookie已经被删除");
        }
    }
    protected  void life3600(HttpServletRequest req,HttpServletResponse resp)throws IOException {
        Cookie cookie=new Cookie("life3600","life3600");
        cookie.setMaxAge(60*60);
        resp.addCookie(cookie);
        resp.getWriter().write("已经创建了一个存活一个小时的cookie");
    }
    protected  void testPath(HttpServletRequest req,HttpServletResponse resp)throws IOException {
        Cookie cookie=new Cookie("path1","path1");
        //getContextPath()===>>得到工程路径
        cookie.setPath(req.getContextPath()+"/abc");
        resp.addCookie(cookie);
        resp.getWriter().write("创建一个带有path路径的cookie");
    }
}
