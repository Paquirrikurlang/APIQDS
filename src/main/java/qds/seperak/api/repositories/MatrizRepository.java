package qds.seperak.api.repositories;

import qds.seperak.api.models.MatrizRequest;

public interface MatrizRepository {
    public Integer[][] rotateMatrix(MatrizRequest matriz);
}
