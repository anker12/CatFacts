package com.example.demo.models;

import java.util.Date;

public class CatFact implements Comparable<CatFact>{
    private String text;
    private Date createdAt;
    private Date updatedAt;

    public CatFact(){}

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Fun fact: " +
                '\'' + text + '\'' + ", fact created at " + getCreatedAt();
    }
    public String toStringFact(){
        return text;
    }



    @Override
    public int compareTo(CatFact o) {
        if(this.getCreatedAt().before(o.getCreatedAt())){
            return -1;
        }
        if(this.getCreatedAt().after(o.getCreatedAt())){
            return 1;
        }
        else{
            return 0;
        }
    }
}
