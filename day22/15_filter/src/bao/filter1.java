package bao;

import javax.servlet.*;
import java.io.IOException;

public class filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter1前置代码");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter1后置代码");
    }

    @Override
    public void destroy() {

    }
}
