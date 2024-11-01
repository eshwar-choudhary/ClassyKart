//package com.ec.classyKart.controllers;
//
////import com.ec.classyKart.entities.RegisterBuffer;
//import com.ec.classyKart.entities.user;
////import com.ec.classyKart.repositories.RegisterBufferRepo;
//import com.ec.classyKart.services.Email.EmailService;
//import com.ec.classyKart.utils.OtpGenerator;
//import com.ec.classyKart.utils.PasswordEncryter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.time.LocalDateTime;
//
//@Controller
//public class ClassyKartControllers {
//
//    @Autowired
//    private EmailService emailService;
//
////    @Autowired
////    private RegisterBufferRepo registerBufferRepo;
//
//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//
//    @GetMapping("/register")
//    public String registerUser() {
//        return "register";
//    }
//
//    @GetMapping("/forgot-password")
//    public String fotgotPassword() {
//        return "forgot-password";
//    }
//
//    @PostMapping("/registerUser")
//    public ModelAndView registerUserInDB(user user) {   // Using the user entity
//
//        // Generate OTP and send it to the user
//        int otp = OtpGenerator.generateOtp();
//        emailService.sendEmail(user.getEmail(), "OTP for ClassyKart", "Your OTP is: " + otp);
//        LocalDateTime createdAt = LocalDateTime.now();
//
//        // Save the user in the buffer
////        RegisterBuffer registerUser = registerBufferRepo.save(
////                RegisterBuffer.builder()
////                        .email(user.getEmail())
////                        .otp(OtpGenerator.generateOtp())
////                        .createdAt(createdAt)
////                        .expiresAt(createdAt.plusMinutes(10))
////                        .retryCount(0L)
////                        .profile(
////                                user.builder()
////                                        .email(user.getEmail())
////                                        .name(user.getName())
////                                        .mobileNumber(user.getMobileNumber())
////                                        .address(user.getAddress())
////                                        .city(user.getCity())
////                                        .state(user.getState())
////                                        .pincode(user.getPincode())
////                                        .password(PasswordEncryter.hashPassword(user.getPassword()))
////                                        .img(user.getImg())
////                                        .build()
////                        )
////                        .build()
////
////        );
//
//        // Redirect to the OTP page or return the OTP view
//        ModelAndView modelAndView = new ModelAndView("otp");
//        modelAndView.addObject("email", user.getEmail());
//        return modelAndView;
//    }
//
//}
