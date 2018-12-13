package paquete_a;

import paquete_a.Modificadores;

public class EnElMismoPaquete{
    public static void main(String[] args){
        Modificadores m = new Modificadores();
        m.publico = "Accediendo Desde El Mismo Paquete";
        System.out.println(m.publico);

    }
}