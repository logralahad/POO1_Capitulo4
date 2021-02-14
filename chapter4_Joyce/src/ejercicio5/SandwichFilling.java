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
public class SandwichFilling {
    
    private String relleno;
    private Integer calorias;

    public SandwichFilling(String relleno, Integer calorias) {
        this.relleno = relleno;
        this.calorias = calorias;
    }

    public String toString(){
        return String.format("%s %d", this.relleno, this.calorias);
    }
    
    public String getRelleno() {
        return relleno;
    }

    public Integer getCalorias() {
        return calorias;
    }
    
}
