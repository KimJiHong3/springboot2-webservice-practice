package com.springboot.springboot2webservice.grobal.exception;

public abstract class BaseException extends RuntimeException{
    public abstract BaseExceptionType getExceptionType();
}
