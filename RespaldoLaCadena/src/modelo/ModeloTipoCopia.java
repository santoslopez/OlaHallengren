/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author santoslopeztzoy
 */
import bean.TipoCopia;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;
import manejador.ManejadorTipoCopia;



public class ModeloTipoCopia extends AbstractTableModel{
    
    private ArrayList<TipoCopia> listadoDeTipoCopia = null;
    private static ModeloTipoCopia instancia;
    public static ModeloTipoCopia getInstancia(){
        if(instancia==null){
            instancia=new ModeloTipoCopia();
        }
        return instancia;
    }
    
    public ModeloTipoCopia(){
        listadoDeTipoCopia = new ManejadorTipoCopia().getInstancia().listarTipoCopiasGuardadas();
    }
    
    private String[] encabezado = {"ID","Tipo de copia"};
    
    public String getColumnName(int column){
        return encabezado[column];
    }
    
    public int getColumnCount(){
        return encabezado.length;
    }
    
    // obtener numero de objetos en la lista
    public int getRowCount(){
        return listadoDeTipoCopia.size();
    }
    
    public Object getValueAt(int row, int column){
        String resultado = null;
        TipoCopia tipoCopia = listadoDeTipoCopia.get(row);
        switch(column){
            case 0:
                resultado = String.valueOf(tipoCopia.getIdTipoCopia());
            break;
            case 1:
                resultado = String.valueOf(tipoCopia.getNombreCopia());
            break;
        }
        
        return resultado;
        
    }
}
