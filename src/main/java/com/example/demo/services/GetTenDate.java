package com.example.demo.services;

import com.example.demo.models.CatFact;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GetTenDate {
    public void GetTenDate(){}

    ArrayList<CatFact> tenFacts = new ArrayList<>();

    public void lavArrayLogSorter() throws IOException {
        for (int i=1; i<11; i++){
            CatService cs = new CatService();
            tenFacts.add(cs.data);
        }
        Collections.sort(tenFacts);
    }

    public String tenFactsSorted(){
        return tenFacts.toString();
    }

}
