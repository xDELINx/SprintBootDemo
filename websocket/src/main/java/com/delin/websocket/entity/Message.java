package com.delin.websocket.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document (collection = "messages")
public class Message {
    @Id private String id;
    private String sender;
    private String receiver;
    private String message;
    @CreatedDate private String created;
    @LastModifiedDate private String modified;
}
