/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class RentalDemo {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        // TODO code application logic here
        Rental renta1 = new Rental();
        Rental renta2 = new Rental("K150", 185);
        
        System.out.println(renta1.aPagar());
        Rental.SammysMotto();
        
        System.out.println(renta2.aPagar());
        Rental.SammysMotto();

    }
    
}
