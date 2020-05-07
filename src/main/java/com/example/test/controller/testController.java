package com.example.test.controller;

import com.example.test.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {
    @Autowired
    private com.example.test.service.testService testService;

    @RequestMapping("/test1")
    public String testOne(@RequestParam String str){
        return testService.testOne(str);
    }
}
