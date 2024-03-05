package com.example.Security_login_and_registration.service;

import com.example.Security_login_and_registration.datatransferobj.LoginDto;
import com.example.Security_login_and_registration.datatransferobj.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
    String login(LoginDto loginDto);
}
