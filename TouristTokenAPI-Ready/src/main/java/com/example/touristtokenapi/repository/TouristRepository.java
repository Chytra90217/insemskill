package com.example.touristtokenapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.touristtokenapi.entity.Tourist;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Long> {
}
