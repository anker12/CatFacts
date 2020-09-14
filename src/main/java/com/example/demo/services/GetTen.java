package com.example.demo.services;

import java.io.IOException;
import java.util.ArrayList;

public class GetTen {
    public GetTen(){}

    ArrayList<String> tenFacts = new ArrayList<>();

    public void lavArrayList() throws IOException {
        for (int i=1; i<11; i++){
            CatService cs = new CatService();
            tenFacts.add(i + ". " + cs.catData());
        }
    }
    public String tenFacts(){
        return tenFacts.toString();
    }


}
