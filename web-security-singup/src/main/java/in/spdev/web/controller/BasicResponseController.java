package in.spdev.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Web Request Handling
 */

@Controller
public class BasicResponseController {
    @RequestMapping("/hello") //secured
    public @ResponseBody String checkIn() {
        return "/check-in";
    }

    @GetMapping("/menu") // non-secured
    public @ResponseBody String getHotelMenu(){
        return "All continental cousins";
    }

}
