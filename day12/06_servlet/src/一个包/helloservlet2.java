package 一个包;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class helloservlet2 extends HttpServlet {
    //doGet（）在get请求的时候调用
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Helloservlet2的doGet方法");
    }
    //doPost（）在post请求的时候调用
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Helloservlet2的doPost方法");
    }
}
