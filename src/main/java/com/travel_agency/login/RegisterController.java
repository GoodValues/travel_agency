package com.travel_agency.login;

import com.travel_agency.dto.UserDTO;
import com.travel_agency.model.user.Role;
import com.travel_agency.model.user.User;
import com.travel_agency.model.user.UserRoleNameEnum;
import com.travel_agency.repository.RoleRepository;
import com.travel_agency.repository.UserRepository;
import com.travel_agency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

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

        if (userRepository.existsByUserName(userDTO.getUserName())) {
            return "register";
        }
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            return "register";
        }

        User user = new User(userDTO.getFirstName(), userDTO.getLastName(), userDTO.getUserName(), userDTO.getEmail(),
                passwordEncoder.encode(userDTO.getPassword()), passwordEncoder.encode(userDTO.getConfirmPassword()));
//
//        Set<Role> roles = new HashSet<>();
//
//        userDTO.getRoles().forEach(role -> {
//            switch (role.getName().name()) {
//                case "ROLE_ADMIN" :
//                    Role adminRole = roleRepository.findByName(UserRoleNameEnum.ROLE_ADMIN)
//                            .orElseThrow(() -> new RuntimeException("Admin role not found"));
//                    roles.add(adminRole);
//                    break;
//                case "ROLE_USER" :
//                    Role userRole = roleRepository.findByName(UserRoleNameEnum.ROLE_USER)
//                            .orElseThrow(() -> new RuntimeException("User role not found"));
//                    roles.add(userRole);
//                    break;
//                default:
//                    Role defaultRole = roleRepository.findByName(UserRoleNameEnum.ROLE_ADMIN)
//                            .orElseThrow(() -> new RuntimeException("User role not found"));
//                    roles.add(defaultRole);
//                    break;
//
//            }
//        });
//
//        user.setRoles(roles);
        userRepository.save(user);
        return "index";
    }
}
