package com.agrimarket.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter
public class ResponseData<T> {
    private final boolean success;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Integer errorCode;
    private final T message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final T data;

    // Cho cac response thanh cong
    public ResponseData(T message, T data) {
        this.success = true;
        this.errorCode = null;
        this.message = message;
        this.data = data;
    }

    // Response tra ve loi
    public ResponseData(Integer errorCode, T message) {
        this.success = false;
        this.errorCode = errorCode;
        this.message = message;
        this.data = null;
    }
}
