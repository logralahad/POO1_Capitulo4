/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author logra
 */
public class TestBread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bread pan1 = new Bread("ajo", 45);
        System.out.println(pan1.toString());
        
        Bread pan2 = new Bread("bimbo", 115);
        System.out.println(pan2.toString());
        
        Bread pan3 = new Bread("wonder", 120);
        System.out.println(pan3.toString());
        
        
    }
    
}
