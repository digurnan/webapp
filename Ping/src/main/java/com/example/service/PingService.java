package com.example.service;

import com.example.entity.Message;

public class PingService {
    public Message getMessage() {

        return new Message("pong");

    }
}
