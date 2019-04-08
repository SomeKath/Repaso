/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Scanner;

public class TerminadosEn6 {

    Scanner num = new Scanner(System.in);

    //Ejercicio 26
    public void ParImpar(int a) {

        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    // Ejercicio 36
    public int Pares() {
        for (int a = 1; a <= 25; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
        return 0;
    }

    // Ejercicio 46
    public float Media() {
        float a, x, aux = 0;
        System.out.println("Ingrese la cantidad de numeros a evaluar");

        a = num.nextFloat();

        for (int i = 0; i < a; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            x = num.nextFloat();
            aux += x;
        }
        x = aux / a;

        return x;
    }

    // Ejercicio 56
    public void CopiaConsecutivos(int a) {
        int arrayX[] = new int[5];
        int arrayY[] = new int[5];
        a += 1;
        for (int i = 0; i < 5; i++) {
            arrayX[i] = a;
            a++;
        }
        for (int i = 0; i < 5; i++) {
            arrayY[i] = arrayX[i];
            System.out.println("a+" + (i + 1) + "= " + arrayX[i]);
        }

    }

    //Ejercicio 66
    public int[][] MultMatriz() {

        int array[][] = new int[3][3];
        array[0][0] = 5;
        array[0][1] = 6;
        array[0][2] = 13;
        array[1][0] = 14;
        array[1][1] = 2;
        array[1][2] = 4;
        array[2][0] = 21;
        array[2][1] = 7;
        array[2][2] = 6;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] *= 2;
            }
        }
        return array;
    }

    // Ejercicio 76
    public char[] sinEspacios(String palabra){
        char[] A=new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i)!=' ') {
                A[i]=palabra.charAt(i);
            }
        }
        
        return A;
    }
    
}
