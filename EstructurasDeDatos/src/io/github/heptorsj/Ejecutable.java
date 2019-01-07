/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.heptorsj;

/**
 *
 * @author daniel
 */
public class Ejecutable {
    public static void main(String[] args) {
        System.out.println("Listas en Java");
        Persona p1 = new Persona("Lozano");
        Persona p2 = new Persona("Lainez");
        Persona p3 = new Persona("Hernandez");
        Persona p4 = new Persona("Jimenez");
        ListasJava listado = new ListasJava();
        listado.agregar(p1);
        listado.agregar(p2);
        listado.agregar(p3);
        listado.agregar(p4);
        listado.agregar(p1);
        for(int i=0; i < 5; i++){
            System.out.println("listado:" +listado.obtener(i).getNombre());
        }
    }
}
