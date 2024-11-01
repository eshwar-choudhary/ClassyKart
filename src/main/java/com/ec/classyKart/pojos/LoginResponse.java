package com.ec.classyKart.pojos;


import com.ec.classyKart.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {

    private String message;
    private User user; // Include user info if necessary

}
