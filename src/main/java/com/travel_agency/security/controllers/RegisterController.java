package com.travel_agency.security.controllers;

import com.travel_agency.security.DTO.*;
import com.travel_agency.repository.RoleRepository;
import com.travel_agency.repository.UserRepository;
import com.travel_agency.security.service.RoleService;
import com.travel_agency.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashSet;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String registerUser(@RequestBody SignupDTO signupDTO, Model model) {

        if (userService.ifUserExistsByUsername(signupDTO.getUsername())) {
            model.addAttribute("message", "Username already exists");
            return "errorPage";
        }
        if (userService.ifUserExistsByUsername(signupDTO.getEmail())) {
            model.addAttribute("message", "Email already added");
            return "errorPage";
        }

        UserDTO userDTO = new UserDTO(signupDTO.getUsername(),
                signupDTO.getEmail(), passwordEncoder.encode(signupDTO.getPassword()));

        HashSet<Role> roles = new HashSet<>();

        signupDTO.getRoles().forEach(role -> {

            switch (role) {
                case "admin":
                    Role adminRole = roleService.findRoleByName(UserRoleNameEnum.ROLE_ADMIN);
                    roles.add(adminRole);
                    break;
                case "user":
                    Role userRole = roleService.findRoleByName(UserRoleNameEnum.ROLE_USER);
                    roles.add(userRole);
                    break;
            }
        });

        userDTO.setRoles(roles);
        userService.saveUser(userDTO);
        model.addAttribute("userDTO", userDTO);
        return "messagePage";

    }


//    @GetMapping(value = "/register")
//    public String register(Model model) {
//
//        model.addAttribute("user", new UserDTO());
//        return "register";
//    }
//
//


//    @PostMapping(value = "/register")
//    public String postRegister(@ModelAttribute("user") @Validated UserDTO userDTO, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            return "register";
//        }
//
//        if (userRepository.existsByUserName(userDTO.getUserName())) {
//            return "register";
//        }
//        if (userRepository.existsByEmail(userDTO.getEmail())) {
//            return "register";
//        }
//
//        User user = new User(userDTO.getFirstName(), userDTO.getLastName(), userDTO.getUserName(), userDTO.getEmail(),
//                passwordEncoder.encode(userDTO.getPassword()), passwordEncoder.encode(userDTO.getConfirmPassword()));
////
////        Set<Role> roles = new HashSet<>();
////
////        userDTO.getRoles().forEach(role -> {
////            switch (role.getName().name()) {
////                case "ROLE_ADMIN" :
////                    Role adminRole = roleRepository.findByName(UserRoleNameEnum.ROLE_ADMIN)
////                            .orElseThrow(() -> new RuntimeException("Admin role not found"));
////                    roles.add(adminRole);
////                    break;
////                case "ROLE_USER" :
////                    Role userRole = roleRepository.findByName(UserRoleNameEnum.ROLE_USER)
////                            .orElseThrow(() -> new RuntimeException("User role not found"));
////                    roles.add(userRole);
////                    break;
////                default:
////                    Role defaultRole = roleRepository.findByName(UserRoleNameEnum.ROLE_ADMIN)
////                            .orElseThrow(() -> new RuntimeException("User role not found"));
////                    roles.add(defaultRole);
////                    break;
////
////            }
////        });
////
////        user.setRoles(roles);
//        userRepository.save(user);
//        return "index";
//    }
}
