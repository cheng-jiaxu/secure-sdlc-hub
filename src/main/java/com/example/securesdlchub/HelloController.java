package com.example.securesdlchub;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/test")

    public HelloResponse test(@RequestParam String name,@RequestParam int age){
        return new HelloResponse(name,age);
    }

}
