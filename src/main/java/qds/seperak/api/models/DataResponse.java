package qds.seperak.api.models;

public class DataResponse {

    private  Integer[][]  result;
    private String status;
    private int statusCode;
    private String detalleError;


    public String getDetalleError() {
        return detalleError;
    }

    public void setDetalleError(String detalleError) {
        this.detalleError = detalleError;
    }


    public Integer[][] getResult() {
        return result;
    }

    public void setResult(Integer[][] result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


}
