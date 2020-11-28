package com.travel_agency.controller;

import com.travel_agency.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Controller
public class UserController {

    int count;

    @GetMapping("/")
    public String index(Model model, @ModelAttribute("user") UserDTO userDTO, BindingResult bindingResult) {
        model.addAttribute("dateTime", LocalDateTime.now());
        model.addAttribute("visitCount", ++count);
        model.addAttribute("userName", userDTO.getEmail());
        return "index";
    }
}
