/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author santoslopeztzoy
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanelBackground = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jLabelImagenLogin = new javax.swing.JLabel();
        jLabelTituloFerreteria = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jPanelIniciarSesion = new javax.swing.JPanel();
        jLabelIniciarSesion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/monitor.png"))); // NOI18N
        jPanelBackground.add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 520, 680));
        jLabelImagen.getAccessibleContext().setAccessibleName("lblImagen");
        jLabelImagen.getAccessibleContext().setAccessibleDescription("");

        jLabelImagenLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        jPanelBackground.add(jLabelImagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 520, 140));
        jLabelImagenLogin.getAccessibleContext().setAccessibleName("jLabelCirculoImagen");

        jLabelTituloFerreteria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloFerreteria.setText("FERRETERIA LA CADENA");
        jPanelBackground.add(jLabelTituloFerreteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 520, 60));

        jLabel1.setText("LOGO");
        jPanelBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 390, 20));

        jLabelPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(51, 51, 255));
        jLabelPassword.setText("Password");
        jPanelBackground.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(51, 51, 255));
        jLabelUsuario.setText("Nombre de usuario");
        jPanelBackground.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        jPanelBackground.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 390, 40));
        jPanelBackground.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 390, 40));

        jPanelIniciarSesion.setBackground(new java.awt.Color(51, 51, 255));

        jLabelIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIniciarSesion.setText("INICIAR SESION");
        jLabelIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelIniciarSesionLayout = new javax.swing.GroupLayout(jPanelIniciarSesion);
        jPanelIniciarSesion.setLayout(jPanelIniciarSesionLayout);
        jPanelIniciarSesionLayout.setHorizontalGroup(
            jPanelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanelIniciarSesionLayout.setVerticalGroup(
            jPanelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelIniciarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanelBackground.add(jPanelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 210, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanelBackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelImagenLogin;
    private javax.swing.JLabel jLabelIniciarSesion;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTituloFerreteria;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelIniciarSesion;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}