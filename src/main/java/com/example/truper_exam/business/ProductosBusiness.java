package com.example.truper_exam.business;

import com.example.truper_exam.entity.ProductosEntity;

import java.util.Optional;

public interface ProductosBusiness {

    Optional<ProductosEntity> findProductoByCodigo(String codigo);

}
