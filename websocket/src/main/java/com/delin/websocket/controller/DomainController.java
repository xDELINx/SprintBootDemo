package com.delin.websocket.controller;

import com.delin.websocket.entity.Message;
import com.delin.websocket.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/domain")
public class DomainController {
    @Autowired DomainService domainService;

    @GetMapping("/message")
    public ResponseEntity<Message> sendMessage() {
        return ResponseEntity.ok(domainService.sendMessage());
    }
}
