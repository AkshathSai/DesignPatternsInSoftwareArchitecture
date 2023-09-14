package org.example.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Email {
    private String subject;
    private String sender;
    private String content;
}
