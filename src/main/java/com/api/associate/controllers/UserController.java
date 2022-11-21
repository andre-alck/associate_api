package com.api.associate.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    public ResponseEntity<Object> save(@RequestBody @Valid UserDto userDto) {
        UserModel userModel = new UserModel();
        userModel.setName(userDto.getName());

        List<String> possibleUsers = new ArrayList<>();
        possibleUsers.addAll(Arrays.asList("André",
                "Jackeline",
                "Julia",
                "Kaue",
                "Vinicius"));

        if (!(possibleUsers.contains(userDto.getName()))) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Invalid name.");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
    }

    @DeleteMapping
    public ResponseEntity<Object> delete() {
        userService.delete();
        return ResponseEntity.status(HttpStatus.OK).body("All entities deleted.");
    }
}