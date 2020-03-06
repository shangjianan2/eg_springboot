package Filter0;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Order(2)
@WebFilter(filterName = "MyFilter2", urlPatterns = "/srv")
public class MyFilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init2");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter2 in");
        chain.doFilter(request,response);
        System.out.println("filter2 out");
    }

    @Override
    public void destroy() {
        System.out.println("destory2");
    }
}
