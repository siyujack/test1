package com.example.test.service;

import org.springframework.stereotype.Service;
@Service
public class testServiceImpl implements testService {
    @Override
    public String testOne(String str){
        if(str.equals("1")){
            str = "SB";
        }
        return str;
    }
}
