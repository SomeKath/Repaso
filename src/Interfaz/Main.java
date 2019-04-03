/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.OperacionesBasicas;
import Logica.OperacionesGeometricas;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Main {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        OperacionesBasicas op = new OperacionesBasicas();
        OperacionesGeometricas og = new OperacionesGeometricas();
        int opcion, a, b;
        float x, y;
        double w, z;
        do {
            System.out.println("Elija una opcion.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 2:
                    a = 7;
                    b = 4;
                    System.out.println("Ejercicio 2: ");
                    System.out.println("a: " + a + " b: " + b);
                    System.out.println("Suma: " + op.suma(a, b));
                    break;
                case 4:
                    a = 10;
                    b = 2;
                    System.out.println("Ejercicio 4: ");
                    System.out.println("a: " + a + " b: " + b);
                    System.out.println("Suma: " + op.suma(a, b));
                    System.out.println("Resta: " + op.resta(a, b));
                    System.out.println("Division:  " + op.division(a, b));
                    System.out.println("Multiplicacion: " + op.multiplica(a, b));
                    break;
                case 6:
                    x = 3;
                    y = 4;
                    System.out.println("Ejercicio 6: ");
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
                    System.out.println("Velocidad: " + og.velocidad(x, y)+" m/s");
                    break;
                case 12:
                    break;
                default:
                    System.out.println("Esta opcion no está en el menú");
            }
            System.out.println("Si desea repetir el programa, oprima \"1\" si no \"0\"");
            opcion = sc.nextInt();
        } while (opcion != 0);
    }

}
