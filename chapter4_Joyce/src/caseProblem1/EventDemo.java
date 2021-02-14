/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class EventDemo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Event e1 = new Event();
        Event e2 = new Event("Carne asada", 10);
        
        System.out.println(e1.eCosto());
        Event.CarlysMotto();
        
        System.out.println(e2.eCosto());
        Event.CarlysMotto();
    }
    
}
