/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author santoslopeztzoy
 */
public class BaseDatos {

    private String nameDatabase;
    private int idUsuario;
    private Date fechaRegistro;


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
    
    
    public static void main(String[] args){
        Date hola =new Date();
        BaseDatos b = new BaseDatos("carriito",1,hola);
        System.out.println(b.toString());
    }
    
    
}
