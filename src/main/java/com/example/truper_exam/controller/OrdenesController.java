package com.example.truper_exam.controller;

import com.example.truper_exam.business.OrdenesBusiness;
import com.example.truper_exam.controller.request.SaveOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET})
@RequestMapping("/ordenes")
public class OrdenesController {

    @Autowired
    private OrdenesBusiness ordenesBusiness;

    @PostMapping("/save-orden")
    public ResponseEntity<Boolean> saveOrdenCompra(
            @Validated @RequestBody SaveOrden saveOrden) {
        try {
            ordenesBusiness.saveOrdenCompra(saveOrden);
            return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
