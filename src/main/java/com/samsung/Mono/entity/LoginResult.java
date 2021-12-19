package com.samsung.Mono.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class LoginResult {

    Boolean result;
    User user;
}
