package main;

import bean.BaseDatos;
import db.Conexion;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author santoslopeztzoy
 */
public class JInternalDatabase extends javax.swing.JInternalFrame {
    private static JInternalDatabase instancia;
    public static JInternalDatabase getInstancia(){
        if(instancia==null){
            instancia=new JInternalDatabase();
        }
        return instancia;
    }
    /**
     * Creates new form JInternalDatabase
     */
    public JInternalDatabase() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreBasedatos = new javax.swing.JTextField();
        btnGuardarBaseDatos = new javax.swing.JButton();

        jLabel1.setText("REGISTRAR BASE DE DATOS");

        jLabel2.setText("Nombre de base de datos");

        txtNombreBasedatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBasedatosActionPerformed(evt);
            }
        });

        btnGuardarBaseDatos.setText("Guardar");
        btnGuardarBaseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBaseDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtNombreBasedatos)
            .addComponent(btnGuardarBaseDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreBasedatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreBasedatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreBasedatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBasedatosActionPerformed

    private void btnGuardarBaseDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBaseDatosActionPerformed
        // TODO add your handling code here:
        Date hola =new Date();
        //BaseDatos b = new BaseDatos("ESTOy aquiii ahora",1,hola);
        //System.out.println("Estoy aqui en la opcion de BaseDatos");
        String nameDatabase = txtNombreBasedatos.getText();
        int idUsuario = 1;
       
        
        int confirmarGuardar = JOptionPane.showConfirmDialog(null,
                "¿Estás seguro de que deseas agregar esta base de datos?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if (confirmarGuardar==JOptionPane.YES_OPTION){
                
            String sentencia = "INSERT INTO BaseDatos(nameDatabase,idUsuario,fechaRegistro) VALUES('"
                +nameDatabase+"','"
                +idUsuario+"','"
                +new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(hola)
                +"')";
            
            Conexion.getInstancia().ejecutarSentencia(sentencia);
            JOptionPane.showMessageDialog(null, "Base de datos agregada exitosamente.");
            txtNombreBasedatos.setText("");
            // Cerrar el JInternalFrame
            //JInternalFrame internalFrame = (JInternalFrame) SwingUtilities.getWindowAncestor(btnGuardarBaseDatos);
            JInternalDatabase.getInstancia().dispose();
        }else{
            JOptionPane.showMessageDialog(null, "ERROR.");

        }
    
    }//GEN-LAST:event_btnGuardarBaseDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarBaseDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreBasedatos;
    // End of variables declaration//GEN-END:variables
}
