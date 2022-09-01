package com.springboot.springboot2webservice.grobal.file.exception;

import com.springboot.springboot2webservice.grobal.exception.BaseException;
import com.springboot.springboot2webservice.grobal.exception.BaseExceptionType;

public class FileException extends BaseException {
    private BaseExceptionType exceptionType;


    public FileException(BaseExceptionType exceptionType) {
        this.exceptionType = exceptionType;
    }

    @Override
    public BaseExceptionType getExceptionType() {
        return exceptionType;
    }
}