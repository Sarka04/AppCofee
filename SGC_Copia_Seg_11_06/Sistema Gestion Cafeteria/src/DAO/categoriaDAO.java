/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Categoria;
import java.sql.*;
import modelo.Usuario;

/**
 *
 * @author Marcos Maria Sicilia
 */
public class categoriaDAO {

    public static void guardar(Categoria categoria) {

        String consulta = "INSERT INTO categoria (nombre) VALUES ('" + categoria.getNombre() + "')";
        DbOperaciones.setDataOrDelete(consulta, "Categoria añadida correctamente.");

    }

    public static ArrayList<Categoria> getDatos() {
        ArrayList<Categoria> arrayList = new ArrayList<>();

        try {
            ResultSet rs = DbOperaciones.getData(""
                    + "SELECT * FROM categoria;");

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getString("id"));
                categoria.setNombre(rs.getString("nombre"));
                arrayList.add(categoria);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void borrar(String id, String nombre) {

        String consultaSQLSafeOff
                = "SET SQL_SAFE_UPDATES = 0;";
        DbOperaciones.setDataOrDelete(consultaSQLSafeOff, "SQLSafeDesativado");
        String consulta1
                = "UPDATE productos SET categoria = 'pendiente' WHERE categoria like '" + nombre + "';";
        DbOperaciones.setDataOrDelete(consulta1, "Actualizado correctamente.");
        String consultaSQLSafeOn
                = "SET SQL_SAFE_UPDATES = 1;";
        DbOperaciones.setDataOrDelete(consultaSQLSafeOn, "SQLSafeActivado");
        String consulta2 = "DELETE FROM categoria WHERE id = " + id + ";";
        DbOperaciones.setDataOrDelete(consulta2, "Categoria borrada correctamente.");
        JOptionPane.showMessageDialog(null, "Categoría [" + nombre + "] borrado. Estado = 'pendientes'.");

    }
}
