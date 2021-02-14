/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author logra
 */
public class TestPatient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Patient juan = new Patient();
        System.out.println(juan.toString());
                
        Patient juan2 = new Patient(4, 28, new BloodData());
        System.out.println(juan2.toString());
        
    }
    
}
