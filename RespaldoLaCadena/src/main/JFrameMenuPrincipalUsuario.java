/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.DayOfWeek;
import javax.swing.JOptionPane;
import jinternal.JInternalFrameCrearCopiaSeguridad;

import java.time.LocalDate;

/**
 *
 * @author santoslopeztzoy
 */
public class JFrameMenuPrincipalUsuario extends javax.swing.JFrame {
    // para obtener ancho y alto
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    // ancho y alto
    int ancho = screenSize.width;
    int alto = screenSize.height;
    
    int defaultRest = 400;
    
    
    // obtener fecha actual
    LocalDate fechaHoy = LocalDate.now();
    
    private static JFrameMenuPrincipalUsuario instancia;
    public static JFrameMenuPrincipalUsuario getInstancia(){
        if(instancia==null){
            instancia=new JFrameMenuPrincipalUsuario();
        }
        return instancia;
    }

    /**
     * Creates new form JFrameMenuPrincipalUsuario
     */
    public JFrameMenuPrincipalUsuario() {
        initComponents();
        
        this.setSize(ancho-defaultRest,alto-defaultRest);
        
        // tamaño default
        this.size();
        
        // centrar
        this.setLocationRelativeTo(null);
        
        DayOfWeek dia = fechaHoy.getDayOfWeek();
        
        boolean habilitar = (dia==DayOfWeek.SATURDAY);
        
        if (habilitar){
            
            jMenuItemEliminarCopiasAntiguas.setEnabled(true);
           
        }else{
            jMenuItemEliminarCopiasAntiguas.setEnabled(false);
        }
        
       
        //jMenuItemEliminarCopiasAntiguas.enable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBarCompleto = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuCopiaSeguridad = new javax.swing.JMenu();
        jMenuItemCrearCopiaSeguridad = new javax.swing.JMenuItem();
        jMenuItemEliminarCopiasAntiguas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - Usuario");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        jMenu1.setText("Salir");

        jMenuItemSalir.setText("Cerrar sesión");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBarCompleto.add(jMenu1);

        jMenuCopiaSeguridad.setText("COPIA SEGURIDAD");

        jMenuItemCrearCopiaSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backup.png"))); // NOI18N
        jMenuItemCrearCopiaSeguridad.setText("Crear copia de seguridad");
        jMenuItemCrearCopiaSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearCopiaSeguridadActionPerformed(evt);
            }
        });
        jMenuCopiaSeguridad.add(jMenuItemCrearCopiaSeguridad);

        jMenuItemEliminarCopiasAntiguas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jMenuItemEliminarCopiasAntiguas.setText("Eliminar copias antiguas");
        jMenuItemEliminarCopiasAntiguas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarCopiasAntiguasActionPerformed(evt);
            }
        });
        jMenuCopiaSeguridad.add(jMenuItemEliminarCopiasAntiguas);

        jMenuBarCompleto.add(jMenuCopiaSeguridad);

        setJMenuBar(jMenuBarCompleto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCrearCopiaSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearCopiaSeguridadActionPerformed
        // TODO add your handling code here:
        if(!escritorio.isAncestorOf(JInternalFrameCrearCopiaSeguridad.getInstancia())){
            escritorio.add(JInternalFrameCrearCopiaSeguridad.getInstancia());
            
            JInternalFrameCrearCopiaSeguridad.getInstancia().setVisible(true);
            
            // centrar
            JInternalFrameCrearCopiaSeguridad.getInstancia().setLocation(
                    (escritorio.getWidth()-JInternalFrameCrearCopiaSeguridad.getInstancia().getWidth())/2,
                    (escritorio.getHeight() - JInternalFrameCrearCopiaSeguridad.getInstancia().getWidth())/2
            );
        }else{
            escritorio.setSelectedFrame(JInternalFrameCrearCopiaSeguridad.getInstancia());
        }
        
    }//GEN-LAST:event_jMenuItemCrearCopiaSeguridadActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
        
        int confirmarSalir = JOptionPane.showConfirmDialog(null, "¿Quieres salir del programa?","Mensaje",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(confirmarSalir==JOptionPane.YES_OPTION){
            this.dispose();
        }
        
        
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemEliminarCopiasAntiguasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarCopiasAntiguasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItemEliminarCopiasAntiguasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenuPrincipalUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBarCompleto;
    private javax.swing.JMenu jMenuCopiaSeguridad;
    private javax.swing.JMenuItem jMenuItemCrearCopiaSeguridad;
    private javax.swing.JMenuItem jMenuItemEliminarCopiasAntiguas;
    private javax.swing.JMenuItem jMenuItemSalir;
    // End of variables declaration//GEN-END:variables
}
