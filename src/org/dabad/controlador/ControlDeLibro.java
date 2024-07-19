/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dabad.controlador;

import org.dabad.db.Conexion;
import org.dabad.modelo.Libro;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author informatica
 */
public class ControlDeLibro {
    public void agregarLibro(Libro libro){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_agregarLibro(?, ?, ?, ?, ?);");
            sentencia.setString(1, libro.getNombreDelLibro());
            sentencia.setString(2, libro.getNombreDelAutor());
            sentencia.setString(3, libro.getNombreDeLaEditorial());
            sentencia.setInt(4, libro.getEdicion());
            sentencia.setBoolean(5, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Se ha enviado un libro a la Base de Datos´.");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
    
    public void actualizarLibro(Libro libro){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarLibro(?, ?, ?, ?, ?, ?);");
            sentencia.setInt(1, libro.getIdLibro());
            sentencia.setString(2, libro.getNombreDelLibro());
            sentencia.setString(3, libro.getNombreDelAutor());
            sentencia.setString(4, libro.getNombreDeLaEditorial());
            sentencia.setInt(5, libro.getEdicion());
            sentencia.setBoolean(6, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha actualizado un libro en la BD.");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
    public void eliminarLibro(Libro libro){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarLibro(?);");
            sentencia.setInt(1, libro.getIdLibro());
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha eliminado un libro en la BD.");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
}