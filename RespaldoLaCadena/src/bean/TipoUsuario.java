/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import db.Conexion;

/**
 *
 * @author santoslopeztzoy
 */
public class TipoUsuario {
    private int idTipoUsuario;
    private String nombreTipo;

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    @Override
    public String toString() {
        return "TipoUsuario{" + "idTipoUsuario=" + idTipoUsuario + ", nombreTipo=" + nombreTipo + '}';
    }
    
    public TipoUsuario(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

}
