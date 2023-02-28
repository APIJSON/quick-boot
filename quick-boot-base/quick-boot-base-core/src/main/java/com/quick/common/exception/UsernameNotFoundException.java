package com.quick.common.exception;

public class UsernameNotFoundException extends RuntimeException{
    /**
     * 具体异常码
     */
    private int code;

    /**
     * 异常信息
     */
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public UsernameNotFoundException( int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
