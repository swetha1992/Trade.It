package com.tradeIt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/")
    public String index(){
        return "welcome to fair tradewelcome to trade IT Application \n Login page";
    }
}
