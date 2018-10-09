package com.example.demo.DataFormat;

public class ResponseInfo {

    private int code;

    private String message;

    private String Data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public ResponseInfo(int code, String message, String data) {
        this.code = code;
        this.message = message;
        Data = data;

    }



}
