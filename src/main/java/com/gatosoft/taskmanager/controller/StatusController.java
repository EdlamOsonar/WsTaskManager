package com.gatosoft.taskmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatusController {

    @ResponseBody
    @RequestMapping("/isApplicationAlive")
    public String isApplicationAlive(){
        return "I am alive, hello world!";
    }
    
}
