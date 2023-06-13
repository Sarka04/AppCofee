/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sist_gest_cafe;

import DAO.usuarioDAO;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class RestaurarContrasenia extends javax.swing.JFrame {
      
    private String dbRespuesta = null;
    private String email = null;
    public String emailPatron = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public boolean correoCorrecto;
    public boolean respuestaCorrecta;

    public RestaurarContrasenia() {
        initComponents();
        jButtonGuardar.setEnabled(false);
        jButtonBuscar.setEnabled(false);
        
        jTextFieldPregunta.setEnabled(false);
        jTextFieldRespuesta.setEditable(false);
        jPasswordFieldContrasenia.setEditable(false);
        jPasswordFieldContrasenia.setEnabled(false);
    }

    public void limpiar(){
    
        jButtonGuardar.setEnabled(false);
        jButtonBuscar.setEnabled(false);
        jTextFieldEmail.setEditable(true);
        jTextFieldEmail.setText("");
        jTextFieldPregunta.setText("");
        jTextFieldRespuesta.setText("");
        jPasswordFieldContrasenia.setText("");
        jTextFieldPregunta.setEnabled(false);
        jTextFieldRespuesta.setEditable(false);
        jPasswordFieldContrasenia.setEditable(false);
        jPasswordFieldContrasenia.setEnabled(false);
    }
    
    public void validarEmail() {
    
        email = jTextFieldEmail.getText();   
        if(email.matches(emailPatron)){
            jButtonBuscar.setEnabled(true);
            correoCorrecto = true;
        }
            else
        {
            jButtonBuscar.setEnabled(false);
        }
    }
    
    public void validarCampos() {
    
        String respuestaUsuario = jTextFieldRespuesta.getText();
        String contrasenia = jPasswordFieldContrasenia.getText();
        String respuesta = jTextFieldRespuesta.getText();
        String pregunta = jTextFieldPregunta.getText();
        
        email = jTextFieldEmail.getText();
        Usuario usuario = null;
        usuario = usuarioDAO.getPreguntaSeguridad(email);
        
        boolean condicion = false;
        
        
        if(!pregunta.equals("")){
                     
            if(!contrasenia.equals("")){
                jButtonGuardar.setEnabled(true);
            }  
        }
        else{      
            jButtonGuardar.setEnabled(false);
        }
    }
    
    public boolean metodoRespuestaCorrecta(Boolean condicion){
    
        return condicion;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPregunta = new javax.swing.JTextField();
        jTextFieldRespuesta = new javax.swing.JTextField();
        jPasswordFieldContrasenia = new javax.swing.JPasswordField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonRegistro = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jLabelFondoImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setText("¿Olvidó la contraseña?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 165, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 0));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 0));
        jLabel3.setText("Pregunta de Seguridad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 271, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 0));
        jLabel4.setText("Respuesta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 325, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 0));
        jLabel5.setText("Nueva Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 379, -1, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 213, 448, -1));

        jTextFieldPregunta.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jTextFieldPregunta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPreguntaKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 268, 446, -1));

        jTextFieldRespuesta.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jTextFieldRespuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldRespuestaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldRespuestaFocusLost(evt);
            }
        });
        jTextFieldRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRespuestaKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 322, 446, -1));

        jPasswordFieldContrasenia.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jPasswordFieldContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseniaFocusGained(evt);
            }
        });
        jPasswordFieldContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseniaKeyReleased(evt);
            }
        });
        getContentPane().add(jPasswordFieldContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 376, 446, -1));

        jButtonBuscar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1201, 213, -1, -1));

        jButtonGuardar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, -1, -1));

        jButtonRegistro.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonRegistro.setText("Registrarse");
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, -1, -1));

        jButtonLimpiar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clear.png"))); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1206, 380, 140, -1));

        jButtonSalir.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 160, 150, -1));

        jButtonLogin.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 490, 150, -1));

        jLabelFondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImagenRegistro2.png"))); // NOI18N
        jLabelFondoImagen.setText("jLabel6");
        getContentPane().add(jLabelFondoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyReleased
        validarEmail();
    }//GEN-LAST:event_jTextFieldEmailKeyReleased

    private void jTextFieldPreguntaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPreguntaKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldPreguntaKeyReleased

    private void jTextFieldRespuestaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldRespuestaKeyReleased

    private void jPasswordFieldContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseniaKeyReleased
        validarCampos();
    }//GEN-LAST:event_jPasswordFieldContraseniaKeyReleased

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
            int a = JOptionPane.showConfirmDialog(null,"¿Seguro que desea cerrar la aplicación?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
            if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        
        String respuesta = jTextFieldRespuesta.getText();
        String nuevaContrasenia = jPasswordFieldContrasenia.getText();
        String mensajeError = "<html><b style =\"color:red\">Respuesta incorrecta.</html>";
        if(respuesta.equals(dbRespuesta))
        {
            usuarioDAO.actualizarGuardado(email, nuevaContrasenia);
            limpiar();
        }    
        else
        {
            JOptionPane.showMessageDialog(null, mensajeError, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
                
        email = jTextFieldEmail.getText();
        Usuario usuario = null;
        usuario = usuarioDAO.getPreguntaSeguridad(email);
        String usuarioRespuestaBD = usuario.getRespuesta();
        String usuarioRespuestaJF = jTextFieldRespuesta.getText();
        String mensajeError = "<html><b style =\"color:red\">Correo electrónico incorrecta.</html>";
        if(usuario == null)
            JOptionPane.showMessageDialog(null, mensajeError, "ERROR", JOptionPane.ERROR_MESSAGE);
        else {
        
            jButtonBuscar.setEnabled(false);
            jTextFieldEmail.setEditable(false);
            jTextFieldPregunta.setEnabled(true);
            jTextFieldPregunta.setText(usuario.getPregunta());
            jTextFieldPregunta.setEnabled(false);
            jTextFieldRespuesta.setEditable(true);
            dbRespuesta = usuario.getRespuesta();
            validarCampos();
            jTextFieldPregunta.setEnabled(false);
            jPasswordFieldContrasenia.setEditable(false);
            jPasswordFieldContrasenia.setEnabled(true);
            respuestaCorrecta = true;
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        setVisible(false);
        new GUI_Registro().setVisible(true);
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void jTextFieldRespuestaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaFocusLost
          
        String respuestaUsuario = jTextFieldRespuesta.getText();
        String respuesta = jTextFieldRespuesta.getText();
        
        email = jTextFieldEmail.getText();
        Usuario usuario = null;
        usuario = usuarioDAO.getPreguntaSeguridad(email);
        
        if(!respuesta.equals("") && respuestaUsuario.matches(usuario.getRespuesta())){
            jPasswordFieldContrasenia.setEnabled(true);
            jPasswordFieldContrasenia.setEditable(true);
        }
        else if(respuesta.equals("") && !respuestaUsuario.matches(usuario.getRespuesta())){
            //jPasswordFieldContrasenia.setEnabled(false);
            JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.");    
        }       
    }//GEN-LAST:event_jTextFieldRespuestaFocusLost

    private void jTextFieldRespuestaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaFocusGained
       
        if(correoCorrecto = false){
            JOptionPane.showMessageDialog(null, "Rellene los campos antes.");
        }      
    }//GEN-LAST:event_jTextFieldRespuestaFocusGained

    private void jPasswordFieldContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseniaFocusGained
        if(correoCorrecto = false){
            JOptionPane.showMessageDialog(null, "Rellene los campos antes.");
        } 
        else if(respuestaCorrecta = false){
            JOptionPane.showMessageDialog(null, "Rellene los campos antes.");
        }
    }//GEN-LAST:event_jPasswordFieldContraseniaFocusGained

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
            java.util.logging.Logger.getLogger(RestaurarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurarContrasenia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFondoImagen;
    private javax.swing.JPasswordField jPasswordFieldContrasenia;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldPregunta;
    private javax.swing.JTextField jTextFieldRespuesta;
    // End of variables declaration//GEN-END:variables
}
