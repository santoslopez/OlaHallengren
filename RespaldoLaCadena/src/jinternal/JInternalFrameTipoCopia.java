/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package jinternal;

import db.Conexion;
import javax.swing.JOptionPane;
import modelo.ModeloTipoCopia;

/**
 *
 * @author santoslopeztzoy
 */
public class JInternalFrameTipoCopia extends javax.swing.JInternalFrame {
    
    
    private static JInternalFrameTipoCopia instancia;
    public static JInternalFrameTipoCopia getInstancia(){
        if(instancia==null){
            instancia=new JInternalFrameTipoCopia();
        }
        return instancia;
    }
    
    /**
     * Creates new form JInternalFrameTipoCopia
     */
    public JInternalFrameTipoCopia() {
        initComponents();
        // habilitar cierre
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

        jPanelContenedorPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTipoCopia = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setTitle("Tipo copia seguridad");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar tipo de copia de seguridad");

        jComboBoxTipoCopia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FULL","Differential","Transaction Log"}));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jButton1.setText("Guardar copia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenedorPrincipalLayout = new javax.swing.GroupLayout(jPanelContenedorPrincipal);
        jPanelContenedorPrincipal.setLayout(jPanelContenedorPrincipalLayout);
        jPanelContenedorPrincipalLayout.setHorizontalGroup(
            jPanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
            .addComponent(jComboBoxTipoCopia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelContenedorPrincipalLayout.setVerticalGroup(
            jPanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTipoCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int confirmarGuardar = JOptionPane.showConfirmDialog(null,
                "¿Estás seguro que deseas agregar?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
                );
        
        String tipoCopia = (String)jComboBoxTipoCopia.getSelectedItem();
      
        String sentencia = "INSERT INTO TipoCopia (nombreCopia) VALUES(?)";
        Object[] params={tipoCopia};
        //JOptionPane.showConfirmDialog(null, "xxxx"+tipoCopia,"Mensaje",JOptionPane.ERROR_MESSAGE);

        if (confirmarGuardar==JOptionPane.YES_OPTION){
          
            Conexion.getInstancia().ejecutarActualizacionPreparedStatement(sentencia, params);
            
        }else{
            JOptionPane.showConfirmDialog(null, "Tipo de copia no guardado","Mensaje",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxTipoCopia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelContenedorPrincipal;
    // End of variables declaration//GEN-END:variables
}
