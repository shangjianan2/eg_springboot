package Listener0;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MyController {
    @RequestMapping("hello")
    public String hello(HttpSession httpSession){
        httpSession.setAttribute("aa", "aa");
        return "OK";
    }

    @RequestMapping("online")
    public String online(){
        return "online num: " + MyHttpSessionListener.online;
    }
}
