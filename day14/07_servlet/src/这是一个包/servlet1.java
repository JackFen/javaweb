package 这是一个包;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数（办事的材料）
        String username = req.getParameter("username");
        System.out.println("在servlet1(柜台1)中查看参数（材料）："+username);
        //给材料盖一个章，并传递到servlet2（柜台2）去查看
        req.setAttribute("key","柜台1的章");
        //问路：servlet2(柜台2)怎么走
        /*
        * 请求转发必须要以斜杠打头，/斜杠表示地址为：http://ip:port/工程名/,映射到idea代码的web 目录
        * */
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");
        //走向servlet2(柜台2)
        requestDispatcher.forward(req,resp);
    }
}
