/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.hjacales.com.interfaces;

/**
 *
 * @author daniel
 */
public class ImplementacionInterfaces implements MiInterface {

    @Override
    public int sumar(int a, int b) {
     return a + b;
    }

    @Override
    public int restar(int a, int b) {
     return a - b;
    }
    
}
