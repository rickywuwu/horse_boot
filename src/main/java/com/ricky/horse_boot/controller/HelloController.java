package com.ricky.horse_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Desc: description.
 * @Author: ricky.
 * @Created: 2017/6/26
 * @Version: V1.0
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/hello")
    public String hello(Model model) {
        model.addAttribute("name", "SpringBoot");
        return "/views/hello";
    }
}
