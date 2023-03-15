package in.spdev.web.controller;

import in.spdev.web.dao.SignupDAO;
import in.spdev.web.dto.SignUpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    private SignupDAO signupDAO;

    @RequestMapping("/signup")
    public String signUp(@ModelAttribute("signupDTO") SignUpDTO signUpDTO) {
        return "signup";
    }
    @PostMapping("/process-signup")
    public String processSignUp(SignUpDTO signUpDTO) {
        System.out.println(signUpDTO);
        //password encoding
        signUpDTO.setPassword(passwordEncoder.encode(signUpDTO.getPassword()));
        //setting role
        signUpDTO.setRole("USER");
        //save user
        signupDAO.saveUser(signUpDTO);
        return "redirect:/login";
    }
}