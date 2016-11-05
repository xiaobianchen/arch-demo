package com.arch.demo.exception;

/**
 * Created by chenxiaobian on 16/11/2.
 */
public class ApplicationException extends RuntimeException {

    public ApplicationException(){}

    public ApplicationException(String message){
        super(message);
    }

    public ApplicationException(String message,Object... args){
        super(String.format(message,args));
    }

    public ApplicationException(String message,Throwable throwable){
        super(message,throwable);
    }
}
