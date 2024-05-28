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

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String name;
    String content;

    @Column(columnDefinition = "TEXT")
    Double rating;

    @Enumerated(EnumType.STRING)

    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
