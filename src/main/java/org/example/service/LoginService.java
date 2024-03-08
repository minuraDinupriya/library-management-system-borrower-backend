package org.example.service;

import org.example.dto.LogInDto;

public interface LoginService {
    void addLoginDetails(LogInDto logInDto);

    Boolean validateLogin(LogInDto logInDto);
}
