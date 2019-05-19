package com.ly.common.advice;

import com.ly.common.exception.ExceptionEnum;
import com.ly.common.exception.LyException;
import com.ly.common.vo.ResponseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(LyException.class)
    public ResponseEntity<ResponseResult> handlerRuntimeException(LyException e) {
        ExceptionEnum exceptionEnum = e.getExceptionEnum();
        return ResponseEntity.status(exceptionEnum.getCode()).body(new ResponseResult(exceptionEnum));
    }
}
