package ejercicio1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logra
 */
public class FormLetterWritter {
    
    public static void displaySituation(String apellido){
        System.out.println("\nDear Mr. or Ms. " + apellido);
        System.out.println("Thank you for your recent order.");
    }
    
    public static void displaySituation(String nombre, String apellido){
        System.out.println("\nDear " + nombre + " " + apellido);
        System.out.println("Thank you for your recent order.");
    }
    
}
