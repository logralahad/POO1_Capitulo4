/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;

/**
 *
 * @author logra
 */
public class Rental {
    
    public final static int MIN_HOUR = 60;
    public final static int RENTA_HORA = 40;
    
    private String contrato;
    private Integer minutos;
    private Integer horas;
    private Integer min_extras;
    private Integer costo;
    
    public Rental(){
        this("A000", 0);
    }
    
    public Rental(String contrato, Integer minutos) {
        this.contrato = contrato;
        this.minutos = minutos;
        this.horas = minutos / 60;
        this.min_extras = this.minutos % 60;
        this.costo = (this.horas * 40) + this.min_extras;
    }
    
    public String aPagar(){
        return String.format("Contrato: %s\nHoras completas: %d\nMinutos extras: %d\nCosto: $%d\n",
                contrato, horas, min_extras, costo);
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    
    public void setMinutos(int min){
        this.minutos = min;
        this.horas = min / 60;
        this.min_extras = min % 60;
        this.costo = (this.horas * 40) + this.min_extras;
    }

    public String getContrato() {
        return contrato;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getMin_extras() {
        return min_extras;
    }

    public Integer getCosto() {
        return costo;
    }
    
    public static void SammysMotto(){
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S   Sammy's makes it   S");
        System.out.println("S    fun in the sun    S");
        System.out.print("SSSSSSSSSSSSSSSSSSSSSSSS\n\n");
    }
    
}
