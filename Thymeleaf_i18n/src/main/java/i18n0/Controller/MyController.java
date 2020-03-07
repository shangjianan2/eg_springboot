package i18n0.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("loginP")
    public String login(){
        return "loginBundle";
    }
}
