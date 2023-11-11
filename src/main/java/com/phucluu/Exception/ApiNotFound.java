package com.phucluu.Exception;
import jdk.jfr.DataAmount;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
public class ApiNotFound {
    private String message;
    private HttpStatus status;
    private LocalDateTime timestamp;

    public ApiNotFound(String message, HttpStatus status, LocalDateTime timestamp) {
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "ApiNotFound{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", timestamp=" + timestamp +
                '}';
    }
}
