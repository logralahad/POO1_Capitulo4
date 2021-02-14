/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author logra
 */
public class Circle {
    private Integer radio;
    private Integer diametro;
    private Double area;

    public Circle() {
        this.radio = 1;
        setRadio(this.radio);
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
        this.diametro = radio * 2;
        this.area = Math.PI * Math.pow((double)radio, 2);
    }
    
    public String toString(){
        return String.format("Radio: %d Diametro: %d Area: %.3f", radio, diametro, area);
    }
    
    
    
    
}
