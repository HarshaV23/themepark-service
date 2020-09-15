package com.example.themeparkapp.exceptions;

public class ErrorClass {
    private String message;
    private String statusCode;
    private long errorTime;

    public ErrorClass() {
    }

    public ErrorClass(String message, String statusCode, long errorTime) {
        this.message = message;
        this.statusCode = statusCode;
        this.errorTime = errorTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public long getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(long errorTime) {
        this.errorTime = errorTime;
    }

    @Override
    public String toString() {
        return "ErrorClass{" +
                "message='" + message + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", errorTime=" + errorTime +
                '}';
    }
}
