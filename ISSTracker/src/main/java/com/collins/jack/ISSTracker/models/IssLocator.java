package com.collins.jack.ISSTracker.models;

public class IssLocator {
    private long timestamp;
    private String message;
    private IssPosition issPosition;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public IssPosition getIssPosition() {
        return issPosition;
    }

    public void setIssPosition(IssPosition issPosition) {
        this.issPosition = issPosition;
    }

    @Override
    public String toString() {
        return "IssLocator{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", issPosition=" + issPosition +
                '}';
    }
}
