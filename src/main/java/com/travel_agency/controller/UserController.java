package com.travel_agency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Controller
public class UserController {

    int count;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("dateTime", LocalDateTime.now());
        model.addAttribute("visitCount", ++count);
        return "index";
    }
}
