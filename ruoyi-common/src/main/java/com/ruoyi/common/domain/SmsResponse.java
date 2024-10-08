package com.ruoyi.common.domain;


public class SmsResponse {
    private boolean success;
    private String message;

    public SmsResponse() {}

    public SmsResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SmsResponse{" +
                "success=" + success +
                ", message='" + message + '\'' +
                '}';
    }
}
