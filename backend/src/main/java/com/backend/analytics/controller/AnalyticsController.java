package com.backend.analytics.controller;

import com.backend.analytics.dto.AnalyticsDTO;
import com.backend.analytics.model.Analytics;
import com.backend.analytics.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @PostMapping("/add")
    public ResponseEntity<Analytics> addAnalytics(@RequestBody AnalyticsDTO analyticsDTO) {
        Analytics analytics = analyticsService.addAnalytics(analyticsDTO);
        return ResponseEntity.ok(analytics);
    }
}