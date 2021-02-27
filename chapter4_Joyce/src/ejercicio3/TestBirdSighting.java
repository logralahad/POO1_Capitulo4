/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author logra
 */
public class TestBirdSighting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BirdSighting pajaro1 = new BirdSighting();
        System.out.println(pajaro1.toString());
        
        BirdSighting pajaro2 = new BirdSighting("cuervo", 4, 81);
        System.out.println(pajaro2.toString());
        
        BirdSighting2 pajaro3 = new BirdSighting2();
        System.out.println(pajaro3.toString());
        
    }
    
}
