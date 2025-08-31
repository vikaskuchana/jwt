package com.example.jwtapp.service;

import com.example.jwtapp.model.ChatMessage;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ChatService {
    List<ChatMessage> msgHstry=new ArrayList<>();

    public void addMessage(ChatMessage msg){
        msgHstry.add(msg);
    }

    public List<ChatMessage> getHistory(String usr1, String usr2){
        List<ChatMessage> history=new ArrayList<>();
        for(ChatMessage msg:msgHstry){
            if((msg.getSender().equals(usr1) && msg.getReceiver().equals(usr2)) ||
                    (msg.getSender().equals(usr2) && msg.getReceiver().equals(usr1))){
                history.add(msg);
            }
        }
        return history;
    }
}
