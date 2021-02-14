/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

/**
 *
 * @author logra
 */
public class Event {
    
    public final static int precio_inv = 35;
    public final static int tipo_evento = 50;
    
    private String evento;
    private Integer num_inv;
    private Integer costo;
    private String tam_evento;
    
    public Event(){
        this("A000", 0);
    }

    public Event(String evento, Integer num_inv) {
        this.evento = evento;
        this.num_inv = num_inv;
        this.costo = num_inv * this.precio_inv;
        if(num_inv >= tipo_evento){
            this.tam_evento = "Evento grande";
        }else{
            this.tam_evento = "Evento chico";
        }
    }

    public String getTam_evento() {
        return tam_evento;
    }

    private void setTam_evento() {
        if(this.num_inv >= tipo_evento){
            this.tam_evento = "Evento grande";
        }else{
            this.tam_evento = "Evento chico";
        }
    }
    
    public void setEvento(String evento) {
        this.evento = evento;
    }

    public void setNum_inv(Integer num_inv) {
        this.num_inv = num_inv;
        this.costo = this.precio_inv * this.num_inv;
        setTam_evento();
    }

    public String getEvento() {
        return evento;
    }

    public Integer getNum_inv() {
        return num_inv;
    }

    public Integer getCosto() {
        return costo;
    }
    
    public static void CarlysMotto(){
        System.out.println("\n*************************");
        System.out.println("*   Carly’s makes the   *");
        System.out.println("*    food that makes    *");
        System.out.println("*      it a party!      *");
        System.out.print("*************************\n\n");
    }
    
    public String eCosto(){
        String s1 = String.format("Evento: %s\nNum. de invitados: %d\nPrecio por invitado: $35\n", this.evento, this.num_inv);
        String s2 = String.format("Tipo de evento: %s\nCosto total: $%d", this.tam_evento, this.costo);
        return String.format("%s%s", s1, s2);
    }

}
