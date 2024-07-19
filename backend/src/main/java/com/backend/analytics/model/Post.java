package com.backend.analytics.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private Platform platform;
    private String imagePath;
    private String text;
}
