package com.backend.analytics.repository;

import com.backend.analytics.model.Platform;
import com.backend.analytics.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Platform> {
}
