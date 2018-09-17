package com.example.raquel.myapplication;

import com.example.raquel.myapplication.Funcion;


import java.util.ArrayList;

public class Polinomio implements Funcion {
    ArrayList<Double> coef;
    public Polinomio(){
        coef = new ArrayList<Double>();
    }

    public void add (double a){
        coef.add(a);
    }

    public double calcular (double x){

        double res = 0;

        for (int i = 0; i < coef.size(); i++){
            res += Math.pow(x, i) * coef.get(i);
        }
        return res;
    }
}
