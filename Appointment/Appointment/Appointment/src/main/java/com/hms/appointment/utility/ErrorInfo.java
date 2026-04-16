package com.hms.appointment.utility;

import java.time.LocalDateTime;

public class ErrorInfo {
    private String errorMessage;
    private Long errorCode;
    private LocalDateTime timestamp;

    public ErrorInfo() {
    }

    public ErrorInfo(String errorMessage, Long errorCode, LocalDateTime timestamp) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.timestamp = timestamp;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}