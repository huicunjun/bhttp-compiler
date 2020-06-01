package com.ldw.test.bhttp_compiler_test;

import com.ldw.bhttp_annotation.Parser;

/**
 * @date 2020/5/31 20:16
 * @user 威威君
 */
//@Parser(name = "Response")
public class MResponse<D> {
    public int code;
    public String msg;
    public D data;

    @Override
    public String toString() {
        return "MyResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
