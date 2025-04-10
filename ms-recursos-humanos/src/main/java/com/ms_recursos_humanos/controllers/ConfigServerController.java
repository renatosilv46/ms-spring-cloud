package com.ms_recursos_humanos.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RefreshScope
@RestController
@RequestMapping(value = "/configs")
public class ConfigServerController {

    @Value("${test.config}")
    private String testConfig;

    @GetMapping()
    public ResponseEntity<Void> getConfigsFromConfigServer() {
        log.info("Configs: {}", testConfig);
        return ResponseEntity.noContent().build();
    }
}