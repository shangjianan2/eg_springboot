package Druid0.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MyController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("selectAll")
    public List<Map<String,Object>> selectAll(){
        String sql = "select * from pic_url";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }
}
