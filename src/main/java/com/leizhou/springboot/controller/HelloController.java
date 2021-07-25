package com.leizhou.springboot.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/admin")
    @PreAuthorize("hasAnyRole('admin')")
    public String Hello(){
        return "Hello,admin";
    }

    @GetMapping("/normal")
    @PreAuthorize("hasAnyRole('normal')")
    public String helloNormal(){
        return "Hello,normal";
    }
}
