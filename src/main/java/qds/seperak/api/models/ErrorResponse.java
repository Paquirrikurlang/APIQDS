package qds.seperak.api.models;


import lombok.Builder;

import java.io.Serializable;

@Builder
public class ErrorResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String status;

    private Integer statuscode;

    private ErrorDetail error;


    public String getStatus() {
        return this.status;
    }


    public void setStatus(String status) {
        this.status = status;
    }



    public Integer getStatuscode() {
        return this.statuscode;
    }


    public void setStatuscode(Integer statuscode) {
        this.statuscode = statuscode;
    }


    public ErrorDetail getError() {
        return this.error;
    }


    public void setError(ErrorDetail error) {
        this.error = error;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ErrorResponse))
            return false;
        ErrorResponse other = (ErrorResponse)o;
        if (!other.canEqual(this))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status))
            return false;
        Object this$statuscode = getStatuscode(), other$statuscode = other.getStatuscode();
        if ((this$statuscode == null) ? (other$statuscode != null) : !this$statuscode.equals(other$statuscode))
            return false;
        Object this$error = getError(), other$error = other.getError();
        if ((this$error == null) ? (other$error != null) : !this$error.equals(other$error))
            return false;
        return false;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ErrorResponse;
    }

    public String toString() {
        return "ErrorResponse(status=" + getStatus() + ", statuscode=" + getStatuscode() + ", error=" + getError() + ")";
    }

    public ErrorResponse(String status, Integer statuscode, ErrorDetail error) {
        this.status = status;
        this.statuscode = statuscode;
        this.error = error;
    }

    public ErrorResponse() {}


}

