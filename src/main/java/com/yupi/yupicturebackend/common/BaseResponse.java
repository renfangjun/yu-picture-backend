package com.yupi.yupicturebackend.common;

import com.yupi.yupicturebackend.exception.ErrorCode;

/**
 * @author fangjun
 * @modify 2024-12-07 20:48:52
 * @motto Talk is cheap, show me the code!
 * @description <h1> </h1>
 */
public class BaseResponse<T> {
    private int code;
    private T data;
    private String message;


    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
