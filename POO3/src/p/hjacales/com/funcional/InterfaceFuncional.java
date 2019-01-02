/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.hjacales.com.funcional;

/**
 *
 * @author daniel
 */
@FunctionalInterface
public interface InterfaceFuncional {
    public void unicoMetodoAbstracto();
    public default void hacerAlgoConcreto(){
        System.out.println("Estoy trabajando desde la interface");
    }
    public default int sumar(int a, int b){
        return a + b;
    }
}
