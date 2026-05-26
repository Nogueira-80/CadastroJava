package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class DemoController {
    @RestController
    public class HelloController {
        @GetMapping("/")
        public String home() {
            return "Olá!. Veja minha primeira página web com Java";
        }
    }
}
