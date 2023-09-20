package org.example.java.retryfunction;

@FunctionalInterface
public interface RetryExecutor {

    void run() throws Exception;

}
