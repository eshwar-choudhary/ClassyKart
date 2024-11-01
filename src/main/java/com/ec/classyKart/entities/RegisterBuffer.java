package com.ec.classyKart.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "register_user_buffer")
public class RegisterBuffer {

    @Id
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "otp", nullable = false, length = 6)
    private int otp;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "expires_at", nullable = false)
    private LocalDateTime expiresAt;

    @Column(name = "is_used", nullable = false)
    private Long retryCount;

    @Column(name = "profile", nullable = false)
    private User profile;

}
