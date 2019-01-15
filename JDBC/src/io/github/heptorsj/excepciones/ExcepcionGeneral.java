/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.heptorsj.excepciones;

/**
 *
 * @author daniel
 */
public class ExcepcionGeneral extends RuntimeException{
    public ExcepcionGeneral(){
        this("Ocurrio Una Excepcion");
    }
    public ExcepcionGeneral(String m){
      super(m);
    }
    
    
}
