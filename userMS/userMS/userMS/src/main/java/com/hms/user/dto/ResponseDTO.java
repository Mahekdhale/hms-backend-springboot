package com.hms.user.dto;
public class ResponseDTO {
     String message;

    public ResponseDTO(String message, Object data) {
        this.message = message;
    }

    public ResponseDTO(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Getters and setters
}
