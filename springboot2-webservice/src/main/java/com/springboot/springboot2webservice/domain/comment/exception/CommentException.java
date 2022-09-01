package com.springboot.springboot2webservice.domain.comment.exception;

import com.springboot.springboot2webservice.grobal.exception.BaseException;
import com.springboot.springboot2webservice.grobal.exception.BaseExceptionType;

public class CommentException extends BaseException {

    private BaseExceptionType baseExceptionType;


    public CommentException(BaseExceptionType baseExceptionType) {
        this.baseExceptionType = baseExceptionType;
    }

    @Override
    public BaseExceptionType getExceptionType() {
        return this.baseExceptionType;
    }
}
