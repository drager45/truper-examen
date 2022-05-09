package com.example.truper_exam.repository;

import com.example.truper_exam.entity.ProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductosRepsoitory extends JpaRepository<ProductosEntity, Integer> {

    Optional<ProductosEntity> findByCodigo(String name);

}
