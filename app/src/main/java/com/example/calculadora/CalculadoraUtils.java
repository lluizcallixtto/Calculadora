package com.example.calculadora;

public class CalculadoraUtils {
    private double numero1;
    private double numero2;

    public CalculadoraUtils(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double somar() {
        return numero1 + numero2;
    }

    public double subtrair() {
        return  numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if(numero2 != 0) {
            return numero1 / numero2;
        } else {
            throw new IllegalArgumentException("Divisão por zero não é permitada");
        }
    }

}
