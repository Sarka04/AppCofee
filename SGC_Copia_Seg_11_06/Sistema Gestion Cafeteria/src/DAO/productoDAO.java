/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.util.ArrayList;
import modelo.Producto;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Maria Sicilia
 */
public class productoDAO {
    
    public static void guardar(Producto producto){
    
    String consulta = 
            "INSERT INTO productos (nombre,categoria,precio)"
            + "VALUES ('" + producto.getNombre() + "','" + producto.getCategoria() + "','" + producto.getPrecio() + "');";
            DbOperaciones.setDataOrDelete(consulta, "Producto insertado correctamente.");
    }
    
    public static ArrayList<Producto> getDatos(){
    
        ArrayList<Producto> lista = new ArrayList<>();
        try{
            ResultSet rs = DbOperaciones.getData(""
                    + "SELECT * FROM productos;");
            
            while(rs.next()){          
                Producto producto = new Producto();
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecio(rs.getString("precio"));
                
                lista.add(producto);
            }
            
            return lista;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }
    
    public static void actualizar(Producto producto){
    
        String consulta =
                "UPDATE productos SET nombre ='" + producto.getNombre() + "',"
                + "categoria ='" + producto.getCategoria() + "',"
                + "precio ='" + producto.getPrecio() + "'"
                + "WHERE id ='" + producto.getId() + "';";
        DbOperaciones.setDataOrDelete(consulta, "Producto actualizado correctamente.");
    }
    
    public static void borrar(String id){
    
        String consulta = "DELETE FROM productos WHERE id = " + id + ";";
        DbOperaciones.setDataOrDelete(consulta, "Producto borrado correctamente.");
    }
    
    public static ArrayList<Producto> getDatosPorCategoria(String categoria){
    
        ArrayList<Producto> lista = new ArrayList();
        try{
        ResultSet rs = DbOperaciones.getData(""
                + "SELECT * FROM productos WHERE categoria = '" + categoria + "';");

           while(rs.next()){
           
               Producto producto = new Producto();
               producto.setNombre(rs.getString("nombre"));
               lista.add(producto);
           } 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;
    }
             
    public static ArrayList<Producto> filtroProductoPorNombre(String nombre, String categoria){

    ArrayList<Producto> lista = new ArrayList();
    try{
    ResultSet rs = DbOperaciones.getData(""
            + "SELECT * FROM productos WHERE nombre LIKE '%" + nombre + "%' AND categoria =  '" + categoria + "';");

           while(rs.next()){
           
               Producto producto = new Producto();
               producto.setNombre(rs.getString("nombre"));
               lista.add(producto);
           } 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;
    }
        
    public static Producto getProductoPorNombre(String nombre){
    
        Producto producto = new Producto();
        try{
        ResultSet rs = DbOperaciones.getData(""
                + "SELECT * FROM productos WHERE nombre = '" + nombre + "';");

           while(rs.next()){
       
               producto.setNombre(rs.getString(2));
               producto.setCategoria(rs.getString(3));
               producto.setPrecio(rs.getString(4));
           } 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return producto;
    }
}
