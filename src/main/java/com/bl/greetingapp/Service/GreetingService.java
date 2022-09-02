package com.bl.greetingapp.Service;

import com.bl.greetingapp.Entity.Greeting;
import com.bl.greetingapp.Repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {
    public static final String template = "hello %s %s!";
    public static final AtomicLong id = new AtomicLong();

    @Autowired
    IGreetingRepository greetingRepository;
    public Greeting saveGreeting(String firstName, String lastName){
        Greeting greeting= new Greeting(id.incrementAndGet(), String.format(template,firstName,lastName));
        return greetingRepository.save(greeting);
    }

    public Greeting createGreeting(Greeting greeting){
        return greetingRepository.save(greeting);
    }

    public Optional<Greeting> findGreeting(long id){
        return greetingRepository.findById(id);
    }

    public List<Greeting> getAllGreetings(){
        return greetingRepository.findAll();
    }

    public Greeting editGreeting(Long id, Greeting greeting){
        greeting.setId(id);
        return greetingRepository.save(greeting);
    }

    public void deleteGreeting(Long id){
        greetingRepository.deleteById(id);
    }
}
