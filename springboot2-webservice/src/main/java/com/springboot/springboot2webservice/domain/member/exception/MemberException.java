package com.springboot.springboot2webservice.domain.member.exception;

import com.springboot.springboot2webservice.grobal.exception.BaseException;
import com.springboot.springboot2webservice.grobal.exception.BaseExceptionType;

public class MemberException extends BaseException {
    private BaseExceptionType exceptionType;


    public MemberException(BaseExceptionType exceptionType) {
        this.exceptionType = exceptionType;
    }

    @Override
    public BaseExceptionType getExceptionType() {
        return exceptionType;
    }
}
