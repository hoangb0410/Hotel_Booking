package com.hoangb0410.Hotel_Server.services.auth;

import com.hoangb0410.Hotel_Server.dto.SignupRequest;
import com.hoangb0410.Hotel_Server.dto.UserDto;

public interface AuthService {
    UserDto createUser(SignupRequest signupRequest);
}
