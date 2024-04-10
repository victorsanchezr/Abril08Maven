package com.softtek.modelo.ejercicio7;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    private int ID;
    private String nombre;
    private String precio;
    private String proveedor;
    private String descripcion;

    private void comprobar() throws ExcepcionEx {
        if (ID==0){
            throw new ExcepcionEx("No tiene ID");
        }
    }


}
