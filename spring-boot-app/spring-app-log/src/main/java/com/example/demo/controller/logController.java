package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "logger")
public class logController {
    private static final Logger logger = LoggerFactory.getLogger(logController.class);
    @GetMapping("/log")
    public ResponseEntity<String> publishBmwSevenSeriesCars() {
        logger.info("this is logger in applicaTion");
        return ResponseEntity.ok("logging done");
    }
}