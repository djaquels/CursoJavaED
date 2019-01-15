/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.dao.postgresql;

import io.github.heptorsj.dao.interfaces.UsuarioDAO;
import io.github.heptorsj.excepciones.ExcepcionGeneral;
import io.github.heptorsj.modelos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class PSQLUsuario implements UsuarioDAO {
    private final String INSERTAR = "INSERT INTO usuarios(usuario,clave,correo) VALUES (?,md5(?),?)";
    private final String MODIFICAR = "UPDATE usuarios SET usuario = ?, clave = md5(?),correo = ? WHERE id_usuario = ? ";
    private final String ELIMINAR = "DELETE FROM usuarios WHERE id_usuario = ?";
    private final String OBTENERPORID =  "SELECT id_usuario , usuario , clave , correo FROM usuarios WHERRE id_usuario = ?";
    private final String OBTENER = "SELECT id_usuario , usuario , clave , correo FROM usuarios";
    
    private Connection conexion;
    private PreparedStatement sentencia;
    private ResultSet resultados;
    
    @Override
    public void insertar(Usuario o) {
         try{
             conexion = new PostgresConnection().conectar();
             sentencia = conexion.prepareStatement(INSERTAR);
             sentencia.setString(1, o.getUsuario());
             sentencia.setString(2, o.getClave());
             sentencia.setString(3, o.getCorreo());
             if(sentencia.executeUpdate() == 0){
               throw new ExcepcionGeneral("No se inserto el registro");
             }else{
              resultados = sentencia.getGeneratedKeys();
              if(resultados.next()){
                o.setIdUsuario(resultados.getInt(1));
              }
             }
         }catch(SQLException e ){
             throw new ExcepcionGeneral(e.getMessage());
         }
    }

    @Override
    public void modificar(Usuario o) {
        try{
            conexion = new PostgresConnection().conectar();
            sentencia = conexion.prepareStatement(MODIFICAR);
            sentencia.setString(1, o.getUsuario());
            sentencia.setString(2, o.getClave());
            sentencia.setString(3, o.getCorreo());
            sentencia.setInt(4, o.getIdUsuario());
            if(sentencia.executeUpdate() == 0){
                throw new ExcepcionGeneral("No se modificó usuario");
            }
            
        }catch( SQLException e){
            throw new ExcepcionGeneral(e.getMessage());
        }finally{
           cerrarConexion();
        }
        
    }

    @Override
    public void eliminar(Usuario o) {
       try{
            conexion = new PostgresConnection().conectar();
            sentencia = conexion.prepareStatement(ELIMINAR);
            sentencia.setInt(1, o.getIdUsuario());
            if(sentencia.executeUpdate() == 0){
                throw new ExcepcionGeneral("No se eliminó usuario");
            }
            
        }catch( SQLException e){
            throw new ExcepcionGeneral(e.getMessage());
        }finally{
           cerrarConexion();
        }
    }

    @Override
    public Usuario obtenerPorID(Integer k) {
        Usuario u = new Usuario();
        try{
            conexion = new PostgresConnection().conectar();
            sentencia = conexion.prepareStatement(OBTENERPORID);
            sentencia.setInt(1, k);
            resultados = sentencia.executeQuery();
            if(resultados.next()){
                u.setIdUsuario(2);
                u.setUsuario(resultados.getString("usuario"));
                u.setClave(resultados.getString("clave"));
                u.setCorreo(resultados.getString("correo"));
                return u;
                
            }
        }catch( SQLException e){
            throw new ExcepcionGeneral(e.getMessage());
        }finally{
           cerrarConexion();
        }
        return u;
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> l = new ArrayList<>();
        try{
            conexion = new PostgresConnection().conectar();
            sentencia = conexion.prepareStatement(OBTENER);
            resultados = sentencia.executeQuery();
            while(resultados.next()){
                Usuario u = new Usuario();
                u.setUsuario(resultados.getString("usuario"));
                u.setIdUsuario(0);
                u.setClave(resultados.getString("clave"));
                u.setCorreo(resultados.getString("correo"));
                l.add(u);
            }
        }catch( SQLException e){
            throw new ExcepcionGeneral(e.getMessage());
        }finally{
           cerrarConexion();
        }
        return l;
        
    }
    private void cerrarConexion(){
      try {
        if(resultados != null){
          resultados.close();
        }
        if(sentencia != null) {
           sentencia.close();
        }
        if(conexion != null) {
           conexion.close();
        }
      } catch(SQLException s){
          
          
      }
    }
}
