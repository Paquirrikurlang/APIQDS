package qds.seperak.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import qds.seperak.api.models.DataResponse;
import qds.seperak.api.models.MatrizRequest;
import qds.seperak.api.services.MatrizService;

@RestController
@RequestMapping("/matriz")
public class MatrizController {

    @Autowired
    MatrizService matrizService;

    @ResponseBody
    @PostMapping(consumes="application/json")
    @RequestMapping(value = "/rutas", method = RequestMethod.POST, produces="application/json")
    public DataResponse rotateMatrix(@RequestBody MatrizRequest matriz){
           return this.matrizService.rotateMatrix(matriz);
    }



}
