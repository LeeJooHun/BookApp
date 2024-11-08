package com.example.Book.repository;

import com.example.Book.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByUserId(Long userId);
    void deleteByUserId(Long userId);
}
