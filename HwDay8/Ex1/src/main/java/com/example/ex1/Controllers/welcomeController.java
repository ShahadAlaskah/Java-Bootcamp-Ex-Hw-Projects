package com.example.ex1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping("/hey")
    public String getHey(){
        return "Hey from spring";
    }
    @GetMapping("/bye")
    public String getBye(){
        return "Bye";
    }
    @GetMapping("/health")
    public String getHealth(){
        return "Server health is up and running";
    }
    @GetMapping("/check/status")
    public String getCheck(){
        return "Everything OK";
    }

}
