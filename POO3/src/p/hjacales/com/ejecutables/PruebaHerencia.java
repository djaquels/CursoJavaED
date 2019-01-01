/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.hjacales.com.ejecutables;

import p.hjacales.com.herencias.Profesor;

/**
 *
 * @author daniel
 */
public class PruebaHerencia {
    public static void main(String[] args) {
        Profesor jirafales = new Profesor();
        jirafales.setNombre("Jirafales");
        jirafales.setUniversidad("UNAM");
        System.out.println(jirafales.getTrabajo());
        
    }
}
