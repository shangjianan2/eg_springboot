package ServletTest.Servlet3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class appServlet {
    public static void main(String[] args) {
        SpringApplication.run(appServlet.class, args);
    }
//    @Bean
//    public ServletRegistrationBean<MyServlet> getServletRegistrationBean(){
//        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(new MyServlet());
//        bean.setLoadOnStartup(1);
//        return bean;
//    }
}
