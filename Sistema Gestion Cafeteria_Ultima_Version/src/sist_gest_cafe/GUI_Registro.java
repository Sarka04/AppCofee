/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sist_gest_cafe;
import javax.swing.JOptionPane;
import modelo.Usuario;
import DAO.usuarioDAO;

/**
 *
 * @author Marcos Maria Sicilia
 */
public class GUI_Registro extends javax.swing.JFrame {

    public String emailPatron = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String telefonoPatron = "^[0-9]*$";
    
    /**
     * Creates new form GUI_Registro
     */
    public GUI_Registro() {
        initComponents();
        jButtonGuardar.setEnabled(false);
        jButtonContrasenia.setVisible(false);
        jButtonContrasenia.setEnabled(false);
        
    }

    public void limpiar(){
    
        jTextFieldNombre.setText("");
        jTextFieldEmail.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldPregunta.setText("");
        jTextFieldRespuesta.setText("");
        jTextFieldTelefono.setText("");
        jPasswordFieldContrasenia.setText("");
        jButtonGuardar.setEnabled(false);
    }
    
    
    public void validarCampos(){
    
        String nombre = jTextFieldNombre.getText();
        String email = jTextFieldEmail.getText();
        String telefono = jTextFieldTelefono.getText();
        String direccion = jTextFieldDireccion.getText();
        String contrasenia = jPasswordFieldContrasenia.getText();
        String pregunta = jTextFieldPregunta.getText();
        String respuesta = jTextFieldRespuesta.getText();
        if(!nombre.equals("") && email.matches(emailPatron) && telefono.matches(telefonoPatron) && telefono.length() == 9 && !direccion.equals("") && !contrasenia.equals("") && !pregunta.equals("") && !respuesta.equals(""))
            jButtonGuardar.setEnabled(true);
        else
            jButtonGuardar.setEnabled(false);
    
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldPregunta = new javax.swing.JTextField();
        jTextFieldRespuesta = new javax.swing.JTextField();
        jPasswordFieldContrasenia = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonContrasenia = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelImagenFondoRegistro = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 0));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 183, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 0));
        jLabel3.setText("E-mail");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 183, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 0));
        jLabel4.setText("Teléfono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 183, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 0));
        jLabel5.setText("Dirección");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 183, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 102, 0));
        jLabel6.setText("Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 183, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 102, 0));
        jLabel7.setText("Pregunta Clave");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 183, -1));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 102, 0));
        jLabel8.setText("Respuesta");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 630, 183, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 400, 40));

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 400, 40));

        jTextFieldTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 400, 40));

        jTextFieldDireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDireccionKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 400, 40));

        jTextFieldPregunta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldPregunta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPreguntaKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 400, 40));

        jTextFieldRespuesta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRespuestaKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 400, 40));

        jPasswordFieldContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordFieldContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldContraseniaMouseClicked(evt);
            }
        });
        jPasswordFieldContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseniaKeyReleased(evt);
            }
        });
        getContentPane().add(jPasswordFieldContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 400, 40));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 102, 0));
        jLabel9.setText("REGISTRO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 730, 180, -1));

        jButtonLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        jButtonLogin.setText("LOGIN");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 730, 180, -1));

        jButtonLimpiar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clear.png"))); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 230, 190, -1));

        jButtonContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonContrasenia.setText("Restablecer");
        jButtonContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContraseniaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 480, 200, -1));

        jButtonSalir.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 160, 197, -1));

        jLabelImagenFondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImagenRegistro.png"))); // NOI18N
        jLabelImagenFondoRegistro.setText("jLabel10");
        getContentPane().add(jLabelImagenFondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        
        int a = JOptionPane.showConfirmDialog(null,"¿Seguro que desea cerrar la aplicación?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        
        Usuario usuario = new Usuario();
        usuario.setNombre(jTextFieldNombre.getText());
        usuario.setEmail(jTextFieldEmail.getText());
        usuario.setDireccion(jTextFieldDireccion.getText());
        usuario.setTelefono(jTextFieldTelefono.getText());
        usuario.setContrasenia(jPasswordFieldContrasenia.getText());
        usuario.setPregunta(jTextFieldPregunta.getText());
        usuario.setRespuesta(jTextFieldRespuesta.getText());
        usuarioDAO.guardar(usuario);
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
         validarCampos();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldEmailKeyReleased

    private void jTextFieldTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldTelefonoKeyReleased

    private void jTextFieldDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldDireccionKeyReleased

    private void jPasswordFieldContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseniaKeyReleased
        validarCampos();
    }//GEN-LAST:event_jPasswordFieldContraseniaKeyReleased

    private void jTextFieldPreguntaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPreguntaKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldPreguntaKeyReleased

    private void jTextFieldRespuestaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldRespuestaKeyReleased

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jPasswordFieldContraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseniaMouseClicked
        
        String nombre = jTextFieldNombre.getText();
        String email = jTextFieldEmail.getText();
        String telefono = jTextFieldTelefono.getText();
        String direccion = jTextFieldDireccion.getText();
        String mensajeError = "";
                        
        if(!nombre.equals("") && email.matches(emailPatron) && telefono.matches(telefonoPatron) && telefono.length() == 9 && !direccion.equals(""))
            jButtonContrasenia.setEnabled(true);
        else{
            if(!email.matches(emailPatron) && !telefono.matches(telefonoPatron) && telefono.length() != 9){
            mensajeError = " el correo y el teléfono ";
                String mensajeErrorFinal = "<html><b style =\"color:red\">Compruebe que" + mensajeError + "esté bien escrito.</html>";
                JOptionPane.showMessageDialog(null, mensajeErrorFinal, "ERROR", JOptionPane.ERROR_MESSAGE);
                jButtonContrasenia.setEnabled(false);
            } else if (!email.matches(emailPatron)) {
                mensajeError = " el correo ";
                String mensajeErrorFinal = "<html><b style =\"color:red\">Compruebe que" + mensajeError + "esté bien escrito.</html>";
                JOptionPane.showMessageDialog(null, mensajeErrorFinal, "ERROR", JOptionPane.ERROR_MESSAGE);
                jButtonContrasenia.setEnabled(false);
            } else if (!telefono.matches(telefonoPatron) && telefono.length() == 9) {
                mensajeError = " el teléfono ";
                String mensajeErrorFinal = "<html><b style =\"color:red\">Compruebe que" + mensajeError + "esté bien escrito.</html>";
                JOptionPane.showMessageDialog(null, mensajeErrorFinal, "ERROR", JOptionPane.ERROR_MESSAGE);
                jButtonContrasenia.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jPasswordFieldContraseniaMouseClicked

    private void jButtonContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContraseniaActionPerformed
        setVisible(false);
        new RestaurarContrasenia().setVisible(true);
    }//GEN-LAST:event_jButtonContraseniaActionPerformed
    
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
            java.util.logging.Logger.getLogger(GUI_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContrasenia;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImagenFondoRegistro;
    private javax.swing.JPasswordField jPasswordFieldContrasenia;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPregunta;
    private javax.swing.JTextField jTextFieldRespuesta;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
