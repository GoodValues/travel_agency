package com.travel_agency.security.service;

import com.travel_agency.model.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TAUserDetailsService implements UserDetailsService {

    private final UserService service;

    @Autowired
    public TAUserDetailsService(UserService service) {
        this.service = service;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) {
        User user = null;
        try {
            user = service.getUserByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return TutorialUser.build(user);
    }
}

