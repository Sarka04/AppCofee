/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sist_gest_cafe;

import DAO.DbOperaciones;
import DAO.tablas;
import javax.swing.JOptionPane;
import modelo.Usuario;
import DAO.usuarioDAO;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @Marcos Sicilia
 */
public class Login extends javax.swing.JFrame {

    public String emailPatron = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

    /**
     * Creates new form Login
     */
    public Login(){

        initComponents();
        jButtonLogin.setEnabled(false);

        tablas tablas = new tablas();
        boolean conexionExitosa = tablas.verificarConexion();

        if (conexionExitosa == true) {

            // Verificar si la tabla usuario existe
            String consultaUsuario = "SELECT 1 FROM information_schema.tables WHERE table_schema = 'cms' AND table_name = 'usuario' LIMIT 1";
            ResultSet resultadoUsuario = DbOperaciones.getData(consultaUsuario);
            try {
                if (!resultadoUsuario.next()) {
                    // La tabla usuario no existe, por lo tanto, crearla
                    tablas.createtablaUsuario();
                }

                // Verificar si la tabla categoria existe
                String consultaCategoria = "SELECT 1 FROM information_schema.tables WHERE table_schema = 'cms' AND table_name = 'categoria' LIMIT 1";
                ResultSet resultadoCategoria = DbOperaciones.getData(consultaCategoria);
                if (!resultadoCategoria.next()) {
                    // La tabla categoria no existe, por lo tanto, crearla
                    tablas.createtablaCategoria();
                }

                // Verificar si la tabla productos existe
                String consultaProductos = "SELECT 1 FROM information_schema.tables WHERE table_schema = 'cms' AND table_name = 'productos' LIMIT 1";
                ResultSet resultadoProductos = DbOperaciones.getData(consultaProductos);
                if (!resultadoProductos.next()) {
                    // La tabla productos no existe, por lo tanto, crearla
                    tablas.createtablaProductos();
                }

                // Verificar si la tabla recibos existe
                String consultaRecibos = "SELECT 1 FROM information_schema.tables WHERE table_schema = 'cms' AND table_name = 'recibo' LIMIT 1";
                ResultSet resultadoRecibos = DbOperaciones.getData(consultaRecibos);
                if (!resultadoRecibos.next()) {
                    // La tabla recibos no existe, por lo tanto, crearla
                    tablas.createtablaRecibos();
                }

                // Generar campos usuario : administrador
                String consultarAdmin = "SELECT * FROM usuario";
                ResultSet resultadoInsertAdmin = DbOperaciones.getData(consultarAdmin);
                if (!resultadoInsertAdmin.next()) {
                    //No existen datos en la tabla por lo que inyectamos:
                    tablas.createInsertarAdmin();
                }

                // Generar campos Categoria
                String insertarCategorias = "SELECT * FROM categoria";
                ResultSet resultadoInsertarCategorias = DbOperaciones.getData(insertarCategorias);
                if (!resultadoInsertarCategorias.next()) {
                    //No existen datos en la tabla por lo que inyectamos:
                    tablas.createInsertarCategorias();
                }

                // Generar campos Productos
                String insertarProductos = "SELECT * FROM productos";
                ResultSet resultadoInsertarProductos = DbOperaciones.getData(insertarProductos);
                if (!resultadoInsertarProductos.next()) {
                    //No existen datos en la tabla por lo que inyectamos:
                    tablas.createInsertarProductos();
                }

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido acceder a la BBDD.");
        }
    }

    public void limpiar() {

        jTextFieldEmail.setText("");
        jPasswordFieldContrasenia.setText("");
        jButtonLogin.setEnabled(false);

    }

    public void validarCampos() {

        String email = jTextFieldEmail.getText();
        String contrasenia = jPasswordFieldContrasenia.getText();
        if (email.matches(emailPatron) && !contrasenia.equals("")) {
            jButtonLogin.setEnabled(true);
        } else {
            jButtonLogin.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordFieldContrasenia = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonRestablecer = new javax.swing.JButton();
        jLabelPantallaRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 185, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 0));
        jLabel2.setText("E-mail");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 0));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 356, 300, 30));

        jPasswordFieldContrasenia.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jPasswordFieldContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseniaKeyReleased(evt);
            }
        });
        getContentPane().add(jPasswordFieldContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 300, 30));

        jButtonLogin.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 150, -1));

        jButtonLimpiar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clear.png"))); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 150, -1));

        jButtonSalir.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 520, 150, 30));

        jButtonRegistrar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonRegistrar.setText("Registrarse");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 350, 160, 40));

        jButtonRestablecer.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonRestablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/change Password.png"))); // NOI18N
        jButtonRestablecer.setText("Restablecer");
        jButtonRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestablecerActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 420, -1, -1));

        jLabelPantallaRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImagenRegistro.png"))); // NOI18N
        jLabelPantallaRegistro.setText("jLabel4");
        getContentPane().add(jLabelPantallaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        String email = jTextFieldEmail.getText();
        String contrasenia = jPasswordFieldContrasenia.getText();
        Usuario usuario = null;
        usuario = usuarioDAO.login(email, contrasenia);
        if (usuario == null) {
            String mensajeError = "<html><b style =\"color:red\">Nombre de usuario o contraseña incorrecta.</html>";
            JOptionPane.showMessageDialog(null, mensajeError, "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            String estado = usuario.getEstado();
            String mensajeError2 = "<html><b>Espere la autorización del administrador.</html>";
            //ESTADO FALSO
            if (usuario.getEstado().equals("inactivo") || usuario.getEstado().equals("1")) {
                //String imageRuta = "/src/iconopopup/wait.png";
                //ImageIcon icono = new ImageIcon(getClass().getResource(imageRuta));
                JOptionPane.showMessageDialog(null, mensajeError2, "INFO", JOptionPane.INFORMATION_MESSAGE); //,icono);
            }
            //ESTADO VERDAD
            if (usuario.getEstado().equals("activo") || usuario.getEstado().equals("0")) {
                setVisible(false);
                new Principal(email).setVisible(true);

            }
        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        int a = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar la aplicación?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextFieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldEmailKeyReleased

    private void jPasswordFieldContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseniaKeyReleased
        validarCampos();
    }//GEN-LAST:event_jPasswordFieldContraseniaKeyReleased

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        setVisible(false);
        new GUI_Registro().setVisible(true);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestablecerActionPerformed
        setVisible(false);
        new RestaurarContrasenia().setVisible(true);
    }//GEN-LAST:event_jButtonRestablecerActionPerformed

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
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRestablecer;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelPantallaRegistro;
    private javax.swing.JPasswordField jPasswordFieldContrasenia;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables
}
