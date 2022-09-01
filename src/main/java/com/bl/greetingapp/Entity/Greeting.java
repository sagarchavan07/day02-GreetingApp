package com.bl.greetingapp.Entity;

public class Greeting {
    long id;
    String message;

    public Greeting() {
    }

    public Greeting(String message) {
        this.message = message;
    }

    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
