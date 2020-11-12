package com.tts.exampleapi.model;

public class Message {

    private final long id;
    private final String greeting;
    private final String name;

    public Message(long id, String greet, String name) {
        this.id = id;
        this.greeting = greet;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Message [greeting=" + greeting + ", id=" + id + ", name=" + name + "]";
    }

        

}