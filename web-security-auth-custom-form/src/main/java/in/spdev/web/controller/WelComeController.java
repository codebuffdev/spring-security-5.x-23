package in.spdev.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class WelComeController {
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
    @RequestMapping("/in")
    public @ResponseBody String signIn(){
        return "U hv to sing in use its features, to logout send req logout url";
    }
    @RequestMapping("/out")
    public @ResponseBody String signOut(){
        return "Successfully signed out";
    }
}
