package com.myshop.exception;

public enum ErrorCode {

    BAD_DATA(400);
    private int value;
    ErrorCode(int value) {
        this.value = value;

    }
}
