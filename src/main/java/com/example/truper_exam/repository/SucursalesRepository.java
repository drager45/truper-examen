package com.example.truper_exam.repository;

import com.example.truper_exam.entity.SucursalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SucursalesRepository extends JpaRepository<SucursalesEntity, Integer> {

    Optional<SucursalesEntity> findByName(String name);
}
