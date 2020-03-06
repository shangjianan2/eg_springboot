package Filter0;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Order(1)
@WebFilter(filterName = "MyFilter1", urlPatterns = "/srv")
public class MyFilter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init1");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter1 in");
        chain.doFilter(request,response);
        System.out.println("filter1 out");
    }

    @Override
    public void destroy() {
        System.out.println("destory1");
    }
}
