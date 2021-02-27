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
public class BirdSighting {
    
    private String especie;
    private Integer cantidad;
    private Integer dia;

    public BirdSighting() {
        this.especie = "robin";
        this.cantidad = 1;
        this.dia = 1;
    }

    public BirdSighting(String especie, Integer cantidad, Integer dia) {
        this.especie = especie;
        this.cantidad = cantidad;
        this.dia = dia;
    }
    
    public String toString(){
        return String.format("%s %d %d", this.especie, this.cantidad, this.dia);
    }

    public String getEspecie() {
        return especie;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Integer getDia() {
        return dia;
    }
    
}
