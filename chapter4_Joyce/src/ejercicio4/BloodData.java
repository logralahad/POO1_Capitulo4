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
public class BloodData {
    
    private BloodType sangre;
    private Character rhfactor;

    public BloodData() {
        this.sangre = BloodType.O;
        this.rhfactor = '+';
    }

    public BloodData(BloodType sangre, Character rhfactor) {
        this.sangre = sangre;
        this.rhfactor = rhfactor;
    }
    
    public String toString(){
        return String.format("%s%c", this.sangre, this.rhfactor);
    }

    public BloodType getSangre() {
        return sangre;
    }

    public void setSangre(BloodType sangre) {
        this.sangre = sangre;
    }

    public Character getRhfactor() {
        return rhfactor;
    }

    public void setRhfactor(Character rhfactor) {
        this.rhfactor = rhfactor;
    }
    
    
}
