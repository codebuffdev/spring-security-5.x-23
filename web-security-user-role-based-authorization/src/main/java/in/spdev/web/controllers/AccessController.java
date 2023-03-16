package in.spdev.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccessController {
    @RequestMapping("/user")
    public String userDashboard() {
        return "user-dashboard";
    }

    @RequestMapping("/dev")
    public String developerDashboard() {
        return "dev-dashboard";
    }

    @RequestMapping("/admin")
    public String adminView() {
        return "admin-dashboard";
    }

    @RequestMapping("/denied")
    public String accessDenied() {
        return "access-denied";
    }
}
