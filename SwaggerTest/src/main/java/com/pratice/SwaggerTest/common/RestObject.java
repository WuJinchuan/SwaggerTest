package com.pratice.SwaggerTest.common;

public class RestObject {
    private int statusCode;
    private String Message;
    private Object data;

    public RestObject() {
        //Empty Constructor
    }

    public RestObject(int statusCode, String message) {
        this.statusCode = statusCode;
        Message = message;
    }

    public RestObject(int statusCode, Object data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
