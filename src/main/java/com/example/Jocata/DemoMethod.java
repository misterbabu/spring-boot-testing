package com.example.Jocata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoMethod {
    @GetMapping("/message")
    public String getMessage(){
        return "Hello from Spring boot!! How are you";
    }
}
