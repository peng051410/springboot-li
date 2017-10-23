package cn.imcompany.edu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

//@Controller
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(HttpServletRequest request) {
        System.out.println("hee1");
        return "hee12";
    }
}
