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
public class Patient {
    
    private Integer id;
    private Integer edad;
    private BloodData sangre;

    public Patient() {
        this.id = 0;
        this.edad = 0;
        this.sangre = new BloodData();
    }

    public Patient(Integer id, Integer edad, BloodData sangre) {
        this.id = id;
        this.edad = edad;
        this.sangre = sangre;
    }
    
    public String toString(){
        return String.format("%d %d %s%c", this.id, this.edad, this.sangre.getSangre(), this.sangre.getRhfactor());
    }

    public Integer getId() {
        return id;
    }

    public Integer getEdad() {
        return edad;
    }

    public BloodData getSangre() {
        return sangre;
    }
    
}
