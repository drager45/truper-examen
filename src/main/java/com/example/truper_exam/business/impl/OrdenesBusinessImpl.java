package com.example.truper_exam.business.impl;

import com.example.truper_exam.business.OrdenesBusiness;
import com.example.truper_exam.business.ProductosBusiness;
import com.example.truper_exam.business.SucursalesBusiness;
import com.example.truper_exam.controller.request.Productos;
import com.example.truper_exam.controller.request.SaveOrden;
import com.example.truper_exam.entity.OrdenesEntity;
import com.example.truper_exam.entity.ProductosEntity;
import com.example.truper_exam.entity.SucursalesEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class OrdenesBusinessImpl implements OrdenesBusiness {

    @Autowired
    private SucursalesBusiness sucursalesBusiness;

    @Autowired
    private ProductosBusiness productosBusiness;

    @Autowired
    private OrdenesBusiness ordenesBusiness;

    @Override
    public void saveOrdenCompra(SaveOrden saveOrden) {
        try {
            Optional<SucursalesEntity> sucursal = sucursalesBusiness.getSucursalByName(saveOrden.getSucursal());
            if (sucursal.isPresent()) {
                validProductos(saveOrden.getListProducts());
            } else {
                throw new Exception("La sucursal no esta registrada");
            }
        } catch (Exception ex) {

        }
    }

    @Override
    public List<OrdenesEntity> getAll() {
        return null;
    }

    private List<ProductosEntity> validProductos(List<Productos> listProducts) throws Exception {
        List<ProductosEntity> altaProducto = new ArrayList<>();
        List<String> productos = new ArrayList<>();
        listProducts.stream().forEach(producto-> {
            Optional<ProductosEntity> prod = productosBusiness.findProductoByCodigo(producto.getCode());
            if (prod.isPresent()) {
                altaProducto.add(prod.get());
            } else  {
                productos.add(producto.getCode());
            }
        });
        if (!productos.isEmpty()) {
            String message = "Los productos no estan registrados: " + String.join(",", productos);
            throw new Exception(message);
        }
        return altaProducto;
    }

}
