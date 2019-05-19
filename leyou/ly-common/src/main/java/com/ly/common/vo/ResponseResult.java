package com.ly.common.vo;

import com.ly.common.exception.ExceptionEnum;
import lombok.Data;

@Data
public class ResponseResult {

    private int status;
    private String message;
    private Long timestamp;

    public ResponseResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMessage();
        this.timestamp = System.currentTimeMillis();
    }
}
