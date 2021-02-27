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
public class Sandwich {
    
    private Bread pan;
    private SandwichFilling relleno;

    public Sandwich(String pan, Integer calorias, String relleno, Integer rcalorias){
        this.pan = new Bread(pan, calorias);
        this.relleno = new SandwichFilling(relleno, rcalorias);
    }
    
    public String toString(){
        Integer calorias_total = (2 * pan.getCalorias()) + relleno.getCalorias();
        return String.format("%s %s %d", pan.getPan(), relleno.getRelleno(), calorias_total);
    }
}
