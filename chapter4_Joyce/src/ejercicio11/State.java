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
public class State {
    
    private String nombre;
    private Integer poblacion;
    private City capital;
    private City popular;

    public State(String nombre, Integer poblacion, String capital, 
            Integer cap_pob, String popular, Integer pop_pob) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.capital = new City(capital, cap_pob);
        this.popular = new City(popular, pop_pob);
    }
    
    public String toString(){
        String s1 = String.format("Estado: %s / Poblacion total: %d", nombre, poblacion);
        return String.format("%s\nCapital: %s\nCiudad mas popular: %s\n", s1, capital.toString(), popular.toString());
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

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City getPopular() {
        return popular;
    }

    public void setPopular(City popular) {
        this.popular = popular;
    }
    
}
