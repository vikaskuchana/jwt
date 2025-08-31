package com.example.jwtapp.model;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ChatMessage {
    private String sender;
    private String receiver;
    private String content;
    private LocalDateTime timestamp;

    
}

