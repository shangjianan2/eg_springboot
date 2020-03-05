package yamlTest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yamlTest.Component.Person;

@RestController
public class mainController {

    @Autowired
    Person person;

    @RequestMapping("test")
    public String test(){
        System.out.println(person);
        return person.toString();
    }
}
