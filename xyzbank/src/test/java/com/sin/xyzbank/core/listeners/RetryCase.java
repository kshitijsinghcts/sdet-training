package com.sin.xyzbank.core.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryCase implements IRetryAnalyzer {

    public int retryCount = 0;
    public final int maxTries = 2;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxTries) {
            retryCount++;
            return true;
        }
        return false;
    }
}
