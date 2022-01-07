package 一个包;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class helloservlet implements Servlet {
    public helloservlet() {
       // System.out.println("1.构造器方法");
    }

    //service方法是专门用来处理请求和响应的
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
       //System.out.println("2.初始化方法");
        //1.可以获取servlet程序的别名servlet-name的值
        System.out.println("Helloservlet程序的别名是："+servletConfig.getServletName());
        //2.获取初始化参数init-param
        System.out.println("初始化参数username的值是："+servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是："+servletConfig.getInitParameter("url"));
        //3.获取servletContext对象
        System.out.println(servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //System.out.println("hello servlet被访问了");
        //System.out.println("3.service方法");
        HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;
        String method=httpServletRequest.getMethod();
        if("GET".equals(method)){
            doGet();
        }
        else if ("POST".equals(method)){
           doPost();
        }
    }
    /*get请求方法*/
    public void doGet(){
        System.out.println("get请求");
    }
    /*Post请求方法*/
    public void doPost(){
        System.out.println("Post请求");
    }
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        //System.out.println("4.destroy销毁方法");
    }
}
