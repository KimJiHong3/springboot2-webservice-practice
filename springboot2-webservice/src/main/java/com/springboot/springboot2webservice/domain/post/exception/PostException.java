package com.springboot.springboot2webservice.domain.post.exception;

import com.springboot.springboot2webservice.grobal.exception.BaseException;
import com.springboot.springboot2webservice.grobal.exception.BaseExceptionType;

public class PostException extends BaseException {

    private BaseExceptionType baseExceptionType;


    public PostException(BaseExceptionType baseExceptionType) {
        this.baseExceptionType = baseExceptionType;
    }

    @Override
    public BaseExceptionType getExceptionType() {
        return this.baseExceptionType;
    }
}
