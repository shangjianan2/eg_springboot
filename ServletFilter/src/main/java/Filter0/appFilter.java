package Filter0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class appFilter {
    public static void main(String[] args) {
        SpringApplication.run(appFilter.class, args);
    }
}
