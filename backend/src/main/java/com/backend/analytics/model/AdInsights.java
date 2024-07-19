package com.backend.analytics.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AdInsights {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adInsightsId;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private Platform platform;
    private int impressions;
    private int clicks;
    private int reach;
    private int  ctr; //click-through rate
    private int cpc; //cost per click
    private int frequency;

}
