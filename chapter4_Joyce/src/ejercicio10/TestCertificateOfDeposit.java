/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class TestCertificateOfDeposit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Nombre: ");
            String poseedor = sc.nextLine();
            
            System.out.print("Certificado: ");
            int cuenta = sc.nextInt();
            
            System.out.print("Balance: ");
            double total = sc.nextDouble();
            
            System.out.print("Dia de emision: ");
            int dia = sc.nextInt();
            
            System.out.print("Mes (1-12) de emision: ");
            int mes = sc.nextInt();
            
            System.out.print("Anio de emision: ");
            int anio = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            
            GregorianCalendar emitido = new GregorianCalendar(anio, mes - 1, dia);
            CertificateOfDeposit usuario = new CertificateOfDeposit(cuenta, poseedor, total, emitido);
            System.out.println(usuario.toString() + "\n");
        }
    }
    
}
