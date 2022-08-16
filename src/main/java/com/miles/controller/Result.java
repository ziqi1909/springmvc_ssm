package com.miles.controller;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : springmvc_ssm
 * @Package : com.miles.controller
 * @ClassName : Result.java
 * @createTime : 2022/8/16 19:52
 * @Email : zqwang21@163.com
 * @Description :
 */
public class Result {
    private String msg;
    private Object data;
    private Integer code;

    public Result() {
    }

    public Result(Integer code,Object data)  {
        this.data = data;
        this.code = code;
    }

    public Result(Integer code,Object data,String msg) {
        this.msg = msg;
        this.data = data;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
