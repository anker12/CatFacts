package com.example.demo.controllers;

import com.example.demo.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class FirstController {

    @GetMapping("/")
    @ResponseBody
    public String startPage(){
        StartPage start = new StartPage();
        return start.toString();
    }

    @GetMapping("/getSingle")
    @ResponseBody
    public String getSingle() throws IOException {
        CatService getSingle = new CatService();
        return getSingle.catData();
    }

    @GetMapping("/getTen")
    @ResponseBody
    public String getTen() throws IOException {
        GetTen gt = new GetTen();
        gt.lavArrayList();
        return gt.tenFacts();
    }

    @GetMapping("/getTenSortByDate")
    @ResponseBody
    public String getTenSorted() throws IOException {
        GetTenDate gtd = new GetTenDate();
        gtd.lavArrayLogSorter();
        return gtd.tenFactsSorted();
    }

    @GetMapping("/contains")
    @ResponseBody
    public String doesItContain(@RequestParam char character, int amount) throws IOException {
        Contains cnt = new Contains(character, amount);
        return cnt.doesItContain();
    }


}
