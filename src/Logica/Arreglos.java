/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

public class Arreglos {

    // Ejercicio 50
    public float[][] sumaMedia() {
        float M[][] = {{0, 0}, {0, 0}};
        int contadorPar = 0, contadorImpar = 0;
        for (int i = 1; i < 200; i++) {
            if (i % 2 == 0) {
                M[0][0] += i;
                contadorPar++;
            } else {
                M[1][0] += i;
                contadorImpar++;
            }
        }
        M[0][1] = M[0][0] / contadorPar;
        M[1][1] = M[1][0] / contadorImpar;
        return M;
    }

    public float sumaNegativos(float a[]) {//ejercicio 52, se le debe pasar un arreglo especificamente de 10 enteros dados por el usuario, por si las moscas inicialicelo en 0 :v
        float x = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] < 0) {
                x = (x + a[i]);
            }
        }
        return x;
    }

    public void arregloPares() {//ejercicio 54
        int[] a = new int[50];
        int i = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                a[i] = j;
                i++;
            }
        }
        for (i = 0; i < 50; i++) {
            System.out.println(a[i]);

        }
    }

    // Ejercicio 60 a
    public int posicionMayor(int a[], int n) {
        int cont = 0, base = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > base) {
                cont = i;
                base = a[i];
            }
        }
        return cont + 1;
    }

    // Ejercicio 60 b
    public int posicionMenor(int[] b) {
        int cont = 0, base = b[0];

        for (int i = 1; i < 10; i++) {
            if (b[i] < base) {
                cont = i;
                base = b[i];
            }
        }
        return cont + 1;
    }

    //Ejercicio 70
    public float[][] sumaMatriz(float M[][]) {
        M[0][0] = 2;
        M[0][1] = 9;
        M[0][2] = 11;
        M[0][3] = 0;

        M[1][0] = 1;
        M[1][1] = 12;
        M[1][2] = 4;
        M[1][3] = 0;

        M[2][0] = 21;
        M[2][1] = 17;
        M[2][2] = 8;
        M[2][3] = 0;

        M[3][0] = 2;
        M[3][1] = 39;
        M[3][2] = 5;
        M[3][3] = 0;

        M[4][0] = 0;
        M[4][1] = 0;
        M[4][2] = 0;
        M[4][3] = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                M[i][3] += M[i][j];
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                M[4][j] += M[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            M[4][3] += M[4][i];
        }
        for (int i = 0; i < 4; i++) {
            M[4][3] += M[i][3];
        }
        return M;
    }

    //Ejercicio 70
    public void encriptacion(String A) {
        char c;
        int p;
        for (int i = 0; i < A.length(); i++) {
            c = A.charAt(i);
            if (i % 2 == 0) {
                p = (int) c + 2;
            } else {
                p = (int) c + 3;
            }
            c = (char) p;
            System.out.print(c);
        }
        System.out.println();
    }
}
