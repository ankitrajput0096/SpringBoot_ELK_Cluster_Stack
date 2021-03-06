package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "loggerOne")
public class logController {

    // Creating a logger object for this class and use it to generate logs
    private static final Logger logger = LoggerFactory.getLogger(logController.class);

    @GetMapping("/logOne")
    public ResponseEntity<String> generateLogs() {
        logger.info("This is how we generate logs in spring boot application in style from service one.");
        return ResponseEntity.ok("Awesome!!! we have generated logs from service one.");
    }
}