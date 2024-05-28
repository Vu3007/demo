package com.example.demo.entity;

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

public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String name;
    String slug;
    @Column(columnDefinition = "TEXT")
    String avatar;
    String bio;

    @Enumerated(EnumType.STRING)

    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
