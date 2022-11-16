package com.api.associate.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.associate.models.UserModel;
import com.api.associate.repositories.UserRepository;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String findNameOfLastUser() {
        List<UserModel> users = userRepository.findAll();

        if (users.size() >= 1) {
            UserModel lastUser = users.get(users.size() - 1);
            String nameOfLastUser = lastUser.getName();
            return nameOfLastUser;
        } else {
            return "Lista vazia.";
        }
    }

    public UserModel saveUser(UserModel userModel) {
        return userRepository.save(userModel);
    }
}