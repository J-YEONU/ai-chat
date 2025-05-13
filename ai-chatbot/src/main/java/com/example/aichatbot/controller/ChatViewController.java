package com.example.aichatbot.controller;

import com.example.aichatbot.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ChatViewController {

    @Autowired
    private ChatService chatService;

    @GetMapping("/chat")
    public String chatForm() {
        return "chat";
    }

    @PostMapping("/chat")
    public String chatSubmit(@RequestParam("message") String message, Model model) {
        String response = chatService.ask(message);
        model.addAttribute("response", response);
        return "chat";
    }
}