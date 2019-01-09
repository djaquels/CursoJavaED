package io.github.heptorsj.Pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
import io.github.heptorsj.excepciones.*;
public class Prueba {
    public Prueba(){}
    public int dividir(int a, int b) throws MIExcepcion {
     if( b == 1){
       throw new MIExcepcion("Esta division es muy facill");
     }
     return a/b;
    }
        
   
}
