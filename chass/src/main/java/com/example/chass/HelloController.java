package com.example.chass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/index")
    public String index() {
        return "Hello from Koradov!";
    }
}