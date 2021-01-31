package com.travel_agency.controller;

import com.travel_agency.dto.TripDTO;
import com.travel_agency.model.trip.TripAlimentationEnum;
import com.travel_agency.model.trip.TripStatusEnum;
import com.travel_agency.security.DTO.UserDTO;
import com.travel_agency.security.service.UserService;
import com.travel_agency.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class UserController {

    int count;

    UserService userService;
    TripService tripService;

    @Autowired
    public UserController(UserService userService, TripService tripService) {
        this.userService = userService;
        this.tripService = tripService;
    }

    //    @ModelAttribute("user") LoginDTO loginDTO,

    @GetMapping("/")
    public String index(Model model) {

        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
        String username = loggedInUser.getName();

        model.addAttribute("dateTime", LocalDateTime.now());
        model.addAttribute("visitCount", ++count);
        model.addAttribute("userName", username);

        List<TripStatusEnum> collects = Arrays.stream(TripStatusEnum.values()).collect(Collectors.toList());

        List<TripAlimentationEnum> alimentationTypes = Arrays.stream(TripAlimentationEnum.values())
                .collect(Collectors.toList());


        List<TripDTO> trips = tripService.getAllTrips();
        model.addAttribute("trips", trips);
        model.addAttribute("collects", collects);
        model.addAttribute("alimentationTypes", alimentationTypes);

        return "index";
    }

    @GetMapping("/users")
    public String users(Model model) {
        List<UserDTO> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }

    @PostMapping("/editUser")
    public String editUser(UserDTO userDTO) {
        userService.saveUser(userDTO);
        return "redirect:/users";
    }
    @GetMapping("/editUser")
    public String getEditedUser(Model model, @RequestParam Long id) {
        UserDTO userDTO = userService.getUserById(id);
        model.addAttribute("user", userDTO);
        return "editUser";
    }


}
