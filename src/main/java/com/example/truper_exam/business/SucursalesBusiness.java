package com.example.truper_exam.business;

import com.example.truper_exam.entity.SucursalesEntity;

import java.util.Optional;

public interface SucursalesBusiness {

    Optional<SucursalesEntity> getSucursalByName(String name);

}
