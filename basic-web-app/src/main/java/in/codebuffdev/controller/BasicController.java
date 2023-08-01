package in.codebuffdev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/check")
    public String healthCheck(){
        return "working";
    }
}
