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
public class TestSandwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sandwich bimbo = new Sandwich("bimbo", 145, "jamon", 160);
        System.out.println(bimbo.toString());
        
        Sandwich wonder = new Sandwich("wonder", 115, "huevito", 214);
        System.out.println(wonder.toString());
        
        Sandwich subway = new Sandwich("ajo", 245, "pepperonni", 148);
        System.out.println(subway.toString());
    }
    
}
