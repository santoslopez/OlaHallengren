/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejador;

/**
 *
 * @author santoslopeztzoy
 */

import bean.BaseDatos;
import db.Conexion;
import java.util.Date;
import java.util.ArrayList;
import java.sql.ResultSet;

public class ManejadorBaseDatos {
    private static ManejadorBaseDatos instancia;
    private ArrayList<BaseDatos> mostrarBaseDatos;
    public static ManejadorBaseDatos getInstancia(){
        if(instancia==null){
            instancia=new ManejadorBaseDatos();
        }
        return instancia;
    }
    
    // constructor
    public ManejadorBaseDatos(){
        mostrarBaseDatos = new ArrayList<BaseDatos>();
    }
    
    public ArrayList<BaseDatos> listarBaseDatos(){
        return mostrarBaseDatos;
    }
    
    public ArrayList<BaseDatos> listarBaseDatosGuardados(){
        BaseDatos baseDatos = null;
        mostrarBaseDatos.removeAll(mostrarBaseDatos);
        
        String query = "SELECT nameDatabase,idUsuario,fechaRegistro FROM BaseDatos";
        Object[] params={};
        ResultSet consulta = Conexion.getInstancia().hacerConsultaPreparedStatement(query,params);
        
        try{
            while(consulta.next()){
                String nameDatabase = consulta.getString("nameDatabase");
                int idUsuario = Integer.parseInt(consulta.getString("idUsuario"));
                Date fechaRegistro = consulta.getDate("fechaRegistro");
                
                baseDatos = new BaseDatos(
                        nameDatabase,
                        idUsuario,
                        fechaRegistro
                );
                mostrarBaseDatos.add(baseDatos);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return mostrarBaseDatos;
    }
    
    
}
