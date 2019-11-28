package com.spboot.security.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tkmac7j on 11/28/19.
 */
@RestController
public class WelcomeResource {

    @GetMapping("/")
    public String welcome(){
        return "<h1> Welcome !! </h1>";
    }
}
