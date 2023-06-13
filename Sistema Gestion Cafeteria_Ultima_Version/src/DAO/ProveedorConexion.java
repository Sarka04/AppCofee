/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import sist_gest_cafe.nuevaConexion;

/**
 *
 * @author Marcos Maria Sicilia
 */
public class ProveedorConexion {

    private static boolean nuevaConexionMostrada = false;

    public static Connection getCon() throws FileNotFoundException {
        String usuario = leerArchivoConfig("usuario");
        String contrasenia = leerArchivoConfig("contrasenia");

        if (usuario != null && contrasenia != null) {
            String url = "jdbc:mysql://localhost:3306/";
            String baseDatos = "cms";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, usuario, contrasenia);

                // Verificar si la base de datos existe, si no, crearla
                if (!existeBaseDatos(con, baseDatos)) {
                    crearBaseDatos(con, baseDatos);
                }

                // Conectarse a la base de datos CMS
                con = DriverManager.getConnection(url + baseDatos + "?useSSL=false", usuario, contrasenia);

                return con;
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al establecer la conexión con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);

                // Eliminar el archivo de configuración si los valores de usuario o contraseña son incorrectos
                borrarArchivoConfig();

                return null;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cargar el controlador de la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } else {
            if (leerArchivoConfig("usuario") == null && leerArchivoConfig("contrasenia") == null && !nuevaConexionMostrada ) {
                nuevaConexionMostrada = true;
                new nuevaConexion().setVisible(true);
            }
        }
        return null;
    }

    private static void borrarArchivoConfig() {
        File archivoConfig = new File("config.txt");
        if (archivoConfig.exists()) {
            archivoConfig.delete();
        }
        new nuevaConexion().setVisible(true);
    }

    private static String leerArchivoConfig(String clave) throws FileNotFoundException {
        File archivoConfig = new File("config.txt");
        if (archivoConfig.exists()) {
            Scanner scanner = new Scanner(archivoConfig);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                if (linea.startsWith(clave + "=")) {
                    return linea.substring(clave.length() + 1);
                }
            }
            scanner.close();
        }
        return null;
    }

    //Verificar que existe la BBDD
    public static boolean existeBaseDatos(Connection con, String baseDatos) {
        try {
            DatabaseMetaData meta = con.getMetaData();
            ResultSet rs = meta.getCatalogs();
            while (rs.next()) {
                String bd = rs.getString(1);
                if (bd.equalsIgnoreCase(baseDatos)) {
                    return true;
                }
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

// Crear la base de datos
    public static void crearBaseDatos(Connection con, String baseDatos) {
        try {
            Statement stmt = con.createStatement();
            String crearBBDD = "CREATE DATABASE " + baseDatos;
            stmt.executeUpdate(crearBBDD);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
