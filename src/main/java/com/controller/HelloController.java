package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * https://www.w3cschool.cn/spring_mvc_documentation_linesh_translation/spring_mvc_documentation_linesh_translation-b5ep27r7.html
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/world")
    public String hi() {
        System.out.println("in====");
        return "hello";
    }
}
