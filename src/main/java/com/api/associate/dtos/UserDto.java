package com.api.associate.dtos;

import javax.validation.constraints.NotBlank;

public class UserDto {
    @NotBlank
    private String name;

    public String getName() {
        return name;
    }
}