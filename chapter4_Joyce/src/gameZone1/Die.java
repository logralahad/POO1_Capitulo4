/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

/**
 *
 * @author logra
 */
public class Die {
    
    private Integer valor;

    public Die() {
        this.lanzar();
    }
    
    public void lanzar(){
        this.valor = ((int)(Math.random() * 100) % 6 + 1);
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
    public Integer getValor() {
        return valor;
    }

    
    
    
    
}
