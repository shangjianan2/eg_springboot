package yamlTest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @RequestMapping("test")
    public String test(){
        return "OK";
    }
}
