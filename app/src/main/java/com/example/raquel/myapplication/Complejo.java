package com.example.raquel.myapplication;

public class Complejo {
    private double real, imaginario;

    public Complejo (double r, double i) {
        this.real = r;
        this.imaginario = i;
    }

    public Complejo suma (Complejo a, Complejo b) {
        // No mofidica this.real e imaginario
        return new Complejo (a.real + b.real,
                a.imaginario + b.imaginario);
        // Modifica this.real e imaginario
        //this.real = a.real + b.real;
        //this.imaginario = a.imaginario + b.imaginario;
    }
}
