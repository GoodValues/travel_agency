package com.travel_agency.service;

import com.travel_agency.dto.UserDTO;
import com.travel_agency.mapper.UserMapper;
import com.travel_agency.model.user.User;
import com.travel_agency.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserDTO> result = new ArrayList<>();
        for (User user : users)
            result.add(UserMapper.INSTANCE.userDto(user));
        return result;
    }

    public UserDTO getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(UserMapper.INSTANCE::userDto).orElse(null);
    }

    public void saveUser(UserDTO userDTO) {
        User user = UserMapper.INSTANCE.dtoToUser(userDTO);
        userRepository.save(user);
    }

    public User getUserbyUsername (String username) throws Exception {
        return userRepository.findByUserName(username).orElseThrow(() -> new Exception("User not found: " + username));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
