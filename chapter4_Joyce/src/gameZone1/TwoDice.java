/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

/**
 *
 * @author logra
 */
public class TwoDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Die dado1 = new Die();
        Die dado2 = new Die();
        
        System.out.println("Dado 1: " + dado1.getValor());
        System.out.println("Dado 2: " + dado2.getValor());
        
    }
    
}
