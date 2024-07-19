package com.backend.analytics.repository;

import com.backend.analytics.model.AdInsights;
import com.backend.analytics.model.Platform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdInsightRepo extends JpaRepository<AdInsights, Platform>{
}
