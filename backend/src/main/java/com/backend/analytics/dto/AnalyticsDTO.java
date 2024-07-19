package com.backend.analytics.dto;

import lombok.Getter;

public class AnalyticsDTO {
    @Getter
    private Long userId; // Assuming this is enough to associate with User
    private String contactInfo;
    private String profileLink;
    private String promotion;
    private String platform;
    private int followers;
    private int following;
    private int posts;
    private int accountReached;
    private int engagements;
    private int savedPosts;
    private int category;
    private int shares;
    private int comments;

}