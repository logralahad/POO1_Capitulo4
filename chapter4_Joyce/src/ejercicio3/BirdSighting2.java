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
public class BirdSighting2 {
    
    private String especie;
    private Integer cantidad;
    private Integer dia;

    public BirdSighting2() {
        this("robin", 1, 1);
    }

    public BirdSighting2(String especie, Integer cantidad, Integer dia) {
        this.especie = especie;
        this.cantidad = cantidad;
        this.dia = dia;
    }
    
    public String toString(){
        return String.format("%s %d %d", this.especie, this.cantidad, this.dia);
    }

    public String getEspecie() {
        return this.especie;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public Integer getDia() {
        return this.dia;
    }
    
}
