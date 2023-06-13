/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sist_gest_cafe;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Maria Sicilia
 */
public class nuevaConexion extends javax.swing.JFrame {

    /**
     * Creates new form nuevaConexion
     */
    public nuevaConexion() {
        initComponents();
        jButtonGuardar.setEnabled(false);

    }

    private void validarCampos() {
        String nombre = jTextFieldNombre.getText();
        String contrasenia = jTextFieldContra.getText();

        if (!nombre.isEmpty() && !contrasenia.isEmpty()) {
            jButtonGuardar.setEnabled(true); // Activar el botón jButtonGuardar
        } else {
            jButtonGuardar.setEnabled(false); // Desactivar el botón jButtonGuardar
        }
    }

    private void guardarConfiguracion(String nombre, String contrasenia) {
        try {
            File archivoConfig = new File("config.txt");

            // Verificar si el archivo existe
            if (!archivoConfig.exists()) {
                archivoConfig.createNewFile();
            }

            FileWriter fw = new FileWriter(archivoConfig);
            BufferedWriter bw = new BufferedWriter(fw);

            // Escribir los valores en el archivo
            bw.write("usuario=" + nombre);
            bw.newLine();
            bw.write("contrasenia=" + contrasenia);

            // Cerrar el BufferedWriter
            bw.close();
            JOptionPane.showMessageDialog(null, "Configuración guardada exitosamente.");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
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

        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldContra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(posicionFrame());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNombre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 108, 300, -1));

        jTextFieldContra.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTextFieldContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldContraKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 164, 300, -1));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setText("Establecer conexión con la Base de Datos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 23, 480, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setText("Nombre de usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 111, 160, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 167, -1, -1));

        jButtonSalir.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 26, 30, -1));

        jButtonGuardar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 237, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0), 3));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldContraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldContraKeyReleased

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // Acción a realizar cuando se presione el botón jButtonGuardar
        String nombre = jTextFieldNombre.getText();
        String contrasenia = jTextFieldContra.getText();

        // Guardar los valores en el archivo de configuración (config.txt)
        guardarConfiguracion(nombre, contrasenia);

        // Cerrar la ventana nuevaConexion
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar la aplicación?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(nuevaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevaConexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldContra;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

    private Point posicionFrame() {
        int altura = 670;
        int anchura = 400;

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centradoLargo = ((screenSize.height) / 4);
        int centradoAncho = ((screenSize.width) / 4);
        return new Point(centradoAncho, centradoLargo);
    }

}