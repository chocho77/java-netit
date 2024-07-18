package com.chavmom.chavdar.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ver-1")
public class HelloControler {

    @GetMapping("/hello")
    public String index(){
        return "Hello, Spring!";

    }

    @GetMapping("/test/{firstName}/{secondName}")
    public void test(@PathVariable String firstName, @PathVariable String secondName){
        System.out.println("Hello, " + firstName + " " + secondName + ".");
    }
    
    @GetMapping("/list")
    public String someLogic(@RequestParam List<Integer> num){
        return String.format("Hello, %d", num.get(0));
    }


    

}
