package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santoslopeztzoy
 */

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;
import bean.Usuario;
import manejador.ManejadorDeUsuario;

public class ModeloDeUsuario extends AbstractTableModel{
   private ArrayList<Usuario> listadoDeDatos = null;
   private static ModeloDeUsuario instancia;
   public static ModeloDeUsuario getInstancia(){
       if(instancia==null){
            instancia=new ModeloDeUsuario();
        }
        return instancia;
    }
    
   public ModeloDeUsuario(){
       listadoDeDatos = new ManejadorDeUsuario().getInstancia().listarUsuariosGuardados();
       
   }
    
   private String[] encabezado = {"Nombre de usuario","Correo","Estado","Fecha registro"};
   
   public String getColumnName(int column){
       return encabezado[column];
   }
   public int getColumnCount(){
       return encabezado.length;
   }
   
   // obtener numero de objetos en la lista
   public int getRowCount(){
       return listadoDeDatos.size();
   }
   
   public Object getValueAt(int row,int column){
       String resultado = null;
       Usuario usuario = listadoDeDatos.get(row);
      switch(column){
       
               case 0:
                   resultado = String.valueOf(usuario.getNombreUsuario());
                   break;
               case 1:
                   resultado = String.valueOf(usuario.getEmail());
                   break;
               case 2:
                   //resultado = String.valueOf(usuario.getPassword());
                   resultado = String.valueOf(usuario.getEstado());
                   break;
               case 3:
                   resultado = String.valueOf(usuario.getFechaRegistro());
       
                   break;
               case 4:
                    resultado = String.valueOf(usuario.getIdTipoUsuario());

               break;  
               
               
                   
       }
       return resultado;      
   }
}
