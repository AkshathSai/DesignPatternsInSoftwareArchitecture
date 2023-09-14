package org.example.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestEmailSpamFilter {

    public static void main(String[] args) {

        Request request = new Request();
        // Negative cases
        // request.setEmail(new Email("free money", "test@test.com", "Free Money fro you!!!"));
        // request.setEmail(new Email("Congratulations", "chad@gogle.com", "You cleared our interview!!!"));
        // Positive case
        request.setEmail(new Email("Congratulations", "test@test.com", "You've been nominated as a STAR performer"));

        EmailSpamFilterService spamFilterService = new EmailSpamFilterService();
        spamFilterService.setNextHandler(new SenderFilter());
        log.info("Is a Spam Mail? " + spamFilterService.filterEmail(request));
        spamFilterService.setNextHandler(new SubjectFilter());
        log.info("Is a Spam Mail? " + spamFilterService.filterEmail(request));

    }

}
