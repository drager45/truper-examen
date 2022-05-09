package com.example.truper_exam.business;

import com.example.truper_exam.controller.request.SaveOrden;
import com.example.truper_exam.entity.OrdenesEntity;

import java.util.List;

public interface OrdenesBusiness {

    void saveOrdenCompra(SaveOrden saveOrden);
    List<OrdenesEntity> getAll();

}
