/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.Arreglos;
import Logica.Numeros;
import Logica.OperacionesAlgebraicas;
import Logica.OperacionesBasicas;
import Logica.OperacionesGeometricas;
import Logica.TerminadasEn8;
import Logica.TerminadosEn6;
import java.util.Scanner;

public class Main {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        OperacionesBasicas op = new OperacionesBasicas();
        OperacionesGeometricas og = new OperacionesGeometricas();
        OperacionesAlgebraicas oa = new OperacionesAlgebraicas();
        Numeros num = new Numeros();
        Arreglos ar = new Arreglos();
        TerminadosEn6 t6 = new TerminadosEn6();
        TerminadasEn8 t8 = new TerminadasEn8();

        int opcion, a, b, c, B[] = {23, 45, 68, 99, 10, 15, 4}, N[][];
        float x, y, A[], M[][];
        double m, n, o;
        String cadena = "";
        char p, C[];
        boolean bool;
        do {
            System.out.println("Elija una opcion.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 2:
                    a = 7;
                    b = 4;
                    System.out.println("Ejercicio 2 Suma dos numeros: ");
                    System.out.println("a: " + a + " b: " + b);
                    System.out.println("Suma: " + op.suma(a, b));
                    break;
                case 4:
                    a = 10;
                    b = 2;
                    System.out.println("Ejercicio 4 Operaciones básicas: ");
                    System.out.println("a: " + a + " b: " + b);
                    System.out.println("Suma: " + op.suma(a, b));
                    System.out.println("Resta: " + op.resta(a, b));
                    System.out.println("Division:  " + op.division(a, b));
                    System.out.println("Multiplicacion: " + op.multiplica(a, b));
                    break;
                case 6:
                    x = 3;
                    y = 4;
                    System.out.println("Ejercicio 6 Area rectángulo:  ");
                    System.out.println("lado 1: " + x + " lado 2: " + y);
                    System.out.println("Area del Recatangulo: " + og.areaRectangulo(x, y));
                    break;
                case 8:
                    System.out.print("Ejercicio 8 Area Triangulo: \n");
                    System.out.print("Ingrese la base: ");
                    x = sc.nextFloat();
                    System.out.print("Ingrese la altura: ");
                    y = sc.nextFloat();
                    System.out.println("Area: " + og.areaTriangulo(x, y));
                    break;
                case 10:
                    System.out.print("Ejercicio 10 Velocidad: \n");
                    System.out.print("Ingrese la distancia(km): ");
                    x = sc.nextFloat();
                    System.out.print("Ingrese el tiempo (min): ");
                    y = sc.nextFloat();
                    System.out.println("Velocidad: " + og.velocidad(x, y) + " m/s");
                    break;
                case 12:
                    System.out.print("Ejercicio 12 Evaluar una expresion: \n");
                    System.out.print("Ingrese a: ");
                    m = sc.nextDouble();
                    System.out.print("Ingrese b: ");
                    n = sc.nextDouble();
                    System.out.print("Ingrese c: ");
                    o = sc.nextDouble();
                    System.out.println("El resultado de la expresion es: "
                            + oa.evalua12(m, n, o));
                    break;
                case 14:
                    System.out.println("Ejercicio 14 Evaluar una expresion: ");
                    System.out.print("Ingrese a: ");
                    m = sc.nextDouble();
                    System.out.print("Ingrese b: ");
                    n = sc.nextDouble();
                    System.out.print("Ingrese c: ");
                    o = sc.nextDouble();
                    if (m < 0) {
                        System.out.println("a debe ser mayor a cero");
                    } else {
                        System.out.println("El resultado de la expresion es: "
                                + oa.evalua14(m, n, o));
                    }
                    break;
                case 16:
                    System.out.println("Ejercicio 16 Hipotenusa de un triangulo:");
                    System.out.print("Ingrese el cateto 1: ");
                    x = sc.nextFloat();
                    System.out.print("Ingrese el cateto 2: ");
                    y = sc.nextFloat();
                    System.out.println("La hipotenusa es: " + og.hipotenusa(x, y));
                    break;
                case 18:
                    System.out.println("Ejercicio 18 Horas, minutos y segundos en x segundos:");
                    t8.HHMMSS();
                    break;
                case 20:
                    System.out.println("Ejercicio 20 m a ft:");
                    System.out.println("Ingrese la cantidad de metros a convertir");
                    x = sc.nextFloat();
                    System.out.println((int) x + " metros son: " + num.metros(x) + " pies.");
                    break;
                case 22:
                    System.out.println("Ejercicio 22 Division y residuo:");
                    System.out.print("Ingrese A: ");
                    a = sc.nextInt();
                    System.out.print("Ingrese B: ");
                    b = sc.nextInt();
                    System.out.println("A/B: " + op.division(a, b)
                            + "y el residuo: " + op.divisionModulo(a, b));
                    break;
                case 24:
                    System.out.println("Ejercicio 24 Numero negativo:");
                    System.out.print("Ingrese un numero: ");
                    a = sc.nextInt();
                    System.out.println(num.positivoNegativo(a));
                    break;
                case 26:
                    System.out.println("Ejercicio 26 Par o impar:");
                    System.out.print("Ingrese un numero: ");
                    a = sc.nextInt();
                    t6.ParImpar(a);
                    break;
                case 28:
                    System.out.println("Ejercicio 28 Dia de la semana:");
                    System.out.print("Ingrese un numero: ");
                    a = sc.nextInt();
                    t8.DSemana(a);
                    break;
                case 30:
                    A = new float[2];
                    System.out.println("Ejercicio 30 Mayor y menor:");
                    System.out.print("Ingrese el primer numero: ");
                    x = sc.nextFloat();
                    System.out.print("Ingrese el segundo numero: ");
                    y = sc.nextFloat();
                    if (x == y) {
                        System.out.println("Los numeros son iguales");
                    } else {
                        A = num.mayorMenor(x, y);
                        System.out.println("Numero menor: " + A[0]
                                + " Numero mayor: " + A[1]);
                    }
                    break;
                case 32:
                    System.out.println("Ejercicio 32 Siguiente segundo:");
                    System.out.print("Ingrese las horas: ");
                    a = sc.nextInt();
                    System.out.print("Ingrese los minutos: ");
                    b = sc.nextInt();
                    System.out.print("Ingrese los segundos: ");
                    c = sc.nextInt();
                    //System.out.println("num.segundo(a,b,c)");
                    break;
                case 34:
                    System.out.println("Ejercicio 34 Ciclo do-while:");
                    num.cicloDoWhile();
                    break;
                case 36:
                    System.out.println("Ejercicio 36 Pares entre 1 y 25:");
                    t6.Pares();
                    break;
                case 38:
                    System.out.println("Ejercicio 38 Sumatoria 1-10:");
                    System.out.println("Suma: " + t8.sumatoria());
                    break;
                case 40:
                    System.out.println("Ejercicio 40 \"Escribir un programa "
                            + "que realice la pregunta ¿desea continuar?...\""
                            + "\n \t Este programa se basa en este ciclo :D");
                    break;
                case 42:
                    System.out.println("Ejercicio 42 Suma de 1 hasta n:");
                    System.out.print("Ingrese n: ");
                    a = sc.nextInt();
                    System.out.println("Suma: " + num.sumaNumeros(a));
                    break;
                case 44:
                    System.out.println("Ejercicio 44 Factorial de un numero:");
                    System.out.print("Ingrese un numero: ");
                    a = sc.nextInt();
                    if (a < 0) {
                        System.out.println("El numero debe ser positivo");
                    }
                    if (a == 0 || a == 1) {
                        System.out.println("Factorial: 1");
                    } else {
                        System.out.println("Factorial: " + num.factorial(a));
                    }
                    break;
                case 46:
                    System.out.println("Ejercicio 46 Media de x numeros:");
                    System.out.println("La media es: " + t6.Media());
                    break;
                case 48:
                    System.out.println("Ejercicio 48 Primo o no: ");
                    System.out.print("Introduzca un numero: ");
                    a = sc.nextInt();
                    if (a == 2 || a == 3 || a == 5 || a == 7) {
                        System.out.println(a + " Es primo");
                    } else {
                        if (t8.NumerosPrimos(a)) {
                            System.out.println(a + " Es primo");
                        } else {
                            System.out.println(a + " No es primo");
                        }
                    }
                    break;
                case 50:
                    System.out.println("Ejercicio 50 Suma Pares e impares:");
                    M = ar.sumaMedia();
                    System.out.println("Suma pares: " + M[0][0]
                            + ", Media: " + M[0][1] + "\nSuma impares: " + M[1][0]
                            + ", Media: " + M[1][1]);
                    break;
                case 52:
                    System.out.println("Ejercicio 52 Leer 10 datos, sumar negativos:");
                    A = new float[10];
                    for (int i = 0; i < 10; i++) {
                        System.out.print("\nIngrese el numero " + (i + 1));
                        A[i] = sc.nextFloat();
                    }
                    System.out.println("Suma de los negativos: " + ar.sumaNegativos(A));
                    break;
                case 54:
                    System.out.println("Ejercicio 54 Arreglo Pares 1-100:");
                    ar.arregloPares();
                    break;
                case 56:
                    System.out.println("Ejercicio 56 Arreglo Consecutivo y copia:");
                    System.out.print("Ingrese un numero a: ");
                    a = sc.nextInt();
                    t6.CopiaConsecutivos(a);
                    break;
                case 58:
                    System.out.println("Ejercicio 58 Arreglo Veinte primeros "
                            + "pares y sume:");
                    B = t8.SumArreglo();
                    for (int i = 0; i < 20; i++) {
                        System.out.print(" " + B[i]);
                    }
                    System.out.println("");
                    break;
                case 60:
                    System.out.println("Ejercicio 60 Posicion máximo valor: ");
                    System.out.println("El numero mayor está en la posicion: " + ar.posicionMayor(B, 6));
                    break;
                case 62:
                    B = new int[10];
                    System.out.println("Ejercicio 62 Posicion máximo "
                            + "valor por pantalla:");
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Ingrese el valor " + (i + 1) + ": ");
                        B[i] = sc.nextInt();
                    }
                    System.out.println("El numero mayor está en la posicion: " + ar.posicionMayor(B, 10));
                    System.out.println("El numero menor está en la posicion: " + ar.posicionMenor(B));
                    break;
                case 64:
                    System.out.println("Ejercicio 64 Valor máximo en matriz: ");
                    // mostrar matriz
                    System.out.println("El valor maximo se encuentra en: " /* llamar funcion*/);
                    break;
                case 66:
                    System.out.println("Ejercicio 66 Matriz por escalar:");
                    System.out.println("Matriz original: ");
                    N = t6.MultMatriz();
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(N[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 68:
                    System.out.println("Ejercicio 68 Sume y almacene matriz:");
                    System.out.println("Matriz original: ");
                    t8.SumMatriz();
                    break;
                case 70:
                    System.out.println("Ejercicio 70 Sume filas y columnas:");
                    M = new float[5][4];
                    M = ar.sumaMatriz(M);
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print("[" + (int) M[i][j] + "] ");
                        }
                        System.out.println();
                    }
                    break;
                case 72:
                    System.out.println("Ejercicio 72 Primos entre 1-100:");
                    //ar.primos();
                    break;
                case 74:
                    System.out.println("Ejercicio 74 Inversa cadena de caracteres:");
                    System.out.print("Ingrese una cadena de caracteres: ");
                    cadena = sc.next();
                    System.out.println("Cadena original: " + cadena);
                    System.out.println("Cadena inversa: " /*+ ar.cadenaInversa */);
                    break;
                case 76:
                    System.out.println("Ejercicio 76 Eliminar blancos en cadena:");
                    System.out.print("Ingrese una cadena de caracteres: ");
                    cadena = sc.next();
                    System.out.println("Cadena original: " + cadena);
                    C = t6.sinEspacios(cadena);
                    System.out.println("Cadena sin espacios: ");
                    for (int i = 0; i < cadena.length(); i++) {
                        System.out.print(C[i]);
                    }
                    System.out.println("");
                    break;
                case 78:
                    System.out.println("Ejercicio 78 Invertir mayúsculas y minúsculas:");
                    System.out.print("Ingrese una cadena de caracteres: ");
                    cadena = sc.next();
                    System.out.println("Cadena original: " + cadena);
                    System.out.print("Cadena con mayúsculas y minúsculas "
                            + "invertidas: ");
                    C = t8.MayMin(cadena);
                    for (int i = 0; i < cadena.length(); i++) {
                        System.out.print(C[i]);
                    }
                    System.out.println("");
                    break;
                case 80:
                    System.out.println("Ejercicio 80 Encriptacion:");
                    System.out.print("Ingrese una cadena de caracteres: ");
                    cadena = sc.next();
                    System.out.print("La frase convertida es: ");
                    ar.encriptacion(cadena);
                    break;
                case 82:
                    System.out.println("Ejercicio 82 Conteo de letras:");
                    System.out.print("Ingrese una cadena de caracteres terminada en punto: ");
                    cadena = sc.next();
                    if (cadena.charAt(cadena.length() - 1) != '.') {
                        System.out.println("La frase debe terminar en punto");
                    } else {
                        //ar.conteo(cadena);
                    }
                    break;
                case 84:
                    System.out.println("Ejercicio 84 Comparar dos arreglos:");
                    System.out.print("Ingrese una cadena de caracteres: ");
                    cadena = sc.next();
                    //ar.comparar(cadena);
                    break;
                case 86:
                    System.out.println("Ejercicio 86 Palindromo:");
                    System.out.print("Ingrese una cadena de caracteres: ");
                    cadena = sc.next();
                    if (ar.Palind(cadena)) {
                        System.out.println("\"" + cadena + "\"" + " Es palindromo");
                    } else {
                        System.out.println("\"" + cadena + "\"" + " No es palindromo");
                    }
                    break;
                case 88:
                    System.out.println("Ejercicio 88 Potencia:");
                    System.out.print("Ingrese un numero para calcular su potencia: ");
                    a = sc.nextInt();
                    System.out.print("A qué potencia desea elevarlo: ");
                    b = sc.nextInt();
                    System.out.println(a + " elevado a la " + b + " es: " + t8.Pow(a, b));
                    break;
                case 90:
                    System.out.println("Ejercicio 90 Numero o no: ");
                    System.out.print("Ingrese un caracter: ");
                    p = sc.next().charAt(0);
                    bool = num.validar(p);
                    if (bool) {
                        System.out.println(p + " Es un numero");
                    } else {
                        System.out.println(p + " No es un numero");
                    }
                    break;
                case 92:
                    System.out.println("Ejercicio 92 Precios y descuentos: ");
                    System.out.print("Cuantas unidades desea comprar: ");
                    a = sc.nextInt();
                    System.out.print("De qué precio cada una: ");
                    x = sc.nextFloat();
                    //System.out.println("Total a pagar: " + num.precio(a,x));
                    break;
                case 94:
                    System.out.println("Ejercicio 94 Mes:");
                    System.out.print("Introduzca un numero: ");
                    a = sc.nextInt();
                    if (a < 1 || a > 12) {
                        System.out.println("El numero está fuera de los límites");
                    } else {
                        // num.mes(a);
                    }
                    break;
                case 96:
                    System.out.println("Ejercicio 96 Serie de numeros:");
                    bool = true;
                    do {
                        System.out.print("Ingrese el numero: ");
                        cadena = sc.next();
                        if (cadena.length() == 1) {
                            bool = false;
                        }
                        //num.94(Integer.parseInt(cadena));
                    } while (bool);
                    break;
                default:
                    System.out.println("Esta opcion no está en el menú:");
            }
            System.out.println("Si desea repetir el programa, oprima \"1\" si no \"0\"");
            opcion = sc.nextInt();
        } while (opcion != 0);
        System.out.println("Adios");
    }

}
