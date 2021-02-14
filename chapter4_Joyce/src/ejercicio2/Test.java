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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Metodo 1: $" + Billing.computeBill(100));
        System.out.println("Metodo 2: $" + Billing.computeBill(25, 4));
        System.out.println("Metodo 3: $" + Billing.computeBill(25, 4, 50));
        
    }
    
}
