package com.bl.greetingapp.Controller;

import com.bl.greetingapp.Entity.Greeting;
import com.bl.greetingapp.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;
    @PostMapping("/greeting/add")
    public Greeting greeting(@RequestParam String firstName, String lastName){
        return greetingService.saveGreeting(firstName,lastName);
    }

    @PostMapping("/greeting/post")
    public Greeting postGreeting(@RequestBody Greeting greeting){
        return greetingService.createGreeting(greeting);
    }

    @GetMapping("/greeting")
    public Optional<Greeting> findGreeting(@RequestParam long id){
        return greetingService.findGreeting(id);
    }

    @GetMapping("/greeting/all")
    public List<Greeting> getAllGreeting(){
        return greetingService.getAllGreetings();
    }

    @PutMapping("/greeting/put/{id}")
    public Greeting editGreeting(@RequestBody Greeting greeting, @PathVariable Long id){
        return greetingService.editGreeting(id, greeting);
    }

    @DeleteMapping("/greeting/delete/{id}")
    public String deleteGreeting(@PathVariable Long id){
        greetingService.deleteGreeting(id);
        return "deleted";
    }
}
