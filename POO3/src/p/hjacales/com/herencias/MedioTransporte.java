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
public abstract class MedioTransporte {
    private String nombre;
    private double velocidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public abstract void Transportar(); // Este metodo es abstracto
    // Tienen que añadir la logica
    
    
}
