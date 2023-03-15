package in.spdev.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessController {
    @RequestMapping("/user")
    public String userDashboard(){
        return "hello User";
    }
    @RequestMapping("/dev")
    public String developerDashboard(){
        return "hello developer";
    }
    @RequestMapping("/admin")
    public String adminView(){
        return "hello admin";
    }
}
