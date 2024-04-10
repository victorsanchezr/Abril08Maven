package com.softtek.modelo.ejercicio3;

public class Coche implements IVehiculo {
    private int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public String moverse() {
        if (deposito > 0) {
            return "Se mueve";
        } else {
          return  "no se mueve";
        }
    }
}
