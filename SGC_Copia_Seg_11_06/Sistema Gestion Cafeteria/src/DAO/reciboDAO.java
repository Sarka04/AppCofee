/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import modelo.Producto;
import modelo.Recibo;

/**
 *
 * @author Marcos Maria Sicilia
 */
public class reciboDAO {
    
    public static String getId() {
        int id = 1;

        try {
            ResultSet rs = DbOperaciones.getData("SELECT max(id) FROM recibo;"); // Consulta para obtener el ID máximo de los recibos

            if (rs.next()) {           
                id = rs.getInt(1); // Obtener el valor del ID máximo
                id++; // Incrementar el ID en 1 para el nuevo recibo
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e); // Mostrar mensaje de error en caso de excepción
        }

        return String.valueOf(id); // Devolver el ID como una cadena
    }
    
    public static void guardar(Recibo recibo){
    
        String consulta = "INSERT INTO recibo VALUES('" + recibo.getId() + "','" 
                + recibo.getNombre() + "','"
                + recibo.getTelefono() + "','"
                + recibo.getEmail() + "','"
                + recibo.getFecha() + "','"
                + recibo.getTotal() + "','"
                + recibo.getAutor() + "');";
        DbOperaciones.setDataOrDelete(consulta, "Recibo añadido correctamente");    
    }
    
    public static ArrayList<Recibo> getDatosPorInc(String fecha){
    
        ArrayList<Recibo> lista = new ArrayList<>();
        try {
            ResultSet rs = DbOperaciones.getData("SELECT * FROM recibo WHERE fecha LIKE '%" + fecha + "%';"); // Consulta para obtener el ID máximo de los recibos
            while(rs.next()){
                
                Recibo recibo = new Recibo();
                recibo.setId(rs.getInt("id"));
                recibo.setNombre(rs.getString("nombre"));
                recibo.setTelefono(rs.getString("telefono"));
                recibo.setEmail(rs.getString("email"));
                recibo.setFecha(rs.getString("fecha"));
                recibo.setTotal(rs.getString("total"));
                recibo.setAutor(rs.getString("autor"));
                lista.add(recibo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e); // Mostrar mensaje de error en caso de excepción
        }
        
        return lista;
    }
    
        public static ArrayList<Recibo> getDatosPorDesc(String fecha){
    
        ArrayList<Recibo> lista = new ArrayList<>();
        try {
            ResultSet rs = DbOperaciones.getData("SELECT * FROM recibo WHERE fecha LIKE '%" + fecha + "%' ORDER BY id DESC;"); // Consulta para obtener el ID máximo de los recibos
            while(rs.next()){
                
                Recibo recibo = new Recibo();
                recibo.setId(rs.getInt("id"));
                recibo.setNombre(rs.getString("nombre"));
                recibo.setTelefono(rs.getString("telefono"));
                recibo.setEmail(rs.getString("email"));
                recibo.setFecha(rs.getString("fecha"));
                recibo.setTotal(rs.getString("total"));
                recibo.setAutor(rs.getString("autor"));
                lista.add(recibo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e); // Mostrar mensaje de error en caso de excepción
        }
        
        return lista;
    }
}
