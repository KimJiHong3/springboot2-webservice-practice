package com.springboot.springboot2webservice.grobal.log;

public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);
    void exception(TraceStatus status, Throwable e);
}