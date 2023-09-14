package org.example.chainofresponsibility;

import java.util.Arrays;

public class SenderFilter extends EmailSpamFilterService {

    static final String[] knownSpamSenders = {"spam", "xyz", "abc", "gogle", "123"};

    @Override
    public boolean filterEmail(Request request) {
        boolean isSpam = Arrays.stream(knownSpamSenders)
                .anyMatch(word -> request.getEmail().getSender().matches(".*" + word + ".*"));


        if (isSpam) {
            request.setSpam(true);
        }

        return isSpam;
    }

}
