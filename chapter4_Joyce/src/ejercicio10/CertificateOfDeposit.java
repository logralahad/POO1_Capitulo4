/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.GregorianCalendar;

/**
 *
 * @author logra
 */
public class CertificateOfDeposit {
    
    private Integer certificado;
    private String nombre;
    private Double balance;
    private GregorianCalendar emision;
    private GregorianCalendar vencimiento;

    public CertificateOfDeposit(Integer certificado, String apellido, Double balance, GregorianCalendar emision) {
        this.certificado = certificado;
        this.nombre = apellido;
        this.balance = balance;
        this.emision = emision;
        
        this.vencimiento = new GregorianCalendar(emision.get(GregorianCalendar.YEAR),
                emision.get(GregorianCalendar.MONTH), emision.get(GregorianCalendar.DAY_OF_MONTH));
        this.vencimiento.add((GregorianCalendar.YEAR), 1);
    }
    
    public String toString(){
        String s1 = String.format("Certificado #%d\nPoseedor: %s\nBalance: %.2f", certificado, nombre, balance);
        String s2 = String.format("\nEmitido: %d/%d/%d", emision.get(GregorianCalendar.DAY_OF_MONTH),
                emision.get(GregorianCalendar.MONTH) + 1, emision.get(GregorianCalendar.YEAR));
        String s3 = String.format("\nVencimiento: %d/%d/%d", vencimiento.get(GregorianCalendar.DAY_OF_MONTH),
                vencimiento.get(GregorianCalendar.MONTH) + 1, vencimiento.get(GregorianCalendar.YEAR));
        
        return String.format("%s %s %s", s1, s2, s3);
    }
    
    public Integer getCertificado() {
        return certificado;
    }

    public void setCertificado(Integer certificado) {
        this.certificado = certificado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String apellido) {
        this.nombre = apellido;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public GregorianCalendar getEmision() {
        return emision;
    }

    public void setEmision(GregorianCalendar emision) {
        this.emision = emision;
    }

    public GregorianCalendar getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(GregorianCalendar vencimiento) {
        this.vencimiento = vencimiento;
    }
}
