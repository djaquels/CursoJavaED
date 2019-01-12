/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.heptorsj.ejecutables;

import io.github.dao.postgresql.PSQLUsuario;
import io.github.heptorsj.excepciones.ExcepcionGeneral;
import io.github.heptorsj.modelos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Ejecutar {
    public static void main(String[] args) {
       /* Usuario user = new Usuario();
        user.setIdUsuario(1);
        user.setUsuario("hjacales");
        user.setClave("manchester");
        user.setCorreo("lalocura@local.com");
        PSQLUsuario puser = new PSQLUsuario(); 
        // INSERTAR
        //puser.insertar(user);*/
       
       //MODIFICAR
       /* try {
        puser.modificar(user);}
        catch( ExcepcionGeneral e){
            System.out.println(e.getMessage());
        }*/
       //ELIMINAR
        /*try {
        puser.eliminar(user);}
        catch( ExcepcionGeneral e){
            System.out.println(e.getMessage());
        }*/
        /*
        Obtener por ID
        PSQLUsuario u = new PSQLUsuario();
        try{
            Usuario user = u.obtenerPorID(3);
            System.out.println(user);
        }catch(ExcepcionGeneral e){
            System.out.println(e.getMessage());
        }*/
        
        // LISTAR
        PSQLUsuario p = new PSQLUsuario();
        try{
        List<Usuario> l = new ArrayList<>(); 
        l = p.listar();
        for(Usuario u : l){
            System.out.println(u);
        }
        }catch(ExcepcionGeneral e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
