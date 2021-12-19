package com.samsung.Mono.service;

import com.samsung.Mono.data.UserJpaRepository;
import com.samsung.Mono.entity.LoginResult;
import com.samsung.Mono.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserJpaRepository userJpaRepository;

    public User register(User user){
        return userJpaRepository.save(user);
    }

    public LoginResult login(User user){
        LoginResult result = new LoginResult();
        User userData = userJpaRepository.findUserByUsername(user.getUsername());
        if(userData == null || userData.getPassword() == null) result.setResult(false);
        else {
            result.setResult(user.getPassword().equals(userData.getPassword()));
            result.setUser(userData);
        }
        return result;
    }

}
