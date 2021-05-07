package xyz.xnmq.securitydemo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created xnmq
 * @Date 2021/5/7
 * @Description
 */
@RestController
@RequestMapping("test")
public class testController {
    @RequestMapping("test")
    public String test(){
        return "Hello Spring Security";
    }
}
