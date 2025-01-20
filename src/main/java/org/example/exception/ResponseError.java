package org.example.exception;

import org.springframework.http.HttpStatus;

public class ResponseError {
    private final HttpStatus status;

    private final String message;

    public ResponseError(HttpStatus status,
                         String message
    ) {
        this.status = status;
        this.message = message;

    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
