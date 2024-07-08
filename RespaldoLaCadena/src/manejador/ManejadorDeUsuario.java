/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejador;

/**
 *
 * @author santoslopeztzoy
 */
import bean.Usuario;
import db.Conexion;
import java.util.ArrayList;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.Date;


public class ManejadorDeUsuario {
    
    private static ManejadorDeUsuario instancia;
    private ArrayList<Usuario> mostrarUsuario;
    public static ManejadorDeUsuario getInstancia(){
        if (instancia==null){
            instancia=new ManejadorDeUsuario();
        }
        return instancia;
        
    }
    
    // Constructor
    public ManejadorDeUsuario(){
        mostrarUsuario = new ArrayList<Usuario>();
    }
    
    public ArrayList<Usuario> listarUsuarios(){
        return mostrarUsuario;
    } 
    
    public ArrayList<Usuario> listarUsuariosGuardados(){
        Usuario usuario = null;
        mostrarUsuario.removeAll(mostrarUsuario);
        
        //ResultSet consulta = Conexion.getInstancia().hacerConsulta("SELECT * FROM usuario");
        String query = "SELECT * FROM Usuario";
        Object[] params={};
        ResultSet consulta = Conexion.getInstancia().hacerConsultaPreparedStatement(query,params);        
        
        try{
            while(consulta.next()){
                String estado = consulta.getString("estado");
                char estadoConvertido = estado.charAt(0);
                Date fechaRegistro = consulta.getDate("fechaRegistro");
                usuario = new Usuario(
                        consulta.getString("usuario"),
                        consulta.getString("correo"),
                        //consulta.getString("contrasena"),
                        estadoConvertido,
                        fechaRegistro,
                        Integer.parseInt(consulta.getString("idTipoUsuario"))
                );
                        mostrarUsuario.add(usuario);

               
                
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return mostrarUsuario;
    }
    
    public Usuario iniciarSesion(String user,String password,int idTipoUsuario){
        Usuario usuario = null;
        String query = "SELECT * FROM Usuario WHERE usuario=? AND contrasena=? AND idTipoUsuario=?";
        
        Object[] params={user,password,idTipoUsuario};
        
        ResultSet consulta = Conexion.getInstancia().hacerConsultaPreparedStatement(query,params);
        
        if(consulta!=null){
            try{  
                while(consulta.next()){
                    char estado = consulta.getString("estado").charAt(0);
                    usuario = new Usuario(
                            consulta.getString("usuario"),
                            consulta.getString("correo"),
                            consulta.getString("contrasena"),
                            estado,
                            Integer.parseInt(consulta.getString("idTipoUsuario"))                                    
                    );
                }                  
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }else{
            usuario = null;
        }

       
        return usuario;
    }
}
