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
public class Bread {
    
    private String pan;
    private Integer calorias;
    public final static String MOTTO = "The staff of life.";

    public Bread(String pan, Integer calorias) {
        this.pan = pan;
        this.calorias = calorias;
    }
    
    public String toString(){
        return String.format("%s %d %s", this.pan, this.calorias, MOTTO);
    }

    public String getPan() {
        return pan;
    }

    public Integer getCalorias() {
        return calorias;
    }

}
