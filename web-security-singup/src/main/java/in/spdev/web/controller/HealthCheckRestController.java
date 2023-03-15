package in.spdev.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckRestController {
    @GetMapping("/check/{yourName}")
    public String greet(@PathVariable String yourName){
        return "Healthy "+yourName;
    }

}
