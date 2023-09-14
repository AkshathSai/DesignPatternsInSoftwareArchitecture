package org.example.chainofresponsibility;

import lombok.Data;

@Data
public class Request {
    private Email email;
    private boolean spam;
    private boolean markHandled;
}
