package Package.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MylistenerImpl implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("servletContext对象被创建了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("servletContext对象被摧毁了");
    }
}
