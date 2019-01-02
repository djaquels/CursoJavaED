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
public class ImplementacionFuncional 
        extends MIAbstraccion
        implements InterfaceFuncional   {

    @Override
    public void unicoMetodoAbstracto() {
        System.out.println("Este es el metodo que debo sobreescribir");
    }

    @Override
    public void hablar() {
         System.out.println("Hola amico");
    }
    
}
