/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comun;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Maria Sicilia
 */
public class openPDF {

    public static void abrirPorId(String nombreArchivo) {

        try {
            //String rutaEscritorio = System.getProperty("user.home") + File.separator + "Desktop"; // Obtener la ruta del escritorio
            String ruta = "pdfs";
            String rutaArchivo = ruta + "/" + nombreArchivo + ".pdf"; // Ruta del archivo PDF

            File archivo = new File(rutaArchivo);

            //File archivo = new File(rutaArchivo); // Crear objeto File para el archivo
            if (archivo.exists()) { // Verificar si el archivo existe
                Desktop.getDesktop().open(archivo); // Abrir el archivo PDF con la aplicación predeterminada
            } else {
                JOptionPane.showMessageDialog(null, "El archivo PDF '" + nombreArchivo + ".pdf' no existe en el escritorio.Ruta: " + rutaArchivo); // El archivo no existe
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
