/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.hjacales.com.ejecutables;

import p.hjacales.com.funcional.ImplementacionFuncional;

/**
 *
 * @author daniel
 */
public class pruebaFuncional {

    public static void main(String[] args) {
        ImplementacionFuncional impl = new ImplementacionFuncional();
        impl.unicoMetodoAbstracto();
        impl.hacerAlgoConcreto();
        impl.hablar();
        impl.saludar();
    }

}
