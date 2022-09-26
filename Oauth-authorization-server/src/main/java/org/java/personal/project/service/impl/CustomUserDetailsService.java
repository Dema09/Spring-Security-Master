package org.java.personal.project.service.impl;

import org.java.personal.project.entity.DummyUser;
import org.java.personal.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.*;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(11);
    }

    @Override
    //TODO: Spring security needs to check if email exists or not
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        DummyUser dummyUser = userRepository.findByEmail(email).orElse(null);
        if(dummyUser == null)
            throw new UsernameNotFoundException("No User Found!");

        return new User(dummyUser.getUsername(),
                dummyUser.getPassword(),
                dummyUser.isEnabled(),
                true,
                true,
                true,
                getAuthorities(List.of(dummyUser.getDummyUserRole().getUserRole()))
        );
    }

    private Collection<? extends GrantedAuthority> getAuthorities(List<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for(String role : roles){
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }
}
