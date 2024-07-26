package com.hoangb0410.Hotel_Server.dto;

import com.hoangb0410.Hotel_Server.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private UserRole userRole;
}
