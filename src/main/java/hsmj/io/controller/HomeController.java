package hsmj.io.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @RequestMapping("/")
    public String indexHtml(){
        return "index";
    }
    
    @ResponseBody
    @RequestMapping("/hello")
    public String index(){
        return "hello word";
    }
     
    
}
