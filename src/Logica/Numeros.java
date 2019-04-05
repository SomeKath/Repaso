/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author torre
 */
public class Numeros {
    
    public String positivoNegativo(int a){//ejercicio 24
        if (a < 0){
            return "Es negativo";
        }
        else
            if (a > 0){
                return "Es Positivo";
            }
            else {
                return "El numero es 0";
            }
    }
    
    public int siguienteSegundo(int a,int b,int c){//por revisar
        return 1;
    }
    public void cicloDoWhile(){//ejercicio 34
        int i = 1;
        do {            
            System.out.println(i);
            i =+ 1;
        } while (i<11);
    }
    public int sumaNumeros(int a){//ejercicio 42
        int x = 0;
        for (int i = 0; i < a; i++) {
            x = x+i;
        }
        return x;
    }
    
    public int factorial(int a){//ejercicio 44
        int x = 1;
        for (int i = 1; i <= a; i++) {
            x = x*i;
        }
        return x;
    }
    public int sumaNegativos(int a[]){//ejercicio 52, se le debe pasar un arreglo especificamente de 10 enteros dados por el usuario, por si las moscas inicialicelo en 0 :v
        int x = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i]<0){
                x = (x+a[i]);
            }
        }
        return x;
    }
    public void arregloPares(){//ejercicio 54
        int[] a  = new int[50];
            for (int i = 0; i <= 50; i++) {
                for (int j = 1; j <= 100; j++) {
                    if (j%2==0){
                        a[i]=j;
                        System.out.println(a[i]);
                    }
                }
        }
    }
}
