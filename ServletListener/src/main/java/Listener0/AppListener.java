package Listener0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AppListener {
    public static void main(String[] args) {
        SpringApplication.run(AppListener.class, args);
    }
}
