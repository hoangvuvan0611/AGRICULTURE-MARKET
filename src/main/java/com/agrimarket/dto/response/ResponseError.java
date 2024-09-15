package com.agrimarket.dto.response;

public class ResponseError<T> extends ResponseData<T> {
    public ResponseError(Integer errorCode, String message) {
        super(errorCode, message);
    }
}
