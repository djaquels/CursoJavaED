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
public class MIExcepcion extends RuntimeException {
    public MIExcepcion(){
        this("Ocurrio Una Excepcion");
    }
    public MIExcepcion(String mensaje){
        super(mensaje);
    }
    
}
