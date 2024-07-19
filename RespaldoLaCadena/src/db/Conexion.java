package db;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Conexion to edit this template
 */
//package db;

/**
 *
 * @author santoslopeztzoy
 */
import java.io.File;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;


public class Conexion {    
    private static Conexion instancia;
    
    private Connection conection;
    private Statement statement;

    private PreparedStatement preparedStatement;
    
    private ImageIcon iconError = new ImageIcon("src/img/close.png");
    private ImageIcon iconConfirm = new ImageIcon("src/img/confirm.png");

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
            //Class.forName("org.sqlite.JDBC").newInstance();
            Class.forName("org.sqlite.JDBC").newInstance();

        }catch(InstantiationException ex1){
           //ex1.printStackTrace();
            String mensaje="<html><body style='width: 300px;'>" +
                      "Se produjo el siguiente error: " + ex1.getMessage() +
                      "</body></html>";       
           JOptionPane.showMessageDialog(null,mensaje, "Error: ", JOptionPane.ERROR_MESSAGE, iconError);
        }catch(IllegalAccessException illegalAccessException){
            //illegalAccessException.printStackTrace();
            String mensaje="<html><body style='width: 300px;'>" +
                      "Se produjo el siguiente error: " + illegalAccessException.getMessage() +
                      "</body></html>";       
           JOptionPane.showMessageDialog(null,mensaje, "Error: ", JOptionPane.ERROR_MESSAGE, iconError);
        }catch(ClassNotFoundException classNotFoundException){
            //classNotFoundException.printStackTrace();
             String mensaje="<html><body style='width: 300px;'>" +
                      "Se produjo el siguiente error: " + classNotFoundException.getMessage() +
                      "</body></html>";       
           JOptionPane.showMessageDialog(null,mensaje, "Error: ", JOptionPane.ERROR_MESSAGE, iconError);
        }
        try{
            //conection = DriverManager.getConnection("jdbc:sqlite:src/DATABASE/DB.db");
            
            //System.out.println("Estoy aquí: " + relativePath);
            conection = DriverManager.getConnection("jdbc:sqlite:DB.db");
            statement = conection.createStatement();
            //return conection;
        }catch(Exception exc){
            exc.printStackTrace();
        }
        
      
        
    }
    
    public Connection getConection(){
        return conection;
    }
        
    // Hacer consultas SELECT y evitar inyección SQL
    public ResultSet hacerConsultaPreparedStatement(String consulta, Object[] params) {
        ResultSet resultSet = null;
        try {
            PreparedStatement prep = conection.prepareStatement(consulta);
            for (int i = 0; i < params.length; i++) {
                prep.setObject(i + 1, params[i]);
            }
            resultSet = prep.executeQuery();
        } catch (SQLException exc) {
            String mensaje="<html><body style='width: 300px;'>" +
                      "Se produjo el siguiente error: " + exc.getMessage() +
                      "</body></html>";
            JOptionPane.showMessageDialog(null,mensaje, "Error: ", JOptionPane.ERROR_MESSAGE, iconError);

            //exc.printStackTrace();
        }
        return resultSet;
    }

    // insert, update y delete y evitar inyección SQL
    public void ejecutarActualizacionPreparedStatement(String consulta, Object[] params) {
        try (PreparedStatement prep = conection.prepareStatement(consulta)) {
            for (int i = 0; i < params.length; i++) {
                prep.setObject(i + 1, params[i]);
            }
            prep.executeUpdate();
            JOptionPane.showMessageDialog(null,"Operación exitosa.", "Mensaje", JOptionPane.INFORMATION_MESSAGE, iconConfirm);
        } catch (SQLException exc) {
            //JOptionPane.showMessageDialog(null, "No se efectuo la consulta con éxito: " + exc.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE, iconError);
            //exc.printStackTrace();
            String mensaje="<html><body style='width: 300px;'>" +
                      "Se produjo el siguiente error: " + exc.getMessage() +
                      "</body></html>";
            JOptionPane.showMessageDialog(null,mensaje, "Error: ", JOptionPane.ERROR_MESSAGE, iconError);

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
}
