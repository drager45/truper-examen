package com.example.truper_exam.business.impl;

import com.example.truper_exam.business.SucursalesBusiness;
import com.example.truper_exam.entity.SucursalesEntity;
import com.example.truper_exam.repository.SucursalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SucusalesBusinessImpl implements SucursalesBusiness {

    @Autowired
    private SucursalesRepository sucursalesRepository;

    @Override
    public Optional<SucursalesEntity> getSucursalByName(String name) {
        Optional<SucursalesEntity> sucursal = sucursalesRepository.findByName(name);
        if (sucursal.isPresent()) {
            return sucursal;
        }
        return Optional.empty();
    }

}
