package com.api.associate.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDto {
    @NotBlank
    @Size(max = 1, min = 1)
    private String name;

    public String getName() {
        return name;
    }
}