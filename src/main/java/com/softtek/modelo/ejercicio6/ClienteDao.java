package com.softtek.modelo.ejercicio6;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ClienteDao {

    private IDAO conexion;

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }
}
