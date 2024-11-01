package com.ec.classyKart.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryter {

    private static final String SEPARATOR1 = "C+L+A+S+S+Y";
    private static final String SEPARATOR2 = "K*A*R*T";
    private static final String SEPARATOR3 = "E-C-O-M-M-E-R-C-E";
    private static final String SEPARATOR4 = "A^P^P^L^I^C^A^T^I^O^N";

    public static String hashPassword(String password) {
        try {
            String combinedString = SEPARATOR1 + SEPARATOR2 + password + SEPARATOR3 + SEPARATOR4;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = messageDigest.digest(combinedString.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error occurred while hashing password", e);
        }
    }

    /*
    public static void main(String[] args) {
        System.out.println(hashPassword("password123456"));
    }
    */
}
