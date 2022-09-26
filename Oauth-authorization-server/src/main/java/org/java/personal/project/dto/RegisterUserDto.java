package org.java.personal.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserDto {

    private String username;
    private String nickname;
    private String password;
    private String address;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;
}
