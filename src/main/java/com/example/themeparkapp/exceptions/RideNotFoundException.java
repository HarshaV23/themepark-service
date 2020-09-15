package com.example.themeparkapp.exceptions;

public class RideNotFoundException extends Throwable {
    private String message;

    public RideNotFoundException() {
    }

    public RideNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
