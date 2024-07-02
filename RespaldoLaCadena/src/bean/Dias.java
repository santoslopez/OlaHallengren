/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author santoslopeztzoy
 */
public class Dias {
    private int idDia;
    private String dia;

    public int getIdDia() {
        return idDia;
    }

    public String getDia() {
        return dia;
    }

    public void setIdDia(int idDia) {
        this.idDia = idDia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Dias(String dia) {
        
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Dias{" + "idDia=" + idDia + ", dia=" + dia + '}';
    }
    
    public static void main(String args[]){
        
        Dias d = new Dias("lunes");
        System.out.println("hoy es: "+d.toString());
    }
    
    
}
