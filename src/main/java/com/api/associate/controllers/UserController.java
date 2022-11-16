package com.api.associate.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.associate.dtos.UserDto;
import com.api.associate.models.UserModel;
import com.api.associate.services.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/associate")
public class UserController {
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/last-user")
    public ResponseEntity<String> findNameOfLastUser() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findNameOfLastUser());
    }

    @PostMapping
    public ResponseEntity<Object> saveUser(@RequestBody @Valid UserDto userDto) {
        UserModel userModel = new UserModel();
        userModel.setName(userDto.getName());

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(userModel));
    }
}