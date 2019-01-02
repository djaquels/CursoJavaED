/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.hjacales.com.ejecutables;
import p.hjacales.com.herencias.*;

/**
 *
 * @author daniel
 */
public class Transporte2 {
    public static void main(String[] args) {
        MedioTransporte bus = new Autobus();
        MedioTransporte avion = new Avion();
        MedioTransporte listado[] = new MedioTransporte[2];
        listado[0] = bus;
        listado[1] = avion;
        bus.setNombre("Soy un bus");
        avion.setNombre("Soy un avion");
        for(MedioTransporte medio:listado){
          medio.Transportar();
        }
    }
    
}
