package com.ec.classyKart.restControllers;

import com.ec.classyKart.repositories.RegisterBufferRepo;
import com.ec.classyKart.services.Email.EmailService;
import com.ec.classyKart.utils.OtpGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class RegisterUser {

    @Autowired
    private EmailService emailService;
    @Autowired
    private RegisterBufferRepo registerBufferRepo;



    @PostMapping(value = "/signup", consumes = "text/plain")
    public String register(@RequestBody String email) {

        // Generate OTP and send it to the user
        int otp = OtpGenerator.generateOtp();
        emailService.sendEmail(email, "OTP for ClassyKart", "Your OTP is: " + otp);
        LocalDateTime createdAt = LocalDateTime.now();

        // Save the user in the buffer
//        RegisterBuffer registerUser = registerBufferRepo.save(
//                RegisterBuffer.builder()
//                        .email(user.getEmail())
//                        .otp(OtpGenerator.generateOtp())
//                        .createdAt(createdAt)
//                        .expiresAt(createdAt.plusMinutes(10))
//                        .retryCount(0L)
//                        .profile(
//                                user.builder()
//                                        .email(user.getEmail())
//                                        .name(user.getName())
//                                        .mobileNumber(user.getMobileNumber())
//                                        .address(user.getAddress())
//                                        .city(user.getCity())
//                                        .state(user.getState())
//                                        .pincode(user.getPincode())
//                                        .password(PasswordEncryter.hashPassword(user.getPassword()))
//                                        .img(user.getImg())
//                                        .build()
//                        )
//                        .build()
//
//        );

        // Redirect to the OTP page or return the OTP view
        return "User registered successfully";

    }



}
