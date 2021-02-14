/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.GregorianCalendar;

/**
 *
 * @author logra
 */
public class NextMonth {
    
    private Integer dia;
    private Integer mes;
    private Integer anio;

    public NextMonth() {
        this(1,1, 2000);
    }
    
    public NextMonth(Integer d, Integer m, Integer a) {
        if((m >= 1) && (m <= 12) && (d >= 1) && (d <= diasMes(m, a))){
            this.dia = d;
            this.mes = m;
            this.anio = a;
        }else{
            System.out.println("Fecha invalida.");
        }
    }
    
    public void diasMesSiguiente(){
        GregorianCalendar n1 = new GregorianCalendar(anio, mes - 1, dia);
        int dias_mes_siguiente = n1.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        
        int dias_restantes = dias_mes_siguiente - this.dia;         
        System.out.println("Dias restantes: " + dias_restantes);
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        if((dia >= 1) && (dia <= diasMes(mes, anio))){
            this.dia = dia;
        }else{
            System.out.println("Dia invalido.");
        }
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        if((mes >= 1) && (mes <= 12) && (dia >= 1) && (dia <= diasMes(mes, anio))){
            this.mes = mes;
        }else{
            System.out.println("Mes invalido.");
        }
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public int diasMes(Integer m, Integer a){
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            
            case 2:
                return a % 4 == 0 ? 28 : 29;
            
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
                
            default:
                return -1;
        }
    }
    
    public void aumentarDia(){
        dia++;
        if(dia > diasMes(mes, anio)){
            dia = 1;
            mes++;
            if(mes > 12){
                mes = 1;
                anio++;
            }
        }
    }
    
    public String toString(){
        return String.format("%d/%d/%d", dia, mes, anio);
    }
  
}
