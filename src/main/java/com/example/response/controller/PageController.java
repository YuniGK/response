package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    //page를 보낸다. GET
    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public User user(){
        //11버전부터 추가된 기능 아래와 같은 의미
        //User user = new User();
        var user = new User();

        user.setName("yuni");
        user.setAge(3);
        user.setAddress("test");

        return user;
    }

}
