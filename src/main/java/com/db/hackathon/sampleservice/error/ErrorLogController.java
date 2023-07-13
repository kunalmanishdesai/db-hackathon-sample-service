package com.db.hackathon.sampleservice.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ErrorLogController {

    private static final String errorString = "Unable to fetch jdbc connections from sql database";

    @PostMapping("/api/v1/error")
    void error(String value) {
        log.error(value);
    }

    @GetMapping("/api/v1/error")
    void error() {
        log.error(errorString);
    }
}
