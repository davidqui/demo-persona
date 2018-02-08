package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jorge Alfonso García Espinosa
 * @since 1.8
 * @version 02/08/2018
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping
    public String showIndex() {
        return "index";
    }
}
