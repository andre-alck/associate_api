package com.api.associate.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.associate.models.UserModel;
import com.api.associate.services.UserService;

@RestController()
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(path = "/last-user")
public class UserController {
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<Object> getLastUser() {
        UserModel userModel = userService.getLastUser();

        return ResponseEntity.status(HttpStatus.OK).body(userModel);
    }
}
