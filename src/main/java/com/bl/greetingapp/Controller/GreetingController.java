package com.bl.greetingapp.Controller;

import com.bl.greetingapp.Entity.Greeting;
import com.bl.greetingapp.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name){
        greetingService.saveGreeting(name);
        return "Success";
    }
}
