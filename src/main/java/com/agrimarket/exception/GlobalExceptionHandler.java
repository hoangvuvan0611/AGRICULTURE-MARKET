package com.agrimarket.exception;

import com.agrimarket.config.lang.Translator;
import com.agrimarket.dto.response.ResponseError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Ngoại lệ xảy ra khi việc validate các tham số truyền vào như @NotNull, @Size, ....
     * @param ex: lỗi được ném ra
     * @return : Tra ve danh sach cac truong dau vao loi
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseError<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {

        // Lay danh sach loi tu cac tham so truyen vào
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), Translator.toLocale(error.getDefaultMessage())));
        return new ResponseError<>(
                HttpStatus.BAD_REQUEST.value(),
                errors);
    }
}
