package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.LogInDto;
import org.example.entity.LogInEntity;
import org.example.repository.LoginRepository;
import org.example.service.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
@RequiredArgsConstructor
@Component
public class LoginServiceImpl implements LoginService {
    private final LoginRepository loginRepository;
    private final ModelMapper modelMapper;
    @Override
    public void addLoginDetails(LogInDto logInDto) {
        loginRepository.save(modelMapper.map(logInDto, LogInEntity.class));
    }
}
