package com.digital.enums;

import lombok.Getter;

@Getter
public enum UserCredentials {
    ADMIN("777333744", "1234567");
    private final String username;
    private final String password;

    UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
