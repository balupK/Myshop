package com.myshop.exception;

public class MyshopException extends Exception{
    
    /**
     * 
     */
    private static final long serialVersionUID = 3469671720405430949L;
    
    private ErrorCode code;
    public MyshopException(ErrorCode code) {
        super();
        this.code = code;
    }
    
    public MyshopException(String message, ErrorCode code) {
        super(message);
        this.code = code;
    }

}
