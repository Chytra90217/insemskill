package com.example.touristtokenapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.touristtokenapi.entity.Tourist;
import com.example.touristtokenapi.repository.TouristRepository;

@RestController
@RequestMapping("/api/tourists")
public class TouristController {

    private final TouristRepository touristRepository;

    @Value("${app.security.valid-token}")
    private String validToken;

    public TouristController(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    @GetMapping
    public ResponseEntity<?> getAllTourists(
            @RequestHeader(value = "Token", required = false) String token) {

        if (token == null || !token.equals(validToken)) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Unauthorized: Invalid Token Provided");
        }

        List<Tourist> tourists = touristRepository.findAll();
        return ResponseEntity.ok(tourists);
    }
}
