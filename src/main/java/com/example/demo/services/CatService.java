package com.example.demo.services;

import com.example.demo.models.CatFact;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class CatService {
    public CatService() throws IOException {}

    URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
    BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
    CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);

    public String catData(){
        return data.toString();
    }
    public String catDataOnlyFact(){
        return data.toStringFact();
    }


}
