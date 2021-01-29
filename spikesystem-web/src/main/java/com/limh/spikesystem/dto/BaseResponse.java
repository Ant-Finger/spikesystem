package com.limh.spikesystem.dto;

import com.limh.spikesystem.enums.StatusCodeEnums;

/**
 * @author Limh
 * @date 2021/1/29
 * 通用的web返回实体
 */
public class BaseResponse<T> {

    private  Integer code;  //返回码

    private  String msg;  //返回信息

    private T data; //泛型

    public BaseResponse(Integer code, String msg) {
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public  static BaseResponse getSuccessResponse(){
        return new BaseResponse(StatusCodeEnums.SUCCESS.getCode(),StatusCodeEnums.SUCCESS.getMsg());
    }

    public  static BaseResponse getSuccessResponse(String msg){
        return new BaseResponse(StatusCodeEnums.SUCCESS.getCode(),msg);
    }
    public  static BaseResponse getFailResponse(){
        return new BaseResponse(StatusCodeEnums.FAIL.getCode(),StatusCodeEnums.FAIL.getMsg());
    }
    public  static BaseResponse getFailResponse(String msg){
        return new BaseResponse(StatusCodeEnums.FAIL.getCode(),msg);
    }
}
