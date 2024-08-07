package com.http_exceptions.http_exeptions.dtos;

import java.util.Date;

public class Error {

    private String message;
    private String error;
    private int status;
    private Date fecha;

    public Error () {}

    public Error(String message, String error, int status, Date fecha) {
        this.message = message;
        this.error = error;
        this.status = status;
        this.fecha = fecha;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
