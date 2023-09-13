package org.example.java.retryfunction;

@FunctionalInterface
public interface RetryExecutorService {

    void run() throws Exception;

}
