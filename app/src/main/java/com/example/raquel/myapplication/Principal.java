package com.example.raquel.myapplication;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void haz_algo(String s){
        s = s + "adios";
        System.out.println(s);
    }

    public static void main(String arg[]){
        /*//System.out.println("Hola mundo\n");

        //int a = 0;

        //int b = 3;

        //haz_algo (a, b);
        //System.out.println(a);

        String a = "adios";
        String b = "Hola";
        for ( int i = 0; i < a.length(); i ++)
            System.out.println(a.charAt (i));

        if (a.equals (b)){
            System.out.println("Si");
        } else {
            System.out.println("No");
        }

        String adios = "adios";

        //-----------------------
        //try, catch, finally
        //-----------------------

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(a.charAt(i));
            }
            System.out.println("Todo OK");
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            System.out.println("Error WTF");

        } finally {
            System.out.println("Esto siempre se hace");
        }


        //----------------------------------------------------*/
         /*Funcion s = new Seno ();
        System.out.println (s.calcular(1.0));*/

        ArrayList<Funcion> fun =
                new ArrayList<Funcion>();

        fun.add(new Seno());
        fun.add(new Logaritmo());

        Polinomio pol1 = new Polinomio();
        pol1.add(1.0);
        pol1.add(3.0);
        pol1.add(6.0);
        fun.add(pol1);

        for (int i = 0; i < fun.size(); i++){
            Funcion f = fun.get(i);
            System.out.println (f.calcular(1.0));
        }


    }

}