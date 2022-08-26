package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user;
    }

    /*
    ResponseEntity - 사용자의 HttpRequest에 대한 응답 데이터를 포함하는 클래스
        HttpStatus, HttpHeaders, HttpBody를 포함

    HttpStatus.CREATED - 201 상태를 반환한다.
    */
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
