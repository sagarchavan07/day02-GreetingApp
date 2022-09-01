package com.bl.greetingapp.Service;

import com.bl.greetingapp.Entity.Greeting;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingService {
    public static final String template = "hello %s!";
    public static final AtomicLong id = new AtomicLong();

    public static Greeting sayHello(String name){
        return new Greeting(id.incrementAndGet(), String.format(template,name));
    }
}
