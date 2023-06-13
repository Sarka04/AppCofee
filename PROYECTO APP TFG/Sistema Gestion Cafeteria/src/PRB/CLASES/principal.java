/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRB.CLASES;

/**
 *
 * @author Marcos Maria Sicilia
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class principal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Crear el marco principal
        JFrame frame = new JFrame("Ejemplo JFrame con Buttons personalizados");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Crear los botones personalizados con diferentes colores
        Button button1 = new Button();
        button1.setText("Botón 1");
        button1.setColor1(Color.RED);
        button1.setColor2(Color.YELLOW);
        button1.setColor3(Color.ORANGE);
        frame.getContentPane().add(button1);

        Button button2 = new Button();
        button2.setText("Botón 2");
        button2.setColor1(Color.BLUE);
        button2.setColor2(Color.GREEN);
        button2.setColor3(Color.CYAN);
        frame.getContentPane().add(button2);

        Button button3 = new Button();
        button3.setText("Botón 3");
        button3.setColor1(Color.MAGENTA);
        button3.setColor2(Color.PINK);
        button3.setColor3(Color.WHITE);
        frame.getContentPane().add(button3);

        // Agregar funcionalidad a los botones
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "¡Haz hecho clic en el Botón 1!");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "¡Haz hecho clic en el Botón 2!");
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "¡Haz hecho clic en el Botón 3!");
            }
        });

        // Mostrar el marco
        frame.setVisible(true);
    }
}

