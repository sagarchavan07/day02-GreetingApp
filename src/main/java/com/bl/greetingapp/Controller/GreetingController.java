package com.bl.greetingapp.Controller;

import com.bl.greetingapp.Entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(){
        return "hello";
    }

}
