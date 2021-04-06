package com.jqtx.framework.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Hello")
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/guest")
    public String guest() {
        return "Hello Guest!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin";
    }
}
