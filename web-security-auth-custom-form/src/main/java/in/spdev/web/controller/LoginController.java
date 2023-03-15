package in.spdev.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/loginc")
    public String loginCustom(){
        return "login";
    }
}
