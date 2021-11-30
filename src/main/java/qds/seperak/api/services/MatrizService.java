package qds.seperak.api.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.val;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import qds.seperak.api.models.DataResponse;
import qds.seperak.api.models.ErrorDetail;
import qds.seperak.api.models.ErrorResponse;
import qds.seperak.api.models.MatrizRequest;
import qds.seperak.api.repositories.MatrizRepository;
import qds.seperak.api.repositories.MatrizRepositoryImpl;
import qds.seperak.api.util.Constantes;

import java.util.List;

@Service
public class MatrizService {

    private static final long serialVersionUID = 1L;
    private static Logger logger = LogManager.getLogger(MatrizService.class);

    @Autowired
    MatrizRepository matrixRepository;

    public DataResponse rotateMatrix(MatrizRequest matriz){

        ErrorResponse errorResponse = new ErrorResponse();
        ErrorDetail errorDetail = new ErrorDetail();
        DataResponse dataResponse = new DataResponse();
        Integer[][] result;
        String respuesta = "";
        String nombreMetodo = "rotateMatrix";
        long tiempoInicio = System.currentTimeMillis();
        String mensajeLog = "[" + nombreMetodo +  "]";
        String separador ="------------------------------------------";

        try {
            String peticion = (new ObjectMapper()).writeValueAsString(matriz.geNumeros());
            logger.info(mensajeLog + separador);
            logger.info(mensajeLog + "[INICIO METODO " + nombreMetodo + "- Service ]");
            logger.info(mensajeLog + separador);
            logger.info(mensajeLog + " Envío de datos para método rotateMatrix : " + peticion);

            if (matriz.geNumeros() == null) {
                 dataResponse.setStatus("Error");
                 dataResponse.setStatusCode(400);
                 dataResponse.setDetalleError(Constantes.RPTA_400_MESSAGE);
                 return dataResponse;
            }
            result=matrixRepository.rotateMatrix(matriz);

            if (result.length <= 0) {
                dataResponse.setStatus("No Content");
                dataResponse.setStatusCode(204);
                dataResponse.setDetalleError(Constantes.RPTA_204_12_MESSAGE);
                return dataResponse;
            }

        } catch (Exception e) {
            logger.error(mensajeLog + "Internal server error :" + e);
            dataResponse.setStatus("Error");
            dataResponse.setStatusCode(500);
            dataResponse.setDetalleError(Constantes.RPTA_ERROR_MESSAGE);
            return  dataResponse;
        }

         result=matrixRepository.rotateMatrix(matriz);
         dataResponse.setResult(result);
         dataResponse.setStatus("OK");
         dataResponse.setStatusCode(200);
         return dataResponse;
    }

}
