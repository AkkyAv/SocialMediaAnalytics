package com.backend.analytics.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    private String username;
    private String password;
    private String email;
    private String phone;
    private int totalFollowers;
    private int totalFollowing;
    private int totalSaves; // Total number of times posts have been saved
    private int totalComments;
    private int totalShares;
    private int totalPosts;
    private int totalStories;

    @OneToMany(mappedBy = "user")
    private Set<Analytics> analytics; // Allows navigation from User to multiple Analytics entries.

}
