package com.example.truper_exam.controller.response;

import com.example.truper_exam.controller.request.Productos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrdenesResponse {

    private String sucursal;
    private List<Productos> listProducts;

}
