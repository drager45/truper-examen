package com.example.truper_exam.controller.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Productos {

    @NotNull
    private String code;
    @NotNull
    private String descripcion;
    @NotNull
    private BigDecimal precio;

}
