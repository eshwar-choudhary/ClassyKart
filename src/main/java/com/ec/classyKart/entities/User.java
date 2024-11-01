package com.ec.classyKart.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "users") // Replace with your actual table name
@Getter
@Setter
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Return user roles as GrantedAuthority if you have any
        return null; // Implement this if you have roles
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email; // Using email as username
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Customize according to your needs
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Customize according to your needs
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Customize according to your needs
    }

    @Override
    public boolean isEnabled() {
        return true; // Customize according to your needs
    }

}
