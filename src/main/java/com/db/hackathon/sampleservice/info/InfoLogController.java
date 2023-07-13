package com.db.hackathon.sampleservice.info;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class InfoLogController {

    private static final String infoString = "Customer Not Found";

    @PostMapping("api/v1/info")
    void log(String value) { log.info(value); }

    @GetMapping("api/v1/info")
    void log() {
        log.info(infoString);
    }
}
