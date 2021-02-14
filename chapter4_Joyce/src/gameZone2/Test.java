/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

import gameZone1.Die;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FiveDice jugador = new FiveDice();
        FiveDice computadora = new FiveDice();
        
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        
        do {
            System.out.println("Jugador: " + jugador.evaluar());
            System.out.println("Computadora: " + computadora.evaluar());
            
            if(jugador.evaluar() > computadora.evaluar()){
                System.out.println("Gano el jugador.");
            }
            else if(jugador.evaluar() < computadora.evaluar()){
                System.out.println("Gano la computadora.");
            }
            else{
                System.out.println("Empate.");
            }
            
            jugador.lanzar();
            computadora.lanzar();
            
            System.out.print("Seguir jugando? [0]No [1]Si: ");
            opc = sc.nextInt();
            System.out.println("");
            
        } while (opc == 1);
        
    }
    
}
