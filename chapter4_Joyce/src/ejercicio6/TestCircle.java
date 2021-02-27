/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author logra
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1 = new Circle();
        c1.setRadio(5);
        System.out.println(c1.toString());
        
        
        Circle c2 = new Circle();
        c2.setRadio(25);
        System.out.println(c2.toString());
        
        
        Circle c3 = new Circle();
        System.out.println(c3.toString());
    }
    
}
