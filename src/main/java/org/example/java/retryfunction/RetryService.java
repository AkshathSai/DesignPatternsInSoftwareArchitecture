package org.example.java.retryfunction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RetryService {

    int retryAttempts;
    final long timeToWait;

    public RetryService(int retryAttempts, long timeToWait) {
        this.retryAttempts = retryAttempts;
        this.timeToWait = timeToWait;
    }

    public void retry(RetryExecutor retryExecutor) {

        while (shouldRetry()) {
            try {
                log.info("Retrying...");
                retryExecutor.run();
                return; // if successful, exit method
            } catch (Exception e) {
                retryAttempts--;
                if (shouldRetry()) {
                    log.info("Waiting for next retry...");
                    waitBeforeNextRetry();
                } else {
                    //throw e; // if all retries failed, throw the exception
                    log.error("Exception occurred while executing the method {} ", e);
                }
            }
        }

    }

    private boolean shouldRetry() {
        return retryAttempts > 0;
    }

    private void waitBeforeNextRetry() {
        try {
            Thread.sleep(timeToWait);
        } catch (Exception e) {
            log.info("Exception while waiting for next retry {} ", e);
            Thread.currentThread().interrupt();
        }
    }
}
