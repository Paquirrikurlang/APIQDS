package qds.seperak.api.repositories;

import org.springframework.stereotype.Repository;
import qds.seperak.api.models.MatrizRequest;
import qds.seperak.api.models.MatrizRequest;

@Repository
public class MatrizRepositoryImpl implements MatrizRepository {

    public Integer[][] rotateMatrix(MatrizRequest matriz){

        Integer filas = matriz.geNumeros()[0].length;
        Integer columnas = matriz.geNumeros().length;
        Integer[][] arrayPadre = new Integer[filas][columnas];
        Integer filasBase = filas,contadorFila=0;

        for (int i=0; i< filasBase ; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < filas; k++){
                    if ((filas -(k+1))==i) {
                        arrayPadre[i][contadorFila]=matriz.geNumeros()[j][k];
                        contadorFila +=1;
                    }
                }
            }
            contadorFila=0;
        }
        return  arrayPadre;
    }
}
