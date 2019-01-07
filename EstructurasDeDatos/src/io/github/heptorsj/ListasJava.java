/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.heptorsj;
import java.util.ArrayList;
/**
 *
 * @author daniel
 */
public class ListasJava {
    private ArrayList<Persona> listado;
       
    public ListasJava(){
        listado = new ArrayList<>();
    }
    public void agregar(Persona p){
     listado.add(p);
    }
    public Persona obtener(int i){
        return listado.get(i);
    }
    
}
