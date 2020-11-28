package com.travel_agency.login;

import com.travel_agency.dto.UserDTO;
import com.travel_agency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/register")
    public String register(Model model) {

        model.addAttribute("user", new UserDTO());
        return "register";
    }

    @PostMapping(value = "/register")
    public String postRegister(@ModelAttribute("user") @Validated UserDTO userDTO, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "register";
        }
        userService.saveUser(userDTO);
        return "index";
    }
}
