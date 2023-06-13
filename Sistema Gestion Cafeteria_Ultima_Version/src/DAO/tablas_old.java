/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Maria Sicilia
 */
public class tablas_old {

    public static void main(String[] args) {

                  String tablaUsuario;
        String insertarAdmin;
        String tablaCategoria;
        String tablaProductos;
        String tablaRecibos;

        try {
            tablaUsuario
                    = "CREATE TABLE usuario(id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(200),"
                    + "email VARCHAR(200),"
                    + "telefono VARCHAR(9),"
                    + "direccion VARCHAR(200),"
                    + "contrasenia VARCHAR(200),"
                    + "pregunta VARCHAR(200),"
                    + "respuesta VARCHAR(200),"
                    + "estado VARCHAR(20),"
                    + "admin BOOLEAN,"
                    + "UNIQUE(email));";

            insertarAdmin
                    = "INSERT INTO usuario ("
                    + "nombre, email, telefono,"
                    + " direccion, contrasenia,"
                    + " pregunta, respuesta, estado, admin)"
                    + "VALUES ('admin', 'admin@email.com', '123456789',"
                    + " 'Calle', '1111',"
                    + " '¿Cómo se llama tu perro?', 'Perro', 'activo', 1);";

            tablaCategoria
                    = "CREATE TABLE categoria ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(200))";

            tablaProductos
                    = "CREATE TABLE productos ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(200),"
                    + "categoria VARCHAR(200),"
                    + "precio VARCHAR(200));";

            tablaRecibos
                    = "CREATE TABLE recibo ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(200),"
                    + "telefono VARCHAR(200),"
                    + "email VARCHAR(200),"
                    + "fecha VARCHAR(50),"
                    + "total VARCHAR(200),"
                    + "autor VARCHAR(200));";

            DbOperaciones.setDataOrDelete(tablaUsuario, "Tabla: -usuario- correctamente creada");
            DbOperaciones.setDataOrDelete(insertarAdmin, "Admin: -usuario- correctamente insertado");
            DbOperaciones.setDataOrDelete(tablaCategoria, "Tabla: -categoria- correctamente creada");
            DbOperaciones.setDataOrDelete(tablaProductos, "Tabla: -productos- correctamente creada");
            DbOperaciones.setDataOrDelete(tablaRecibos, "Tabla: -recibos- correctamente creada");
                     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }   
    }
}
