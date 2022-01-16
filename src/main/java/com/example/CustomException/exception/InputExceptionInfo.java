package com.example.CustomException.exception;


public class InputExceptionInfo {
    private final String errorMessage;
    private final String errorSol;
    private final String errorCode;

    public InputExceptionInfo(String errorMessage, String errorSol, String errorCode) {
        this.errorMessage = errorMessage;
        this.errorSol = errorSol;
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorSol() {
        return errorSol;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
