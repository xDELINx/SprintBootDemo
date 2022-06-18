package com.delin.websocket.service;

import com.delin.websocket.entity.Message;
import com.delin.websocket.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.commons.lang3.RandomStringUtils;
@Service
public class DomainService {
    @Autowired MessageRepository messageRepository;

    public Message sendMessage() {
        return messageRepository.insert(Message.builder().sender("alpha").receiver("beta").message(RandomStringUtils.random(12, "abcdefghijklmnopqrstuvwxyz")).build());
    }
}
