package com.xinrui.xinruiweixiu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/background")
public class BackGroundController {

    @GetMapping("/dishboard")
    public String Dishboard(){
        return "/background/dishboard";
    }
}
