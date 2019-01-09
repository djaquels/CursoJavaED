/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.heptorsj.ejecutar;
import io.github.heptorsj.excepciones.*;
import io.github.heptorsj.Pruebas.Prueba;
/**
 *
 * @author daniel
 */
public class Ejecutar {
    public static void main(String[] args) {
        Prueba d = new Prueba();
        try {
            int r = d.dividir(4, 1);
             System.out.println("La division es: " + r);
        } catch(MIExcepcion e){
            System.out.println(e.getMessage());
        }
      
    }
    
}
