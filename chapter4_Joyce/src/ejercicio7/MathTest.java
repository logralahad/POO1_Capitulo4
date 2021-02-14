/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Random;

/**
 *
 * @author logra
 */
public class MathTest {
    
    private Double x;

    public MathTest(Double x) {
        this.x = x;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }
    
    public void squareRoot(){
        System.out.println("Raiz cuadrada: " + Math.sqrt(x));
    }
    
    public void senX(){
        System.out.println("Seno: " + Math.sin(x));
    }
    
    public void cosX(){
        System.out.println("Coseno: " + Math.cos(x));
    }
    
    public void integralValues(){
        System.out.println("Floor: " + Math.floor(x));
        System.out.println("Ceiling: " + Math.ceil(x));
        System.out.println("Round: " + Math.round(x));
    }
    
    public void max(){
        System.out.println("Max: : " + Math.max((double)'D', x));         
    }
    
    public void min(){
        System.out.println("Min: : " + Math.min((double)'D', x));         
    }
    
    public void randomNumber(){
        Double aleatorio = (Math.random() * 100) % x;
        System.out.println("Numero aleatorio: " + aleatorio);
    }
    
}
