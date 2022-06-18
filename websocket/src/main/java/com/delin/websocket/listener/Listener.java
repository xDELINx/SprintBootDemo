package com.delin.websocket.listener;

import com.delin.websocket.entity.Message;
import com.delin.websocket.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.AfterSaveEvent;
import org.springframework.stereotype.Component;

@Component
@EnableMongoAuditing
public class Listener extends AbstractMongoEventListener<Message> {
    @Autowired
    MessageRepository messageRepository;

    @Override
    public void onAfterSave(AfterSaveEvent<Message> event) {
        super.onAfterSave(event);
        int size = messageRepository.findAll().size();
//        System.out.println("Saved" + String.valueOf(size));
        System.out.println(messageRepository.findAll().toString());
    }
}
