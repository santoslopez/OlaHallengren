/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package jinternal;

import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author santoslopeztzoy
 */
public class JInternalEliminarArchivos extends javax.swing.JInternalFrame {
    private static JInternalEliminarArchivos instancia;
    public static JInternalEliminarArchivos getInstancia(){
        if (instancia==null){
            instancia=new JInternalEliminarArchivos();
        }
        return instancia;
    }    
    
    
    private ImageIcon icon = new ImageIcon("src/img/confirm.png");
        
    private ImageIcon iconError = new ImageIcon("src/img/close.png");
    
    String rutaBatEliminar = "C:\\respaldo\\e.bat";

    ProcessBuilder procesoEliminarArchivos = new ProcessBuilder("cmd", "/C",rutaBatEliminar);
    /**
     * Creates new form NewJInternalEliminarArchivos
     */
    public JInternalEliminarArchivos() {
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

        jPanelEliminarArchivos = new javax.swing.JPanel();
        jButtonEliminarArchivos = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();

        setTitle("Eliminar archivos antiguos");

        jButtonEliminarArchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jButtonEliminarArchivos.setText("Eliminar archivos antiguos");
        jButtonEliminarArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarArchivosActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Eliminar archivos antiguos: de 3 días atrás");

        javax.swing.GroupLayout jPanelEliminarArchivosLayout = new javax.swing.GroupLayout(jPanelEliminarArchivos);
        jPanelEliminarArchivos.setLayout(jPanelEliminarArchivosLayout);
        jPanelEliminarArchivosLayout.setHorizontalGroup(
            jPanelEliminarArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonEliminarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelEliminarArchivosLayout.setVerticalGroup(
            jPanelEliminarArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEliminarArchivosLayout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEliminarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEliminarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarArchivosActionPerformed
        // TODO add your handling code here:
        int confirmarCopiaSeguridad = JOptionPane.showConfirmDialog(null, "Confirmar","¿Deseas eliminar archivos antiguos?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        icon);
                if (confirmarCopiaSeguridad==JOptionPane.YES_OPTION){
                    try {
                        Process p = procesoEliminarArchivos.start();
                        // Redirigir el stream de error al de salida
                        // Esperar a que el proceso termine
                        int exitCode = p.waitFor();
                        p.destroy();
                        
                        // Aquí manejas la salida del proceso si es necesario
                        JOptionPane.showMessageDialog(null, "La eliminación de archivos ha terminado con código: ","Mensaje", JOptionPane.INFORMATION_MESSAGE);


                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error al ejecutar el script.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }else{
                    JOptionPane.showMessageDialog(null,"Archivos no eliminados","Error",JOptionPane.ERROR_MESSAGE,iconError);
                }
    }//GEN-LAST:event_jButtonEliminarArchivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminarArchivos;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelEliminarArchivos;
    // End of variables declaration//GEN-END:variables
}
