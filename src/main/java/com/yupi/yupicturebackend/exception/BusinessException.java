package com.yupi.yupicturebackend.exception;

/**
 * @author fangjun
 * @modify 2024-12-07 20:38:59
 * @motto Talk is cheap, show me the code!
 * @description <h1> </h1>
 */

/**
 * 自定义业务异常
 */
public class BusinessException extends RuntimeException {
    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code ,String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode ,String message){
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
