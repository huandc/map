package com.huan.map.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_MODIFIED)
public class ValidateException extends RuntimeException {
    public ValidateException() {
    }

    public ValidateException(String message) {
        super(message);
    }

    public ValidateException(String message, Throwable cause) {
        super(message, cause);
    }
}
