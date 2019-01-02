/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.hjacales.com.ejecutables;
import p.hjacales.com.interfaces.ImplementacionInterfaces;
/**
 *
 * @author daniel
 */
public class Interfacesexe {
    public static void main(String[] args) {
        ImplementacionInterfaces calc = new ImplementacionInterfaces();
        System.out.println("Suma: "+ calc.sumar(6,4));
    }
}
