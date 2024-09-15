package com.agrimarket.dto.response;

import lombok.Getter;

import java.util.List;

@Getter
public class ResponseDataList<T> {
    private final int total;
    private final List<T> data;

    public ResponseDataList(List<T> data) {
        this.total = data.size();
        this.data = data;
    }
}
