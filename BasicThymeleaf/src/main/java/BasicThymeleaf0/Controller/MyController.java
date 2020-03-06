package BasicThymeleaf0.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello Thymeleaf");
        //classpath:/templates/hello.html
        return "hello";
    }
}
