package com.gustavson.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BootcampController {

    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Olá, Accenture Bootcamp!");
        response.put("status", "Preparando aplicações para nuvem com Docker");
        response.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/info/{name}")
    public ResponseEntity<Map<String, String>> info(@PathVariable String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Bem-vindo, " + name + "!");
        response.put("framework", "Spring Boot 3.5.9");
        response.put("java_version", System.getProperty("java.version"));
        response.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("application", "Spring Boot Docker App");
        response.put("version", "1.0.0");
        return ResponseEntity.ok(response);
    }
}