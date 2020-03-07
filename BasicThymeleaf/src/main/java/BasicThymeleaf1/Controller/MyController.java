package BasicThymeleaf1.Controller;

import BasicThymeleaf1.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MyController {
    @RequestMapping("/hello")
    public String hello(ModelMap map, HttpSession session){
        session.setAttribute("name","lunge");
        map.put("thText","th:text设置文本内容 <b>加粗</b>");
        map.put("thUText","th:utext 设置文本内容 <b>加粗</b>");
        map.put("thValue","thValue 设置当前元素的value值");
        map.put("thEach","Arrays.asList(\"th:each\", \"遍历列表\")");
        map.put("thIf","msg is not null");
        map.put("thObject",new Person("zhangsan",12,"男"));
        return "thymeleaf1";
    }
}
