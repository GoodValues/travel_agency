package com.travel_agency.service;

import com.travel_agency.dto.UserDTO;
import com.travel_agency.mapper.UserMapper;
import com.travel_agency.model.user.User;
import com.travel_agency.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(UserDTO userDTO) {
        User user = UserMapper.INSTANCE.dtoToUser(userDTO);
        userRepository.save(user);
    }
}
