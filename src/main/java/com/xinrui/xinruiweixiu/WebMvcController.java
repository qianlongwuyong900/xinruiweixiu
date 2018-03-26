package com.xinrui.xinruiweixiu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebMvcController {

    @GetMapping("/")
    public String Home(){
        return "/index";
    }

    @GetMapping("/index")
    public String index(){
        return "/index";
    }

    @GetMapping("/login")
    public String login(){
        return "/login";
    }

    @GetMapping("/hello")
    public String hello(){
        return "/hello";
    }

    @GetMapping("/huoyun")
    public String huoyun(){ return "/huoyun";}

    @GetMapping("/lianxi")
    public String lianxi(){ return "/lianxi";}
}
