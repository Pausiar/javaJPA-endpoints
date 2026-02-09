package com.pausiar.APICompleta.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String username;
    private String password;
    private boolean enabled;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Authority> authorities;

    public User() {
    }

    public User(String username, String password, boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }
}