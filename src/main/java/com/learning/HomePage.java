package com.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @RequestMapping
    public String homePage() {
        return "Spring Redis DB Project";
    }

    @GetMapping("/hello")
    public String sayHi() {
        return  "Hie.. ";
    }
}
