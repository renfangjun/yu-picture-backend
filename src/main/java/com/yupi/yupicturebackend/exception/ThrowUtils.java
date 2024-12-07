package com.yupi.yupicturebackend.exception;

/**
 * @author fangjun
 * @modify 2024-12-07 21:29:17
 * @motto Talk is cheap, show me the code!
 * @description <h1> </h1>
 */
public class ThrowUtils {
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BusinessException(errorCode, message));
    }


}
