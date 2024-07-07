package jinternal;

import bean.BaseDatos;
import db.Conexion;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
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
    // Crear un icono personalizado
    private ImageIcon icon = new ImageIcon("src/img/confirm.png");
        
    private ImageIcon iconError = new ImageIcon("src/img/close.png");
        
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
        
        // habilitar cerrar ventana interna
        setClosable(true);
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
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Registrar base de datos");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR BASE DE DATOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Nombre de base de datos");

        txtNombreBasedatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBasedatosActionPerformed(evt);
            }
        });

        btnGuardarBaseDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardarBaseDatos.setText("Guardar");
        btnGuardarBaseDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarBaseDatos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarBaseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBaseDatosActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtNombreBasedatos)
            .addComponent(btnGuardarBaseDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreBasedatos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarBaseDatos)
                .addGap(0, 0, Short.MAX_VALUE))
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
                JOptionPane.QUESTION_MESSAGE,
                icon);
        
        if (confirmarGuardar==JOptionPane.YES_OPTION){
                
            /*String sentencia = "INSERT INTO BaseDatos(nameDatabase,idUsuario,fechaRegistro) VALUES('"
                +nameDatabase+"','"
                +idUsuario+"','"
                +new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(hola)
                +"')";*/
            
            String sentencia = "INSERT INTO BaseDatos(nameDatabase,idUsuario,fechaRegistro) VALUES(?,?,?)";
            Object[] params = {nameDatabase,idUsuario,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(hola)};
            
            //Conexion.getInstancia().ejecutarSentencia(sentencia);
            Conexion.getInstancia().ejecutarActualizacionPreparedStatement(sentencia,params);
            
            JOptionPane.showMessageDialog(null, "Base de datos agregada exitosamente.");
            txtNombreBasedatos.setText("");
            // Cerrar el JInternalFrame
            //JInternalFrame internalFrame = (JInternalFrame) SwingUtilities.getWindowAncestor(btnGuardarBaseDatos);
            JInternalDatabase.getInstancia().dispose();
        }else{
           
            //JOptionPane.showMessageDialog(null,"Error: base de datos no guardado");
            JOptionPane.showMessageDialog(null,"Base de datos no guardado","Error",JOptionPane.ERROR_MESSAGE, iconError);

        }
    
    }//GEN-LAST:event_btnGuardarBaseDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarBaseDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtNombreBasedatos;
    // End of variables declaration//GEN-END:variables
}
