package com.softtek.modelo.ejercicio8;

public class Calculadora {


    public float multiplicar(float num1,float num2){
        return num1*num2;
    }

    public float dividir(float num1,float num2) throws ExcepcionCalculadora{
        if(num2!=0){
            return num1/num2;
        } else{
            throw new ExcepcionCalculadora("El divisor es 0");
        }
    }

    public float restar(float num1,float num2){
        return num1-num2;
    }

    public float sumar(float num1,float num2){
        return num1+num2;
    }





}
