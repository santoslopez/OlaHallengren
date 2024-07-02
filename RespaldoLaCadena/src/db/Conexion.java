/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Conexion to edit this template
 */
package db;

/**
 *
 * @author santoslopeztzoy
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {    
    private static Conexion instancia;
    
    private Connection conection;
    private Statement statement;

    
    public static synchronized Conexion getInstancia(){
        if(instancia==null){
            instancia=new Conexion();
        }
        return instancia;
    }
    
    public Conexion(){
        try{
            // Cargar el driver de JDBC de SQL Server
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            Class.forName("org.sqlite.JDBC").newInstance();
        }catch(InstantiationException ex1){
           ex1.printStackTrace();
        }catch(IllegalAccessException illegalAccessException){
            illegalAccessException.printStackTrace();
        }catch(ClassNotFoundException classNotFoundException){
            classNotFoundException.printStackTrace();
        }
        try{
            conection = DriverManager.getConnection("jdbc:sqlite:src/DATABASE/DB.db");
            statement = conection.createStatement();
        }catch(Exception exc){
            exc.printStackTrace();
        }
        
      
        
    }
    public ResultSet hacerConsulta(String consulta){
        ResultSet resultSet = null;
        try{
            resultSet = statement.executeQuery(consulta);
        }catch(SQLException exc){
            exc.printStackTrace();
        }
        return resultSet;
    }  
    public void ejecutarSentencia(String sentencia){
        try{
            statement.execute(sentencia);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public boolean isConexionExitosa() {
        try {
            if (conection != null && !conection.isClosed()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void cerrarConexion() {
        try {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
            if (conection != null && !conection.isClosed()) {
                conection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Conexion conexion = Conexion.getInstancia();
        if (conexion.isConexionExitosa()) {
            System.out.println("Conexión exitosa");
        } else {
            System.out.println("Conexión fallida");
        }
        conexion.cerrarConexion();
    }

}
