/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.heptorsj.dao.interfaces;

import java.util.List;

/**
 *
 * @author daniel
 */
public interface DAO<K,O> {
    public void insertar(O o);
    public void modificar(O o);
    public void eliminar (O o);
    public O obtenerPorID(K k);
    public List<O> listar();
    
}
