package com.samsung.Mono.controller;


import com.samsung.Mono.entity.User;
import com.samsung.Mono.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mono")
public class LoginController {

    private final UserService userService;


    @RequestMapping("/login")
    public String loginUser(){



        return "OK";
    }

    @RequestMapping("/register")
    public void registerUser(@ModelAttribute("userForm") User userForm){

        userService.register(userForm);

    }



}
