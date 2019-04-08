/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

public class Numeros {

    // Ejercicio 20
    public float metros(float x) {
        return (float) (x * 3.28);
    }

    public String positivoNegativo(int a) {//ejercicio 24
        if (a < 0) {
            return "Es negativo";
        } else if (a > 0) {
            return "Es Positivo";
        } else {
            return "El numero es 0";
        }
    }

    public String siguienteSegundo(int a, int b, int c) {
        //Ejercicio 32
        c=c+1;
        if (c>59){
            c=0;
            b=b+1;
            if (b>59){
                b=0;
                a=a+1;
                if (a>23){
                    a=0;
                    b=0;
                    c=0;
                }
            }
        }
        return Integer.toString(a) + ":" + Integer.toString(b) + ":" + Integer.toString(c);
    }

    // Ejercicio 30
    public float[] mayorMenor(float x, float y) {
        float A[] = new float[2];
        if (x < y) {
            A[0] = x;
            A[1] = y;
        } else {
            A[0] = y;
            A[1] = x;
        }

        return A;
    }

    public void cicloDoWhile() {//ejercicio 34
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 11);
    }

    public int sumaNumeros(int a) {//ejercicio 42
        int x = 0;
        for (int i = 0; i <= a; i++) {
            x = x + i;
        }
        return x;
    }

    public int factorial(int a) {//ejercicio 44
        int x = 1;
        for (int i = 1; i <= a; i++) {
            x = x * i;
        }
        return x;
    }

    // Ejercicio 90
    public boolean validar(char p) {
        if (p == '0' || p == '1' || p == '2'|| p == '3' 
                || p == '4' || p == '5'|| p == '6' 
                || p == '7' || p == '8' || p == '9') {
            return true;
        } else {
            return false;
        }
    }
    public double descuento(int a,float b){
        //ejercicio 92
        double total=0;
        if (a>6){
            total = ((b*a)*(0.96));
        }
        if (a>12){
            total = ((b*a)*(0.90));
        }
        return total;
    }
}
