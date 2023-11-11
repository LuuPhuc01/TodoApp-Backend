package com.phucluu.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@ControllerAdvice
public class TodoNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public Map<String, String> exceptionHandler(NotFoundException exception) {
//        HttpStatus statusCode = HttpStatus.NOT_FOUND;
//        Map<String, String> errorMap = new HashMap<>();
//        errorMap.put("errorMessage", exception.getMessage());
//        errorMap.put("status", String.valueOf(statusCode));
//        return errorMap;
//    }
    public ApiNotFound exceptionHandler(NotFoundException exception) {
        ApiNotFound apiException = new ApiNotFound(
                exception.getMessage(),
                HttpStatus.NOT_FOUND,
                LocalDateTime.now()
        );
        return apiException;
    }
}
