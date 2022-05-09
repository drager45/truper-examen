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
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "ordenes")
@Data
@Builder(setterPrefix = "set", toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class OrdenesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orden_id")
    private Integer ordenId;

    @ManyToOne
    @JoinColumn(name = "sucursal_id", referencedColumnName = "sucursal_id")
    private SucursalesEntity sucursales;

    @Column(name = "fecha")
    private Timestamp date;

    @Column(name = "total")
    private BigDecimal total;

}
