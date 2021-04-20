package com.example.resource;


import com.example.service.PingService;
import com.example.entity.Message;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PingResource {


    @GetMapping("/ping")
    public Message senduser() {
        PingService pingService = new PingService();
        return pingService.getMessage();
    }

}