package qds.seperak.api.models;

import org.springframework.stereotype.*;

public class MatrizRequest {

    private  Integer[][]  numeros;

    public Integer[][]  geNumeros() {
        return numeros;
    }

    public void setNumeros(Integer[][] numeros) {
        this.numeros = numeros;
    }

}
