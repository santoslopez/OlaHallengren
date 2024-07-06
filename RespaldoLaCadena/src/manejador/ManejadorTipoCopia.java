/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejador;

/**
 *
 * @author santoslopeztzoy
 */
import db.Conexion;
import bean.TipoCopia;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Date;

public class ManejadorTipoCopia {
    private static ManejadorTipoCopia instancia;
    public ArrayList<TipoCopia> mostrarTipoCopias;
    
    public static ManejadorTipoCopia getInstancia(){
        if(instancia==null){
            instancia=new ManejadorTipoCopia();
        }
        return instancia;
    }
    
    // constructor
    public ManejadorTipoCopia(){
        mostrarTipoCopias = new ArrayList<TipoCopia>();
    }
    
    public ArrayList<TipoCopia> listarTipoCopia(){
        return mostrarTipoCopias;
    }
    
    public ArrayList<TipoCopia> listarTipoCopiasGuardadas(){
        TipoCopia tipoCopia = null;
        mostrarTipoCopias.removeAll(mostrarTipoCopias);
        ResultSet consulta = Conexion.getInstancia().hacerConsulta("SELECT * FROM TipoCopia");
        try{
            while(consulta.next()){
                tipoCopia = new TipoCopia(
                        Integer.parseInt(consulta.getString("idTipoCopia")),
                        consulta.getString("nombreCopia")
                );
                       
                mostrarTipoCopias.add(tipoCopia); 
            }
           
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return mostrarTipoCopias;
    }
}
