package com.example.demo.services;

public class StartPage {
    String velkomst = "Welcome! \n";
    String beskrivelse = "On this page theres 4 different things we can do. We can show you a single fun cat fact," +
            " ten fun cat facts, ten fun cat facts sorted by date published to the site and lastly check if a random fact" +
            " contains a letter of your choice a set amount of times (also chosen by you)";

    @Override
    public String toString(){
        return velkomst+beskrivelse;
    }
}
