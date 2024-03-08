package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.LogInDto;
import org.example.service.LoginService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;
    @PostMapping("/validate-login")
    public Boolean validateLogin(@RequestBody LogInDto logInDto){
        return loginService.validateLogin(logInDto);
    }
}
