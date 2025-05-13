package com.example.aichatbot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
    public String home() {
        return "Hello, this is the AI Chatbot API!";
    }
}
