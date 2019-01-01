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
public class PruebaTransporte {
    public static void main(String[] args) {
        Avion f222 = new Avion();
        Autobus mercedes = new Autobus();
        f222.setNombre("Avion");
        f222.setVelocidad(1541646.154);
        mercedes.setNombre("Bicochu");
        mercedes.setVelocidad(100.15);
        f222.Transportar();
        mercedes.Transportar();
    }
}
