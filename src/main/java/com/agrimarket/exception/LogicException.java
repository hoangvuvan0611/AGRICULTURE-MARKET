package com.agrimarket.exception;

import com.agrimarket.config.lang.Translator;
import lombok.Getter;

@Getter
public class LogicException extends RuntimeException{
    private final int errorCode;
    public LogicException(int errorCode, String message) {
        super(Translator.toLocale(message));
        this.errorCode = errorCode;
    }
}
