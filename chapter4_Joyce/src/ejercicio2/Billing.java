/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author logra
 */
public class Billing {
    
    public static double computeBill(double precio){
        double nuevo_precio = (precio * 0.08) + precio;
        return nuevo_precio;
    }
    
    public static double computeBill(double precio, int cantidad){
        double nuevo_precio = precio * (double)cantidad;
        nuevo_precio = (nuevo_precio * 0.08) + nuevo_precio;
        
        return nuevo_precio;
    }
    
    public static double computeBill(double precio, int cantidad, int descuento){
        double nuevo_precio = precio * (double)cantidad;
        double precio_menos = ((double)descuento * nuevo_precio) / 100;
        nuevo_precio -= precio_menos;
        nuevo_precio = (nuevo_precio * 0.08) + nuevo_precio;
        
        return nuevo_precio;
    }
}
