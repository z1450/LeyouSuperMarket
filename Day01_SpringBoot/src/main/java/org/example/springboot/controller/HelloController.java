package org.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author HackerStar
 * @create 2020-05-31 20:07
 */
@RestController
public class HelloController {
    @Autowired
    private DataSource dataSource;

    @GetMapping("show")
    public String test() {
        return "hello SpringBoot!";
    }
}
