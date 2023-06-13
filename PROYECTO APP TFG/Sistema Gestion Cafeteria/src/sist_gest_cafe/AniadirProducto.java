/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package sist_gest_cafe;

import DAO.categoriaDAO;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Categoria;
import modelo.Producto;
import DAO.productoDAO;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

/**
 *
 * @author Marcos Maria Sicilia
 */
public class AniadirProducto extends javax.swing.JFrame {
    
    
    //Atributos
    String precioPatron = "^(\\$)?\\d+(\\.\\d{2})?$";

    /** Creates new form AniadirProducto */
    public AniadirProducto() {
        initComponents();
        jButtonGuardar.setEnabled(false);
        jTextFieldPrecio.setText("0.00");
        
    }

    public void validarCampos(){
    
        String nombre = jTextFieldNombre.getText();
        String precio = jTextFieldPrecio.getText();
        if (!nombre.equals("") && precio.matches(precioPatron)) {
            jButtonGuardar.setEnabled(true);
        } else {
            jButtonGuardar.setEnabled(false);
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jTextFieldPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(posicionFrame());
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new product.png"))); // NOI18N
        jLabel1.setText("Nuevo Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 19, -1, -1));

        jButtonSalir.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 102, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setText("Categoria");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 146, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 192, -1, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 99, 400, -1));

        jComboBoxCategoria.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        getContentPane().add(jComboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 146, 400, 25));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0), 3));

        jButtonGuardar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clear.png"))); // NOI18N
        jButtonLimpiar.setText("Limpiar");

        jTextFieldPrecio.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTextFieldPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLimpiar)
                        .addGap(85, 85, 85))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonLimpiar))
                .addGap(123, 123, 123))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioKeyReleased
        validarCampos();
    }//GEN-LAST:event_jTextFieldPrecioKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       
        ArrayList<Categoria> lista = categoriaDAO.getDatos();
        Iterator<Categoria> itr = lista.iterator();
        
        while (itr.hasNext()) {
            Categoria categoriaObj = itr.next();
            jComboBoxCategoria.addItem(categoriaObj.getNombre());
        }
        
    }//GEN-LAST:event_formComponentShown

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        
        Producto producto = new Producto();
        producto.setNombre(jTextFieldNombre.getText());
        producto.setCategoria((String)jComboBoxCategoria.getSelectedItem());
        producto.setPrecio(jTextFieldPrecio.getText());
        productoDAO.guardar(producto);
        setVisible(false);
        new AniadirProducto().setVisible(true);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        setVisible(false);
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
            java.util.logging.Logger.getLogger(AniadirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AniadirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AniadirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AniadirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AniadirProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
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