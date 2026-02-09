package com.pausiar.APICompleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserDetailsManager userDetailsManager;

    @PostMapping("/register/")
    public String register(@RequestParam String username, @RequestParam String password) {
        if (userDetailsManager.userExists(username)) {
            return "ERROR: l'usuari ja existeix";
        }

        userDetailsManager.createUser(User.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .roles("USER")
                .build());

        return "OK";
    }
}
