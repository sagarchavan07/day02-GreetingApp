package com.bl.greetingapp.Controller;

import com.bl.greetingapp.Entity.Greeting;
import com.bl.greetingapp.Service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam String name){
        return GreetingService.sayHello(name);
    }
}
