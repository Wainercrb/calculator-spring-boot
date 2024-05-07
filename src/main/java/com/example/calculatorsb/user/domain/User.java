package com.example.calculatorsb.user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class User {
    private int id;
    private String username;
    private String password;
    private Role role;
}
