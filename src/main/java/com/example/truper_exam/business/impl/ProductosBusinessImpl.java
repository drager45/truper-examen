package com.example.truper_exam.business.impl;

import com.example.truper_exam.business.ProductosBusiness;
import com.example.truper_exam.entity.ProductosEntity;
import com.example.truper_exam.repository.ProductosRepsoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductosBusinessImpl implements ProductosBusiness {

    @Autowired
    private ProductosRepsoitory productosRepsoitory;

    @Override
    public Optional<ProductosEntity> findProductoByCodigo(String codigo) {
        Optional<ProductosEntity> producto = productosRepsoitory.findByCodigo(codigo);
        if (producto.isPresent()) {
            return producto;
        }
        return Optional.empty();
    }

}
