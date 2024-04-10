package com.softtek.modelo.ejercicio5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jefe implements InterfaceEmpleado {

    private InterfaceInforme informe;




    public void setInforme(InterfaceInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return null;
    }

    @Override
    public String getInforme() {
        return null;
    }
}
