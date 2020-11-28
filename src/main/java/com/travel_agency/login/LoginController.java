package com.travel_agency.login;

import com.travel_agency.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @GetMapping(value = "/login")
    public String login(Model model) {
        model.addAttribute("user", new UserDTO());
        return "login";
    }

    @PostMapping(value = "/login")
    public String postLogin(@ModelAttribute("user") UserDTO userDTO, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {

        redirectAttributes.addFlashAttribute("user", userDTO);
        return "redirect:/";
    }


}
