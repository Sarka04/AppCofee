/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Maria Sicilia
 */
public class tablas {

    String BBDD;
    String tablaUsuario;
    String insertarAdmin;
    String tablaCategoria;
    String tablaProductos;
    String tablaRecibos;

    public boolean verificarConexion() {

        boolean condicion = false;
        try {

            //String crearBBDD = "CREATE DATABASE IF NOT EXISTS cms;";
            String usarBBDD = "USE cms;";

            // Crear la base de datos si no existe
            //DbOperaciones.setDataOrDelete(crearBBDD, "Base de datos: -cms- creada correctamente");

            // Establecer la conexión a la base de datos
            DbOperaciones.setDataOrDelete(usarBBDD, "Conexión: -cms- establecida correctamente");

            condicion = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return condicion;
    }

    public void createtablaUsuario() {

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

            DbOperaciones.setDataOrDelete(tablaUsuario, "Tabla: -usuario- correctamente creada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createtablaCategoria() {

        try {

            tablaCategoria
                    = "CREATE TABLE categoria ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(200))";

            DbOperaciones.setDataOrDelete(tablaCategoria, "Tabla: -categoria- correctamente creada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createtablaProductos() {

        try {

            tablaProductos
                    = "CREATE TABLE productos ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(200),"
                    + "categoria VARCHAR(200),"
                    + "precio VARCHAR(200));";

            DbOperaciones.setDataOrDelete(tablaProductos, "Tabla: -productos- correctamente creada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createtablaRecibos() {

        try {
            tablaRecibos
                    = "CREATE TABLE recibo ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(200),"
                    + "telefono VARCHAR(200),"
                    + "email VARCHAR(200),"
                    + "fecha VARCHAR(50),"
                    + "total VARCHAR(200),"
                    + "autor VARCHAR(200));";

            DbOperaciones.setDataOrDelete(tablaRecibos, "Tabla: -recibos- correctamente creada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createInsertarAdmin() {

        try {

            insertarAdmin
                    = "INSERT INTO usuario ("
                    + "nombre, email, telefono,"
                    + " direccion, contrasenia,"
                    + " pregunta, respuesta, estado, admin)"
                    + "VALUES ('admin', 'admin@email.com', '123456789',"
                    + " 'Calle', '1111',"
                    + " '¿Cómo se llama tu perro?', 'Perro', 'activo', 1);";

            DbOperaciones.setDataOrDelete(insertarAdmin, "Admin: -usuario- correctamente insertado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createInsertarCategorias() {

        try {
            
            List<Map<String, String>> categorias = new ArrayList<>();
            
            categorias.add( createCategoria("Café"));
            categorias.add( createCategoria("Té"));
            categorias.add( createCategoria("Bebidas frías"));
            categorias.add( createCategoria("Pasteles"));
            categorias.add( createCategoria("Bocadillos"));
            categorias.add( createCategoria("Zumos"));
            categorias.add( createCategoria("Desayunos"));
            categorias.add( createCategoria("Ensaladas"));
            categorias.add( createCategoria("Helados"));
            categorias.add( createCategoria("Smoothies"));
            categorias.add( createCategoria("Batidos"));
            categorias.add( createCategoria("Pizzas"));
            categorias.add( createCategoria("Snacks"));
            categorias.add( createCategoria("Postres"));

            // Itera sobre la lista y realiza las inserciones
            for (Map<String, String> categoria : categorias) {
                String nombre = categoria.get("nombre");

                String insertarCategoria = "INSERT INTO categoria (nombre) VALUES ('" + nombre + "')";
                DbOperaciones.setDataOrDelete(insertarCategoria, "Categoria: '" + nombre + "' insertado correctamente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createInsertarProductos() {

        try {

            List<Map<String, String>> productos = new ArrayList<>();

            // Agrega los productos a la lista
            //Café
            productos.add(createProducto("Espresso", "Café", "1.80"));
            productos.add(createProducto("Cappuccino", "Café", "3.00"));
            productos.add(createProducto("Mocha", "Café", "3.20"));
            productos.add(createProducto("Café americano", "Café", "2.00"));
            productos.add(createProducto("Café descafeinado", "Café", "2.20"));
            productos.add(createProducto("Café cortado", "Café", "2.50"));
            productos.add(createProducto("Café con hielo", "Café", "2.80"));
            productos.add(createProducto("Café irlandés", "Café", "4.00"));

            // Té
            productos.add(createProducto("Té verde", "Té", "2.20"));
            productos.add(createProducto("Té negro", "Té", "2.00"));
            productos.add(createProducto("Té de frutas", "Té", "2.50"));
            productos.add(createProducto("Té de hierbas", "Té", "2.50"));
            productos.add(createProducto("Té blanco", "Té", "2.80"));
            productos.add(createProducto("Té rooibos", "Té", "2.20"));

            // Bebidas frías
            productos.add(createProducto("Limonada", "Bebidas frías", "2.50"));
            productos.add(createProducto("Refresco de cola", "Bebidas frías", "2.20"));
            productos.add(createProducto("Agua mineral", "Bebidas frías", "1.50"));
            productos.add(createProducto("Zumo de frutas", "Bebidas frías", "2.80"));
            productos.add(createProducto("Cerveza", "Bebidas frías", "3.00"));
            productos.add(createProducto("Batido de chocolate", "Bebidas frías", "3.50"));
            productos.add(createProducto("Agua con gas", "Bebidas frías", "1.80"));
            productos.add(createProducto("Agua saborizada", "Bebidas frías", "2.50"));

            // Pasteles
            productos.add(createProducto("Tarta de chocolate", "Pasteles", "3.50"));
            productos.add(createProducto("Pastel de zanahoria", "Pasteles", "3.80"));
            productos.add(createProducto("Cheesecake", "Pasteles", "3.20"));
            productos.add(createProducto("Tarta de manzana", "Pasteles", "3.50"));
            productos.add(createProducto("Cupcake", "Pasteles", "2.00"));
            productos.add(createProducto("Brownie", "Pasteles", "2.50"));
            productos.add(createProducto("Tarta de fresa", "Pasteles", "3.00"));
            productos.add(createProducto("Tiramisú", "Pasteles", "3.80"));

            // Bocadillos
            productos.add(createProducto("Bocadillo de jamón y queso", "Bocadillos", "4.50"));
            productos.add(createProducto("Bocadillo de pollo", "Bocadillos", "4.20"));
            productos.add(createProducto("Bocadillo vegetal", "Bocadillos", "4.00"));
            productos.add(createProducto("Bocadillo de atún", "Bocadillos", "4.20"));
            productos.add(createProducto("Bocadillo de lomo", "Bocadillos", "4.50"));
            productos.add(createProducto("Bocadillo de bacon", "Bocadillos", "4.00"));
            productos.add(createProducto("Bocadillo de chorizo", "Bocadillos", "4.00"));
            productos.add(createProducto("Bocadillo de salmón", "Bocadillos", "4.50"));

            // Zumos
            productos.add(createProducto("Zumo de naranja", "Zumos", "2.80"));
            productos.add(createProducto("Zumo de limón", "Zumos", "2.50"));
            productos.add(createProducto("Zumo de manzana", "Zumos", "2.50"));
            productos.add(createProducto("Zumo de piña", "Zumos", "2.80"));
            productos.add(createProducto("Zumo de melocotón", "Zumos", "2.50"));
            productos.add(createProducto("Zumo de uva", "Zumos", "2.50"));
            productos.add(createProducto("Zumo de mango", "Zumos", "2.80"));
            productos.add(createProducto("Zumo de fresa", "Zumos", "2.50"));

            // Desayunos
            productos.add(createProducto("Desayuno continental", "Desayunos", "6.50"));
            productos.add(createProducto("Tostadas con mermelada", "Desayunos", "4.80"));
            productos.add(createProducto("Croissant", "Desayunos", "3.00"));
            productos.add(createProducto("Yogur con frutas", "Desayunos", "3.50"));
            productos.add(createProducto("Bollería variada", "Desayunos", "5.00"));
            productos.add(createProducto("Huevos revueltos", "Desayunos", "5.50"));
            productos.add(createProducto("Batido de frutas", "Desayunos", "4.50"));
            productos.add(createProducto("Tostadas con aguacate", "Desayunos", "5.00"));

            // Ensaladas
            productos.add(createProducto("Ensalada César", "Ensaladas", "7.50"));
            productos.add(createProducto("Ensalada de quinoa", "Ensaladas", "6.80"));
            productos.add(createProducto("Ensalada Caprese", "Ensaladas", "6.50"));
            productos.add(createProducto("Ensalada de pollo", "Ensaladas", "7.00"));
            productos.add(createProducto("Ensalada mixta", "Ensaladas", "6.00"));
            productos.add(createProducto("Ensalada de aguacate", "Ensaladas", "6.50"));
            productos.add(createProducto("Ensalada griega", "Ensaladas", "7.00"));
            productos.add(createProducto("Ensalada de salmón", "Ensaladas", "8.00"));

            // Sandwiches
            productos.add(createProducto("Sandwich de jamón y queso", "Sandwiches", "5.50"));
            productos.add(createProducto("Sandwich vegetal", "Sandwiches", "5.00"));
            productos.add(createProducto("Sandwich de pollo", "Sandwiches", "5.50"));
            productos.add(createProducto("Sandwich de atún", "Sandwiches", "5.50"));
            productos.add(createProducto("Sandwich mixto", "Sandwiches", "4.80"));
            productos.add(createProducto("Sandwich de pavo", "Sandwiches", "5.00"));
            productos.add(createProducto("Sandwich de salmón", "Sandwiches", "6.00"));
            productos.add(createProducto("Sandwich de roast beef", "Sandwiches", "6.50"));

            // Postres
            productos.add(createProducto("Helado de vainilla", "Postres", "3.50"));
            productos.add(createProducto("Tarta de manzana", "Postres", "4.00"));
            productos.add(createProducto("Flan", "Postres", "3.20"));
            productos.add(createProducto("Mousse de chocolate", "Postres", "4.50"));
            productos.add(createProducto("Natillas", "Postres", "3.00"));
            productos.add(createProducto("Cheesecake de fresa", "Postres", "4.50"));
            productos.add(createProducto("Brownie con helado", "Postres", "4.80"));
            productos.add(createProducto("Crema catalana", "Postres", "3.50"));

            // Itera sobre la lista y realiza las inserciones
            for (Map<String, String> producto : productos) {
                String nombre = producto.get("nombre");
                String categoria = producto.get("categoria");
                String precio = producto.get("precio");

                String insertarProducto = "INSERT INTO productos (nombre, categoria, precio) VALUES ('" + nombre + "', '" + categoria + "', '" + precio + "')";
                DbOperaciones.setDataOrDelete(insertarProducto, "Producto: '" + nombre + "' insertado correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

// Función auxiliar para crear un diccionario de producto
    private Map<String, String> createCategoria(String nombre) {
        Map<String, String> categoria = new HashMap<>();
        categoria.put("nombre", nombre);
        return categoria;
    }

// Función auxiliar para crear un diccionario de producto
    private Map<String, String> createProducto(String nombre, String categoria, String precio) {
        Map<String, String> producto = new HashMap<>();
        producto.put("nombre", nombre);
        producto.put("categoria", categoria);
        producto.put("precio", precio);
        return producto;
    }
}
