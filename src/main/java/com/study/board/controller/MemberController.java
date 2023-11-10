package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    @GetMapping("/member/save")
    public String saveFrom(){
        return "save"; //save.html로
    }

    @PostMapping("/member/save") //name값을 requestparam에 담아온다
    public String save(@RequestParam("memberEmail") String memberEmail,
                       @RequestParam("memberPassword") String memberPassword,
                       @RequestParam("memberName") String memberName){
        System.out.println("MemberController.save");
        System.out.println("memberEmail = " + memberEmail + ", memberPassword = " + memberPassword + ", memberName = " + memberName);
        return "index";
    }
}
