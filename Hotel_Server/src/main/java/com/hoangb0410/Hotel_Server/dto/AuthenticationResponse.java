package com.hoangb0410.Hotel_Server.dto;

import com.hoangb0410.Hotel_Server.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {
    private String jwt;
    private Long userId;
    private UserRole userRole;

}
