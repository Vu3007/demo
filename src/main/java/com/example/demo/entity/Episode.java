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

public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(nullable = false)

    String name;
    int duration;
    @Column(columnDefinition = "TEXT")
    int  displayOrder;
    String videoUrl;

    @Enumerated(EnumType.STRING)
    boolean status;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
