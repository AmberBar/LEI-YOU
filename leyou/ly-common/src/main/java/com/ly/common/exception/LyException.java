package com.ly.common.exception;

import lombok.Data;

@Data
public class LyException extends RuntimeException{

    private ExceptionEnum exceptionEnum;

}
