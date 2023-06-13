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

/**
 *
 * @Marcos Sicilia
 */
public class Principal extends javax.swing.JFrame {

    //Atributos
    public String email;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
            
    }
           
        public Principal(String emailUsuario) {
        initComponents();
              
        email = emailUsuario;
        if(!email.equals(usuarioDAO.getEmailAdmin())){
        
            jButtonCategoria.setVisible(false);
            jButtonProductoNuevo.setVisible(false);
            jButtonProductos.setVisible(false);
            jButtonUsuario.setVisible(false);   
            jLabelUsuario.setText("EMPLEADO");
        
        }else            
            jLabelUsuario.setText("ADMINISTRADOR");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSesionCerrar = new javax.swing.JButton();
        jButtonPedido = new javax.swing.JButton();
        jButtonRestaurar = new javax.swing.JButton();
        jButtonCambiarRespuesta = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonCategoria = new javax.swing.JButton();
        jButtonProductoNuevo = new javax.swing.JButton();
        jButtonProductos = new javax.swing.JButton();
        jButtonUsuario = new javax.swing.JButton();
        jButtonVerRecibos = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSesionCerrar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonSesionCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        jButtonSesionCerrar.setText("Cerrar Sesión");
        jButtonSesionCerrar.setPreferredSize(new java.awt.Dimension(200, 33));
        jButtonSesionCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesionCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSesionCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 300, -1));

        jButtonPedido.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/place order.png"))); // NOI18N
        jButtonPedido.setText("Hacer Pedido");
        jButtonPedido.setPreferredSize(new java.awt.Dimension(200, 33));
        jButtonPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 390, 300, -1));

        jButtonRestaurar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/change Password.png"))); // NOI18N
        jButtonRestaurar.setText("Restaurar Contraseña");
        jButtonRestaurar.setPreferredSize(new java.awt.Dimension(200, 33));
        jButtonRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaurarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 570, 300, -1));

        jButtonCambiarRespuesta.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonCambiarRespuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/change Security Question.png"))); // NOI18N
        jButtonCambiarRespuesta.setText("Rest. Preg/Respuesta");
        jButtonCambiarRespuesta.setPreferredSize(new java.awt.Dimension(200, 33));
        jButtonCambiarRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarRespuestaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCambiarRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 630, 300, -1));

        jButtonSalir.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setPreferredSize(new java.awt.Dimension(200, 33));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, 300, -1));

        jButtonCategoria.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/category.png"))); // NOI18N
        jButtonCategoria.setText("Nueva Categoría");
        jButtonCategoria.setPreferredSize(new java.awt.Dimension(200, 33));
        jButtonCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 270, -1));

        jButtonProductoNuevo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonProductoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new product.png"))); // NOI18N
        jButtonProductoNuevo.setText("Nuevo Producto");
        jButtonProductoNuevo.setPreferredSize(new java.awt.Dimension(200, 33));
        jButtonProductoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductoNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProductoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, 270, -1));

        jButtonProductos.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/view edit delete product.png"))); // NOI18N
        jButtonProductos.setText("Productos");
        jButtonProductos.setPreferredSize(new java.awt.Dimension(200, 33));
        jButtonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 640, 270, -1));

        jButtonUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verify users.png"))); // NOI18N
        jButtonUsuario.setText("Verificar Usuario");
        jButtonUsuario.setPreferredSize(new java.awt.Dimension(200, 33));
        jButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, 270, -1));

        jButtonVerRecibos.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jButtonVerRecibos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/View Bills & Order Placed Details.png"))); // NOI18N
        jButtonVerRecibos.setText("Visualizar Pedidos y Recibos");
        jButtonVerRecibos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerRecibosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerRecibos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 450, 440, -1));

        jLabelUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1077114.png"))); // NOI18N
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 640, 260));

        jLabelImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImagenRegistro3.png"))); // NOI18N
        jLabelImagenFondo.setText("jLabel1");
        getContentPane().add(jLabelImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSesionCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesionCerrarActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"¿Seguro que desea cerrar sesión?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
            if(a == 0){
                setVisible(false);
                new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButtonSesionCerrarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"¿Seguro que desea cerrar la aplicación?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
            if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCategoriaActionPerformed
        new NuevaCategoria().setVisible(true);
    }//GEN-LAST:event_jButtonCategoriaActionPerformed

    private void jButtonProductoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductoNuevoActionPerformed
        new AniadirProducto().setVisible(true);
    }//GEN-LAST:event_jButtonProductoNuevoActionPerformed

    private void jButtonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductosActionPerformed
        new Productos().setVisible(true);
    }//GEN-LAST:event_jButtonProductosActionPerformed

    private void jButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioActionPerformed
        new verificarUsuario(email).setVisible(true);
    }//GEN-LAST:event_jButtonUsuarioActionPerformed

    private void jButtonPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidoActionPerformed
        new hacerPedido(email).setVisible(true);
    }//GEN-LAST:event_jButtonPedidoActionPerformed

    private void jButtonVerRecibosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerRecibosActionPerformed
        new verReciboPedidoDetalles().setVisible(true);
    }//GEN-LAST:event_jButtonVerRecibosActionPerformed

    private void jButtonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaurarActionPerformed
        new nuevaContrasenia(email).setVisible(true);
    }//GEN-LAST:event_jButtonRestaurarActionPerformed

    private void jButtonCambiarRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarRespuestaActionPerformed
        new nuevaPregunta(email).setVisible(true);
    }//GEN-LAST:event_jButtonCambiarRespuestaActionPerformed

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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCambiarRespuesta;
    private javax.swing.JButton jButtonCategoria;
    private javax.swing.JButton jButtonPedido;
    private javax.swing.JButton jButtonProductoNuevo;
    private javax.swing.JButton jButtonProductos;
    private javax.swing.JButton jButtonRestaurar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSesionCerrar;
    private javax.swing.JButton jButtonUsuario;
    private javax.swing.JButton jButtonVerRecibos;
    private javax.swing.JLabel jLabelImagenFondo;
    private javax.swing.JLabel jLabelUsuario;
    // End of variables declaration//GEN-END:variables
}
