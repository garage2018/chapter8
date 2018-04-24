package com.garage.chapter8;


import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String goForit() {
        return "view";
    }
}
