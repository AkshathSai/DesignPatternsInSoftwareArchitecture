package org.example.chainofresponsibility;

import java.util.Arrays;

public class SubjectFilter extends EmailSpamFilterService {

    static final String[] subjectSpamKeywords = {"buy now", "free money", "cheap pharmaceuticals"};

    @Override
    public boolean filterEmail(Request request) {
        boolean isSpam = Arrays.stream(subjectSpamKeywords)
                .flatMap(keyword -> Arrays.stream(keyword.split(" ")))
                .anyMatch(word -> request.getEmail().getSubject().contains(word));

        if (isSpam) {
            request.setSpam(true);
        }

        return isSpam;
    }


}
