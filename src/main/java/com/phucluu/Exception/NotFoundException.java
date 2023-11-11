package com.phucluu.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super("Can not find works ");
    }
}