/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import db.Conexion;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author santoslopeztzoy
 */
public class Usuario {
    private int idTipoUsuario;
    private String nombreUsuario;
    private String email;
    private String password;
    private char estado;
    private Date fechaRegistro;
    
     public int getIdTipoUsuario(){
        return idTipoUsuario;
    }
    
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario=nombreUsuario;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public char getEstado(){
        return estado;
    }
    
    public void setEstado(char estado){
        this.estado=estado;
    }
    
    public Date getFechaRegistro(){
        return fechaRegistro;
    }
    
    
    // Constructor
    public Usuario(String nombreUsuario,String email,String password,char estado,Date fechaRegistro,int idTipoUsuario){
    //public Usuario(String nombreUsuario,String email,char estado,Date fechaRegistro,int idTipoUsuario){

        this.nombreUsuario=nombreUsuario;
        this.email=email;
        this.password=password;
        this.estado=estado;
        this.fechaRegistro=fechaRegistro;
        this.idTipoUsuario=idTipoUsuario;

    }
    
   @Override
   public String toString() {
        return "Nombre: " + nombreUsuario + 
               ", Correo: " + email + 
               ", Password: " + password + 
               ", Estado: " + estado + 
               ", Fecha: " + fechaRegistro.toString();
    }
    
    public static void main(String args[]){
        Date fechaActual = new Date();
        
        // Definimos el formato deseado
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        // Convertir a string la fecha
        //String convertFecha = dateFormat.format(fechaActual);
        int codigoUsuarioDefault = 2;// no es administrador       
        Usuario usuario = new Usuario("santos","santos.lopez@galileo.edu","pruebadefuego",'A',fechaActual,codigoUsuarioDefault);

        System.out.println("estoy aqui");
        
       
        //String sentencia = "INSERT INTO Usuario (usuario, correo, contraseña, estado, fechaRegistro) VALUES (?, ?, ?, ?, ?)";
        String sentencia = "INSERT INTO Usuario (usuario,correo,contrasena,estado,fechaRegistro,idTipoUsuario) VALUES ('"
                        + usuario.getNombreUsuario() + "', '"
                        + usuario.getEmail() + "', '"
                        + usuario.getPassword() + "', '"
                        + usuario.getEstado() + "', '"
                        + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(usuario.getFechaRegistro()) + "', '"
                
                        +codigoUsuarioDefault+
                "')";

        
        Conexion conexion = Conexion.getInstancia();
        conexion.ejecutarSentencia(sentencia);
    }
}
