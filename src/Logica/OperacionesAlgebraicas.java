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
public class OperacionesAlgebraicas {
    
    public float evalua12(float a,float b,float c){
        return ((a+7*c)/(b+2-a)+2*b);
    }
    public double evalua14(double a,double b,double c){
        return (-b + (Math.sqrt((Math.pow(b,2)-4*a*c)))/(2*a));
    }

    
}
