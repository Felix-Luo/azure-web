package com.azure.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestController {

    @GetMapping(value = "/testIndex")
    public String testIndex(){
        return "this is a index test";
    }
}
