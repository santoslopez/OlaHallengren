/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 *
 * @author santoslopeztzoy
 */
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;
import bean.BaseDatos;
import manejador.ManejadorBaseDatos;

public class ModeloBaseDatos extends AbstractTableModel{
    private ArrayList<BaseDatos> listaDeBaseDatos = null;
    
    private static ModeloBaseDatos instancia;
    public static ModeloBaseDatos getInstancia(){
        if(instancia==null){
            instancia=new ModeloBaseDatos();
        }
        return instancia;
    }
    
    public ModeloBaseDatos(){
        listaDeBaseDatos= new ManejadorBaseDatos().getInstancia().listarBaseDatosGuardados();
    }
    
    private String[] encabezado = {"Base datos","Agregado por","Fecha registro"};
    
    public String getColumnName(int column){
        return encabezado[column];
    }
    
    public int getColumnCount(){
        return encabezado.length;
    }
    
    public int getRowCount(){
        return listaDeBaseDatos.size();
    }
    
    public Object getValueAt(int row,int column){
        String resultado = null;
        BaseDatos baseDatos = listaDeBaseDatos.get(row);
        switch(column){
                
            
                case 0:
                    resultado = String.valueOf(baseDatos.getNameDatabase());
                    break;
                    
                case 1:
                    resultado = String.valueOf(baseDatos.getIdUsuario());
                    
                    break;
                    
                case 2:
                    resultado = String.valueOf(baseDatos.getFechaRegistro());
                    break;
                    
               
        }
        return resultado;
    }
    
    
    
}
