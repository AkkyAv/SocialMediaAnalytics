package com.backend.analytics.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Analytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // to link the User model
    private String contactInfo;
    private String profileLink;
    private String promotion;
    private Platform platform;
    private int followers;
    private int following;
    private int posts;
    private int accountReached;
    private int engagements; // Total likes, comments, shares, etc.
    private int savedPosts;
    private int category;
    private int shares;
    private int comments;
}