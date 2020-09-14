package com.example.demo.services;

import java.io.IOException;

public class Contains {
    char x;
    int n;

    public Contains(char x, int n) throws IOException {
        this.n = n;
        this.x = x;
    }

    CatService cs1 = new CatService();

    //bemærk at dette er case sensitive
    //man kunne hurtigt gøre at det ikke er, ved at konvertere hele catString til lowercase eller uppercase
    //og så gøre det samme med inputtet fra brugeren
    //Vi har dog valgt at gøre sådan, at det er case sensitive
    public String doesItContain(){
        String catString = cs1.catDataOnlyFact();
        int tempInt=0;

        for(int i=0; i < catString.length() ; i++) {
            if(catString.charAt(i)==x){
                tempInt++;
            }
        }

        if (tempInt==n){
            return cs1.catData()+ " (The character "+'\''+x+'\''+" was used "+'\''+tempInt+'\''+" times.)";
        }
        //denne else if skal fjernes, hvis opgaven er ment som n gange og KUN n gange.
        else if(tempInt>n){
            return cs1.catData() + " (The character "+'\''+x+'\''+" was used "+'\''+tempInt+'\''+" times.)";
        }
        else if(tempInt==0){
            return "Sorry no luck. It was never used";
        }
        //et lille personligt touch tilføjet :D
        else{
            return "Sorry no luck. It was only used "+'\''+tempInt+'\''+" time(s)";
        }
    }


}
