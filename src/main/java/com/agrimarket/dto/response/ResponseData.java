package com.agrimarket.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter
public class ResponseData<T> {
    private final boolean success;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Integer errorCode;
    private final String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final T data;

    // Cho cac response thanh cong
    public ResponseData(String message, T data) {
        this.success = true;
        this.errorCode = null;
        this.message = message;
        this.data = data;
    }

    // Response tra ve loi
    public ResponseData(Integer errorCode, String message) {
        this.success = false;
        this.errorCode = errorCode;
        this.message = message;
        this.data = null;
    }
}
