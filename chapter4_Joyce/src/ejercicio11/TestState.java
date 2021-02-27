/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author logra
 */
public class TestState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        State mex = new State("Oaxaca", 1850000, "Oax de Juarez", 50000, "Huatulco", 12000);
        State ger = new State("Berlin", 43000, "Berlin", 43000, "Berlin", 43000);
        
        System.out.println(mex.toString());
        System.out.println(ger.toString());
    }
    
}
