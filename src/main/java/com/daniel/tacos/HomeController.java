package com.daniel.tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	//Testa1
    @GetMapping("/")
    public String home() {
        return "home";
    }
    //
}
