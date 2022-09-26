package org.java.personal.project.service;

import org.springframework.stereotype.Service;

@Service
public interface RegisterService {
    String registerNewUser(RegisterUserDto registerUserDto);
}
