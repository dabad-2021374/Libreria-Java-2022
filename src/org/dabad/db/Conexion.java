/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dabad.db;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author informatica
 */
public class Conexion {
    private Connection conexion;
    private static Conexion instancia;  
    public Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Para versiones mayor o igual a 7, agregar cj, para versiones antiguas de java menor a 7, no agregar cj.
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_libreria?useSSL=false","root","admin");
        }catch(Exception error){
            error.printStackTrace();
            System.out.println(error);
        }
    }
    
    public synchronized static Conexion getInstancia(){
        if(instancia==null)
            instancia = new Conexion();
        return instancia;
    }
    
    public void setConexion(Connection conexion){
        this.conexion = conexion;
    }
    public Connection getConexion(){
        return conexion;
    }
    
}
