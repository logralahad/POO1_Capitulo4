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
public class City {
    
    private String nombre;
    private Integer poblacion;

    public City(String nombre, Integer poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String toString(){
        return String.format("%s / Poblacion: %d", nombre, poblacion);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }
    
}
