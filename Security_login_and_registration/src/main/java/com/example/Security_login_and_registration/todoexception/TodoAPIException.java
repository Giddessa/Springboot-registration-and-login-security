package com.example.Security_login_and_registration.todoexception;

import org.springframework.http.HttpStatus;

public class TodoAPIException extends RuntimeException{
    private final HttpStatus status;

    public TodoAPIException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
