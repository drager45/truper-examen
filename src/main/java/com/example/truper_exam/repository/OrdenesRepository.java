package com.example.truper_exam.repository;

import com.example.truper_exam.entity.OrdenesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenesRepository extends JpaRepository<OrdenesEntity, Integer> {
}
