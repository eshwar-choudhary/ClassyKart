package com.ec.classyKart.utils;

import java.security.SecureRandom;

public class OtpGenerator {

    private static final int OTP_LENGTH = 6;
    private static final String NUMERIC_STRING = "0123456789";

    public static int generateOtp() {
        SecureRandom random = new SecureRandom();
        StringBuilder otp = new StringBuilder(OTP_LENGTH);

        for (int i = 0; i < OTP_LENGTH; i++) {
            int index = random.nextInt(NUMERIC_STRING.length());
            otp.append(NUMERIC_STRING.charAt(index));
        }

        return Integer.parseInt(otp.toString());  // Return the generated OTP
    }

}
