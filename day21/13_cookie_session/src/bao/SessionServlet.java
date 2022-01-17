package bao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends HttpServlet {


    protected void CreateOrget(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建和获取Session会话对象
        HttpSession session=req.getSession();
        //判断当前Session会话是否是新创建出来的
        boolean isNew = session.isNew();
        //获取Session会话的唯一标识
        String id=session.getId();
        resp.getWriter().write("得到的Session的id是："+id+"<br/>");
        resp.getWriter().write("这个Session是否是新创建的:"+isNew);
    }

    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("key1","value1");
        resp.getWriter().write("已经往session中保存了数据");
    }

    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object attrbute = req.getSession().getAttribute("key1");
        resp.getWriter().write("从Session中获取key1的数据是："+attrbute);
    }


    protected void defaultlife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取了Session的默认超时时长
        int maxInactiveInterval = req.getSession().getMaxInactiveInterval();
        resp.getWriter().write("session的默认超时时间为："+maxInactiveInterval+"秒");
    }
    protected void life3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //线获取Session对象
        HttpSession session = req.getSession();
        //设置当前Session3秒后超时
        session.setMaxInactiveInterval(3);
        resp.getWriter().write("当前Session已经设置为3秒后超时");
    }
    protected void deletenow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //线获取Session对象
        HttpSession session = req.getSession();
        //让session会话马上超时
        session.invalidate();
        resp.getWriter().write("session会话已经马上超时");
    }
}
