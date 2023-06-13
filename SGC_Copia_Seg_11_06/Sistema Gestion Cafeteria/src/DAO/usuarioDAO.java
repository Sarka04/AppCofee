/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.swing.JOptionPane;
import modelo.Usuario;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Marcos Maria Sicilia
 */
public class usuarioDAO {

    public static void guardar(Usuario usuario) {

        String consulta = "INSERT INTO usuario"
                + "(nombre,email,telefono,direccion,contrasenia,pregunta,respuesta,estado,admin)"
                + "VALUES "
                + "('" + usuario.getNombre() + "','"
                + usuario.getEmail() + "','"
                + usuario.getTelefono() + "','"
                + usuario.getDireccion() + "','"
                + usuario.getContrasenia() + "','"
                + usuario.getPregunta() + "','"
                + usuario.getRespuesta()
                + "',false,false);";
        DbOperaciones.setDataOrDelete(consulta, "Datos registrados correctamente. [ESPERE RESPUESTA DEL ADMINISTRADOR]");
    }

    public static Usuario login(String email, String contrasenia) {

        Usuario usuario = null;
        try {
            ResultSet rs = DbOperaciones.getData(""
                    + "SELECT * FROM usuario WHERE email LIKE '" + email + "' AND contrasenia LIKE '" + contrasenia + "';");

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setEstado(rs.getString("estado"));
            }

            return usuario;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return usuario;
    }

    public static Usuario getPreguntaSeguridad(String email) {

        Usuario usuario = null;
        try {
            ResultSet rs = DbOperaciones.getData(""
                    + "SELECT * FROM usuario WHERE email LIKE '" + email + "';");

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setPregunta(rs.getString("pregunta"));
                usuario.setRespuesta(rs.getString("respuesta"));
                usuario.setContrasenia(rs.getString("contrasenia"));
            }

            return usuario;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return usuario;
    }

    public static void actualizarGuardado(String email, String contrasenia) {

        String consulta = "UPDATE usuario SET contrasenia = '" + contrasenia + "' WHERE email LIKE '" + email + "';";
        DbOperaciones.setDataOrDelete(consulta, "Contraseña cambiada correcatmente.");
    }

    public static String getEmailAdmin() {
        String email = "";
        try {
            ResultSet rs = DbOperaciones.getData("SELECT email FROM usuario WHERE admin = true;");
            while (rs.next()) {
                email = rs.getString("email");
            }
            return email;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return email;
    }

    public static ArrayList<Usuario> getDatos(String email) {

        ArrayList<Usuario> lista = new ArrayList();
        try {
            ResultSet rs = DbOperaciones.getData("SELECT * FROM usuario WHERE email LIKE '%" + email + "%';");
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setPregunta(rs.getString("pregunta"));
                usuario.setEstado(rs.getString("estado"));
                lista.add(usuario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public static void cambiarEstado(String estado, String email) {

        String consulta = "UPDATE usuario SET estado = '" + estado + "' WHERE email LIKE '" + email + "';";
        DbOperaciones.setDataOrDelete(consulta, "Estado cambiado correcatmente.");
    }

    public static void cambiarContrasenia(String email, String antContra, String nvaContra) {

        try {
            ResultSet rs = DbOperaciones.getData("SELECT * FROM usuario WHERE email = '" + email + "' AND contrasenia = '" + antContra + "';");
            if (rs.next()) {

                actualizarGuardado(email, nvaContra);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void cambiarPregunta(String email, String contrasenia, String nvaPregunta, String nvaRespuesta) {

        try {
            actualizarPregunta(email, contrasenia, nvaPregunta, nvaRespuesta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void actualizarPregunta(String email, String contrasenia, String pregunta, String respuesta) {

        try {
            String consulta = "UPDATE usuario SET pregunta = '" + pregunta + "' ,respuesta = '" + respuesta + "' WHERE email= '" + email + "';";
            DbOperaciones.setDataOrDelete(consulta, "Pregunta cambiada correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static int getAdmin(String email) {
        int admin = 0;
        try {
            ResultSet rs = DbOperaciones.getData("SELECT admin FROM usuario WHERE email LIKE '%" + email + "%';");
            if (rs.next()) {
                admin = rs.getInt("admin");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return admin;
    }
}
