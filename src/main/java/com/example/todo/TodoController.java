package com.example.todo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan("com.example.todo")
@RestController
@RequestMapping("/home")
public class TodoController {
  @RequestMapping("/")
  String get(){
    //mapped to hostname:port/home/
    return "Hello from get";
  }
  
  
  @RequestMapping("/index")
  String index(){
    //mapped to hostname:port/home/index/
    return "Hello from index 21sss";
  }

}