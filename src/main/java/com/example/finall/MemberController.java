package com.example.finall;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }
}
