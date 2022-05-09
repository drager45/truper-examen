package com.example.truper_exam.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;

@Entity
@Table(name = "suscursales")
@Data
@Builder(setterPrefix = "set", toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class SucursalesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sucursal_id")
    private Integer sucursalId;

    @Column(name = "nombre")
    private String name;


}
