/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import db.Conexion;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import jinternal.JInternalRegistrarUsuario;
import jinternal.JInternalFrameCrearCopiaSeguridad;
import jinternal.JInternalDatabase;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import jinternal.JInternalFrameListadoUsuarios;
import jinternal.JInternalFrameTipoCopia;
import java.awt.Dimension;
import java.awt.Toolkit;
import jinternal.JInternalFrameListadoCopias;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jinternal.JInternalFrameListadoBaseDatos;

/**
 *
 * @author santoslopeztzoy
 */
public class MenuPrincipalJFrame extends javax.swing.JFrame {
    // patron de diseno singleton para crear una sola instancia de la clase
    private static MenuPrincipalJFrame instancia;
    public static MenuPrincipalJFrame getInstancia(){
        if(instancia==null){
            instancia=new MenuPrincipalJFrame();
        }
        return instancia;
    }
    
    
    private ImageIcon icon = new ImageIcon("src/img/confirm.png");
    
    private ImageIcon iconError = new ImageIcon("src/img/close.png");
    
 
        
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
    // Obtener ancho y alto
    int ancho = screenSize.width;
    int alto = screenSize.height;
       
    int defaultRest = 300;

    //private JInternalDatabase j;
    /**
     * Creates new form MenuPrincipalJFrame
     */
    public MenuPrincipalJFrame() {
        initComponents();
        
        // tamaño default
        this.setSize(ancho-defaultRest,alto-defaultRest);

        
        // centrar
        this.setLocationRelativeTo(null);
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
        jPanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuBaseDatos = new javax.swing.JMenu();
        jMenuItemRegistrarBaseDatos = new javax.swing.JMenuItem();
        jMenuItemListadoBaseDatos = new javax.swing.JMenuItem();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemJinternalRegistrarUsuario = new javax.swing.JMenuItem();
        jMenuItemListarUsuarios = new javax.swing.JMenuItem();
        jMenuCopiaSeguridad = new javax.swing.JMenu();
        jMenuItemTipoCopia = new javax.swing.JMenuItem();
        jMenuItemListadoCopias = new javax.swing.JMenuItem();
        jMenuItemCrearCopiaSeguridad = new javax.swing.JMenuItem();
        jMenuItemEliminarCopiaSeguridad = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - Administrador");

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FERRETERIA LA CADENA");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        escritorio.setLayer(jPanelTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 226, Short.MAX_VALUE))
        );

        jMenuBaseDatos.setText("BASE DATOS");

        jMenuItemRegistrarBaseDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jMenuItemRegistrarBaseDatos.setText("Registrar");
        jMenuItemRegistrarBaseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarBaseDatosActionPerformed(evt);
            }
        });
        jMenuBaseDatos.add(jMenuItemRegistrarBaseDatos);

        jMenuItemListadoBaseDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list-2.png"))); // NOI18N
        jMenuItemListadoBaseDatos.setText("Listado de base de datos");
        jMenuItemListadoBaseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListadoBaseDatosActionPerformed(evt);
            }
        });
        jMenuBaseDatos.add(jMenuItemListadoBaseDatos);

        jMenuBar1.add(jMenuBaseDatos);

        jMenuUsuarios.setText("USUARIOS");

        jMenuItemJinternalRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jMenuItemJinternalRegistrarUsuario.setText("Registrar");
        jMenuItemJinternalRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJinternalRegistrarUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemJinternalRegistrarUsuario);

        jMenuItemListarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phone-book.png"))); // NOI18N
        jMenuItemListarUsuarios.setText("Listado usuarios");
        jMenuItemListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarUsuariosActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemListarUsuarios);

        jMenuBar1.add(jMenuUsuarios);

        jMenuCopiaSeguridad.setText("COPIA SEGURIDAD");

        jMenuItemTipoCopia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jMenuItemTipoCopia.setText("Registrar copia");
        jMenuItemTipoCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTipoCopiaActionPerformed(evt);
            }
        });
        jMenuCopiaSeguridad.add(jMenuItemTipoCopia);

        jMenuItemListadoCopias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list.png"))); // NOI18N
        jMenuItemListadoCopias.setText("Listado copias");
        jMenuItemListadoCopias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListadoCopiasActionPerformed(evt);
            }
        });
        jMenuCopiaSeguridad.add(jMenuItemListadoCopias);

        jMenuItemCrearCopiaSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backup.png"))); // NOI18N
        jMenuItemCrearCopiaSeguridad.setText("Crear copia seguridad");
        jMenuItemCrearCopiaSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearCopiaSeguridadActionPerformed(evt);
            }
        });
        jMenuCopiaSeguridad.add(jMenuItemCrearCopiaSeguridad);

        jMenuItemEliminarCopiaSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jMenuItemEliminarCopiaSeguridad.setText("Eliminar copias antiguas");
        jMenuItemEliminarCopiaSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarCopiaSeguridadActionPerformed(evt);
            }
        });
        jMenuCopiaSeguridad.add(jMenuItemEliminarCopiaSeguridad);

        jMenuBar1.add(jMenuCopiaSeguridad);

        jMenu1.setText("PERFIL");

        jMenuItem1.setText("Configuracion");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarUsuariosActionPerformed
        // TODO add your handling code here:
        
        JInternalFrameListadoUsuarios j = new JInternalFrameListadoUsuarios();
        if(!escritorio.isAncestorOf(j)){
            escritorio.add(j);
            j.setVisible(true);
            // centrar
            j.setLocation(
            (escritorio.getWidth() - JInternalFrameListadoUsuarios.getInstancia().getWidth())/2,
            (escritorio.getHeight() - JInternalFrameListadoUsuarios.getInstancia().getWidth())/2
            );
        }else{
            escritorio.setSelectedFrame(j);
        }
    }//GEN-LAST:event_jMenuItemListarUsuariosActionPerformed

 
    
    private void jMenuItemRegistrarBaseDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarBaseDatosActionPerformed
        // TODO add your handling code here:
        JInternalDatabase j = new JInternalDatabase();
        if(!escritorio.isAncestorOf(j)){
            escritorio.add(j);
            j.setVisible(true);
            // centrar
            j.setLocation(
                (escritorio.getWidth() - JInternalDatabase.getInstancia().getWidth()) / 2,
                (escritorio.getHeight() - JInternalDatabase.getInstancia().getHeight()) / 2
            );        
        }else{
            escritorio.setSelectedFrame(j);
        }       
    }//GEN-LAST:event_jMenuItemRegistrarBaseDatosActionPerformed

    private void jMenuItemJinternalRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJinternalRegistrarUsuarioActionPerformed
        // TODO add your handling code here:
        if(!escritorio.isAncestorOf(JInternalRegistrarUsuario.getInstancia())){
            escritorio.add(JInternalRegistrarUsuario.getInstancia());
            JInternalRegistrarUsuario.getInstancia().setVisible(true);
            // centrar
            JInternalRegistrarUsuario.getInstancia().setLocation(
            (escritorio.getWidth() - JInternalRegistrarUsuario.getInstancia().getWidth())/2,
            (escritorio.getHeight() - JInternalRegistrarUsuario.getInstancia().getWidth())/2
            );
        }else{
            escritorio.setSelectedFrame(JInternalRegistrarUsuario.getInstancia());
        }
    }//GEN-LAST:event_jMenuItemJinternalRegistrarUsuarioActionPerformed

    private void jMenuItemCrearCopiaSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearCopiaSeguridadActionPerformed
        // TODO add your handling code here:
        if(!escritorio.isAncestorOf(JInternalFrameCrearCopiaSeguridad.getInstancia())){
            escritorio.add(JInternalFrameCrearCopiaSeguridad.getInstancia());
            JInternalFrameCrearCopiaSeguridad.getInstancia().setVisible(true);
            // centrar
            JInternalFrameCrearCopiaSeguridad.getInstancia().setLocation(
            (escritorio.getWidth() - JInternalFrameCrearCopiaSeguridad.getInstancia().getWidth())/2,
            (escritorio.getHeight() - JInternalFrameCrearCopiaSeguridad.getInstancia().getWidth())/2
            );
        }else{
            escritorio.setSelectedFrame(JInternalFrameCrearCopiaSeguridad.getInstancia());
        }
    }//GEN-LAST:event_jMenuItemCrearCopiaSeguridadActionPerformed

    private void jMenuItemEliminarCopiaSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarCopiaSeguridadActionPerformed
        // TODO add your handling code here:
            // Crear un objeto File que representa el directorio actual (donde se está ejecutando el programa)
    // Especificar el directorio donde están las copias de seguridad (ruta de Windows)
   // Especificar el directorio donde están las copias de seguridad (ruta de Windows sin secuencias de escape)
    String windowsPath = """
        C:\\Program Files\\Microsoft SQL Server\\MSSQL15.MSSQLSERVER\\MSSQL\\Backup\\
        """;
        
        // Crear un objeto File con la ruta de Windows especificada
    File dir = new File(windowsPath);
    // Verificar que el directorio existe
    if (!dir.exists()) {
        System.out.println("El directorio especificado no existe: " + dir.getAbsolutePath());
        return;
    }

    // Listar todos los archivos en el directorio especificado que terminan con ".bak"
    File[] files = dir.listFiles((dir1, name) -> name.endsWith(".bak"));

    // Verificar si se encontraron archivos
    if (files == null || files.length == 0) {
        System.out.println("No se encontraron archivos .bak en el directorio: " + dir.getAbsolutePath());
        return;
    }

    // Calcular el tiempo límite para determinar qué archivos son más antiguos de 3 horas
    long cutoff = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(3);
    System.out.println("Tiempo de corte: " + cutoff);

    // Iterar a través de los archivos encontrados
    for (File file : files) {
        System.out.println("Revisando archivo: " + file.getName() + ", última modificación: " + file.lastModified());

        // Verificar si la última modificación del archivo es anterior al tiempo límite
        if (file.lastModified() < cutoff) {
            // Intentar eliminar el archivo
            if (file.delete()) {
                // Imprimir un mensaje en la consola si el archivo fue eliminado exitosamente
                System.out.println("Eliminado: " + file.getName());
            } else {
                // Imprimir un mensaje en la consola si el archivo no pudo ser eliminado
                System.out.println("No se pudo eliminar: " + file.getName());
            }
        } else {
            System.out.println("El archivo " + file.getName() + " no es más antiguo de 3 horas.");
        }
    }
    
    }//GEN-LAST:event_jMenuItemEliminarCopiaSeguridadActionPerformed

    private void jMenuItemTipoCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTipoCopiaActionPerformed
        // TODO add your handling code here:
        if(!escritorio.isAncestorOf(JInternalFrameTipoCopia.getInstancia())){

 
            escritorio.add(JInternalFrameTipoCopia.getInstancia());
            JInternalFrameTipoCopia.getInstancia().setVisible(true);
            // centrar
            JInternalFrameTipoCopia.getInstancia().setLocation(
                (escritorio.getWidth() - JInternalFrameTipoCopia.getInstancia().getWidth())/2,
                (escritorio.getHeight() - JInternalFrameTipoCopia.getInstancia().getWidth())/2
            );                
            
        
        }else{
            escritorio.setSelectedFrame(JInternalFrameTipoCopia.getInstancia());
        }
        
    }//GEN-LAST:event_jMenuItemTipoCopiaActionPerformed

    private void jMenuItemListadoCopiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListadoCopiasActionPerformed
        // TODO add your handling code here:
        
        /*String sentencia = "SELECT count(*) AS total FROM TipoCopia";
        
        try{
            
            PreparedStatement preparedStatement = Conexion.getInstancia().getConection().prepareStatement(sentencia);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()){
                int count = resultSet.getInt("total");
                if (count>0){

                    
                }else{
                    JOptionPane.showMessageDialog(null, "Actualmente no hay base de datos para mostrar","Listado de base de datos",JOptionPane.ERROR_MESSAGE,iconError);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }*/
        JInternalFrameListadoCopias j = new JInternalFrameListadoCopias();
        if(!escritorio.isAncestorOf(j)){
            escritorio.add(j);
            j.setVisible(true);
            // centrar
            j.setLocation(
                (escritorio.getWidth() - j.getWidth())/2,
                (escritorio.getHeight() - j.getWidth())/2
            );
        }else{
            escritorio.setSelectedFrame(j);
        }

        
        //Conexion.getInstancia().ejecutarSentencia(sentencia);

    }//GEN-LAST:event_jMenuItemListadoCopiasActionPerformed

    private void jMenuItemListadoBaseDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListadoBaseDatosActionPerformed
        // TODO add your handling code here:
        JInternalFrameListadoBaseDatos j = new JInternalFrameListadoBaseDatos();
       
        if(!escritorio.isAncestorOf(j)){
            escritorio.add(j);
            j.setVisible(true);
            // centrar
            j.setLocation(
            (escritorio.getWidth() - j.getWidth())/2,
            (escritorio.getHeight() - j.getWidth())/2
            );
        }else{
            escritorio.setSelectedFrame(j);
        }
        
    }//GEN-LAST:event_jMenuItemListadoBaseDatosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalJFrame().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuBaseDatos;
    private javax.swing.JMenu jMenuCopiaSeguridad;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCrearCopiaSeguridad;
    private javax.swing.JMenuItem jMenuItemEliminarCopiaSeguridad;
    private javax.swing.JMenuItem jMenuItemJinternalRegistrarUsuario;
    private javax.swing.JMenuItem jMenuItemListadoBaseDatos;
    private javax.swing.JMenuItem jMenuItemListadoCopias;
    private javax.swing.JMenuItem jMenuItemListarUsuarios;
    private javax.swing.JMenuItem jMenuItemRegistrarBaseDatos;
    private javax.swing.JMenuItem jMenuItemTipoCopia;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JPanel jPanelTitulo;
    // End of variables declaration//GEN-END:variables
}
