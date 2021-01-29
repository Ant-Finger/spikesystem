package com.limh.spikesystem.enums;


/**
 * @author Limh
 * @date 2021/1/29
 * web返回的结果枚举
 */
public enum StatusCodeEnums {
    SUCCESS(0,"success"),
    FAIL(-1,"fail");

    private Integer code;

    private String msg;

    StatusCodeEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
