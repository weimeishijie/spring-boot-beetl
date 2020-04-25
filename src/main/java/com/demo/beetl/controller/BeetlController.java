package com.demo.beetl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by li wen ya on 2020/4/25
 */
@Controller
@RequestMapping("/index")
public class BeetlController {

    @GetMapping
    public String index(){
        return "index.html";
    }



}
