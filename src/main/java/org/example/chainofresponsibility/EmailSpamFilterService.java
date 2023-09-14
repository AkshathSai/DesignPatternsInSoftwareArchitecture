package org.example.chainofresponsibility;


// Base class
public class EmailSpamFilterService {

    private EmailSpamFilterService nextHandler;

    public void setNextHandler(EmailSpamFilterService nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean filterEmail(Request request) {

        if (nextHandler!=null) {
            return nextHandler.filterEmail(request);
        }


        return false;
    }

}
