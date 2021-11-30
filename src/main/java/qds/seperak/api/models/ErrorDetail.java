package qds.seperak.api.models;



import java.io.Serializable;


public class ErrorDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    private String errorCode;

    private String errorMessage;

    private String errorDetails;

    public ErrorDetail() {}

    public ErrorDetail(String errorCode, String errorMensaje, String errorDetails) {
        this.errorCode = errorCode;
        this.errorMessage = errorMensaje;
        this.errorDetails = errorDetails;
    }


    public String getErrorCode() {
        return this.errorCode;
    }


    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    public String getErrorMenssage() {
        return this.errorMessage;
    }


    public void setErrorMessage(String errorMensaje) {
        this.errorMessage = errorMensaje;
    }


    public String getErrorDetails() {
        return this.errorDetails;
    }


    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }
}

