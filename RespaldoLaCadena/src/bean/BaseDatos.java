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
public class BaseDatos {

    private String nameDatabase;
    private int idUsuario;
    private Date fechaRegistro;
    
    public String getNameDatabase(){
        return nameDatabase;
    }


    public int getIdUsuario() {
        return idUsuario;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }


    public void setNameDatabase(String nameDatabase) {
        this.nameDatabase = nameDatabase;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "BaseDatos{" +  ", nameDatabase=" + nameDatabase + ", idUsuario=" + idUsuario + ", fechaRegistro=" + fechaRegistro + '}';
    }

    public BaseDatos(String nameDatabase, int idUsuario, Date fechaRegistro) {
        
        this.nameDatabase = nameDatabase;
        this.idUsuario = idUsuario;
        this.fechaRegistro = fechaRegistro;
    }
          
}
