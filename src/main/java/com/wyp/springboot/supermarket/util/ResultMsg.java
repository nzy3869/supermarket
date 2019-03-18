package com.wyp.springboot.supermarket.util;

import lombok.Data;

@Data
public class ResultMsg {

    /**
     * 请求成功
     */
    public static final boolean RESULT_SUCCESS = true;

    /**
     * 请求失败
     */
    public static final boolean RESULT_FAIL = false;

    /**
     * 返回数据
     */
    private Object data = null;

    /**
     * 返回信息
     */
    private String msg = null;

    /**
     * 请求结果
     */
    private boolean result = false;

    public ResultMsg(Object data, String msg, boolean result) {
        this.data = data;
        this.msg = msg;
        this.result = result;
    }
}
