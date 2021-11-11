package com.example.ci;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {




    @GetMapping("/hello")
    public String test(){
        return "hello world";
    }
}
