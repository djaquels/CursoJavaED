/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.hjacales.com.herencias;

/**
 *
 * @author daniel
 */
public class Profesor extends Persona {
    private String universidad;
    public void setUniversidad(String uni){
        this.universidad = uni;
    }
    
    // Metodo que retorna string que diga getTrabajo
    public String getTrabajo(){
        return "Estor feliz trabajando en " + universidad;
    }
}
