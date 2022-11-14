package com.api.associate.services;

import org.springframework.stereotype.Service;

import com.api.associate.models.UserModel;
import com.api.associate.repositories.UserRepository;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel getLastUser() {
        return userRepository.findTopByOrderByIdDesc();
    }
}
