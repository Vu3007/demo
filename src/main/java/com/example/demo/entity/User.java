package com.example.demo.entity;

import com.example.demo.model.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String name;
    @Column(columnDefinition = "TEXT")
    String password;
    String avatar;

    @Enumerated(EnumType.STRING)
    UserRole role;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
