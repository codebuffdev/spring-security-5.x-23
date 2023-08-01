package in.codebuffdev.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created a controller with 3 endpoints
 * */

@Controller
public class WelComeController {
    @RequestMapping("/welcome")
    public @ResponseBody String welcome(){
        return "welcome";
    }

    @RequestMapping("/in")
    public @ResponseBody String signIn(){
        return "U hv to sing in use its features";
    }

    @RequestMapping("/out")
    public @ResponseBody String signOut(){
        return "Successfully signed out";
    }
}
