package com.backend.analytics.service;

import com.backend.analytics.dto.AnalyticsDTO;
import com.backend.analytics.model.Analytics;
import com.backend.analytics.model.User;
import com.backend.analytics.repository.AnalyticsRepository;
import com.backend.analytics.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnalyticsService {

    @Autowired
    private AnalyticsRepository analyticsRepository;

    @Autowired
    private UserRepo userRepository;

    public Analytics addAnalytics(AnalyticsDTO analyticsDTO) {
        Analytics analytics = new Analytics();
        // Set properties from DTO to Analytics entity
        User user = userRepository.findById(analyticsDTO.getUserId()).orElseThrow(() -> new RuntimeException("User not found"));
        analytics.setUser(user);
        // Set other fields...
        return analyticsRepository.save(analytics);
    }
}