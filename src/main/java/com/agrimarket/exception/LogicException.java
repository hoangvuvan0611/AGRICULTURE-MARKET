package com.agrimarket.exception;

import com.agrimarket.config.Translator;
import lombok.Getter;

@Getter
public class LogicException extends RuntimeException{
    private final int errorCode;
    public LogicException(String message, int errorCode) {
        super(Translator.toLocale(message));
        this.errorCode = errorCode;
    }
}
