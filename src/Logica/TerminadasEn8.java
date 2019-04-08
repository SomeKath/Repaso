/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Scanner;

public class TerminadasEn8 {

    Scanner sc = new Scanner(System.in);

    // Ejercicio 18
    public void HHMMSS() {
        int h, m, s;
        s = 3700;
        h = s / 3600;
        s = s % 3600;
        m = s / 60;
        s = s % 60;
        System.out.println("El tiempo en formato HHMMSS es:  " + h + ":" + m + ":" + s);
    }

    // Ejercicio 28
    public void DSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Es lunes!");
                break;
            case 2:
                System.out.println("Es martes!");
                break;
            case 3:
                System.out.println("Es miercoles!");
                break;
            case 4:
                System.out.println("Es jueves!");
                break;
            case 5:
                System.out.println("Es viernes!");
                break;
            case 6:
                System.out.println("Es sabado!");
                break;
            case 7:
                System.out.println("Es domingo!");
                break;

        }
    }

    // Ejercicio 38
    public int sumatoria() {
        int k;
        k = (10 * (10 + 1));
        k /= 2;

        return k;
    }

    // Ejercicio 48
    public boolean NumerosPrimos(int num) {

        if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
            return false;
        } else {
            return true;
        }
    }

    //Ejercicio 58
    public int[] SumArreglo() {
        int a, b, array[] = new int[20];
        a = 2;
        b = 0;
        for (int i = 0; i < 20; i++) {
            array[i] = a;
            b += a;
            a += 2;
        }
        return array;
    }

    //Ejercicio 68
    public void SumMatriz() {
        int a, b, array[][] = new int[2][5];

        array[0][0] = 5;
        array[0][1] = 6;
        array[0][2] = 7;
        array[0][3] = 9;
        array[0][4] = 0;
        array[1][0] = 11;
        array[1][1] = 8;
        array[1][2] = 2;
        array[1][3] = 0;
        array[1][4] = 0;
        for (int i = 0; i < 4; i++) {
            array[0][4] += array[0][i];
        }
        for (int i = 0; i < 4; i++) {
            array[1][4] += array[1][i];
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Ejercicio 78
    public char[] MayMin(String a) {
        char A[] = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(A[i])) {
                A[i] = Character.toLowerCase(A[i]);
            } else {
                A[i] = Character.toUpperCase(A[i]);
            }

        }
        return A;
    }

    //Ejercicio 88
    public int Pow(int a, int b) {
        int pow = a;
        for (int i = 1; i < b; i++) {
            pow *= a;
        }
        return pow;
    }

}
