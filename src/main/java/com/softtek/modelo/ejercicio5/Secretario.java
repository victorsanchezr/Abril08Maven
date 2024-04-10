package com.softtek.modelo.ejercicio5;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Secretario implements InterfaceEmpleado {
    private InterfaceInforme informe;

    private String empresa;

    private String email;

    @Override
    public String getTareas() {
        return null;
    }

    @Override
    public String getInforme() {
        return null;
    }



}
