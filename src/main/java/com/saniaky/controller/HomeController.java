package com.saniaky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author saniaky
 * @since 6/17/17
 */
@RestController
public class HomeController {

    @GetMapping("/test")
    public String home() {
        return "test";
    }

}
