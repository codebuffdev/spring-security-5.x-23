package in.spdev.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHealthCheckController {

    @GetMapping("/check/{devId}")
    public String check(@PathVariable String devId){
        return "Working "+devId;
    }
}
