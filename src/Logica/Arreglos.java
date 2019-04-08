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
    
    public String posicionMayorMatriz(int[][] a){
        //ejercicio 64
        int mayor = 0;
        int columna = 0;
        int fila = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {  
                if  (a[i][j]>mayor){
                    mayor=(a[i][j]);
                    columna=i+1;
                    fila=j+1;
                }
            }
        }
        String texto = Integer.toString(columna);
        String texto1 = Integer.toString(fila);
        String textoFinal= texto+","+ texto1;
        return textoFinal;
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
    public void arregloPrimos(){
        //ejercicio 74
        int[] a = new int [100];
        int divisores = 0;
        int primos = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    divisores=divisores+1;
                }   
            }
            if (divisores==2){
                    primos=primos+1;
                        a[primos]=i;
                } 
            divisores=0;
        }
        for (int i = 1; i <= 25; i++) {
                    System.out.println(a[i]);
        }
    }
    public String cadenaInvertida(String cadena){
        //ejercicio 74
        String cadenaInvertida = "";
        for (int i=cadena.length()-1;i>=0;i--)
		cadenaInvertida = cadenaInvertida + cadena.charAt(i);
        return cadenaInvertida;
    }
    public void fraseAbecedario(String frase){
        int a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,s,t,u,v,w,x,y,z = 0;
        for (int miau = frase.length(); miau>=0; miau--) {
            
        }
    }
    public boolean compararFrase (String a, String b){
        //ejercicio 84
        return a.equals(b);
    }
}
