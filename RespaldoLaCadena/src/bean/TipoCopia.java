/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author santoslopeztzoy
 */
public class TipoCopia {
    private int idTipoCopia;
    private String nombreCopia;
    
    public int getIdTipoCopia(){
        return idTipoCopia;
    }
     public String getNombreCopia(){
        return nombreCopia;
    }
    public void setTipoCopia(String nombreCopia){
        this.nombreCopia=nombreCopia;
    }
    
    public TipoCopia(String nombreCopia){
        this.nombreCopia=nombreCopia;
    }
    public TipoCopia(int idTipoCopia,String nombreCopia){
        this.idTipoCopia=idTipoCopia;
        this.nombreCopia=nombreCopia;
    }

    @Override
    public String toString() {
        return "TipoCopia{" + "idTipoCopia=" + idTipoCopia + ", nombreCopia=" + nombreCopia + '}';
    }
    
}
