package com.springboot.springboot2webservice.grobal.exception;

import org.springframework.http.HttpStatus;

public interface BaseExceptionType {
    int getErrorCode();

    HttpStatus getHttpStatus();

    String getErrorMessage();
}
