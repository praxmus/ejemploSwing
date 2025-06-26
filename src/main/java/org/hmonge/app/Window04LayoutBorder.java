package org.hmonge.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window04LayoutBorder extends JFrame {

    public static void main(String[] args) {
        new Window04LayoutBorder();
    }

    public Window04LayoutBorder(){
        super("Ejemplo de Boton y Eventos");

        JPanel panel = new JPanel(new BorderLayout(8,4));

        JButton button = new JButton("Aceptar");
        button.addActionListener(new ButtonClickListener());

        button.setSize(100,50); // para darle tamaño al boton
        panel.add(button, BorderLayout.CENTER);
        panel.add(new JButton("North"), BorderLayout.NORTH);
        panel.add(new JButton("South"), BorderLayout.SOUTH);
        panel.add(new JButton("West"), BorderLayout.WEST);
        panel.add(new JButton("East"), BorderLayout.EAST);

        setContentPane(panel);

        setSize(600,200); // para darle tamaño al frame
        setVisible(true); // para que el frame se haga visible
        setDefaultCloseOperation(EXIT_ON_CLOSE); // para que al cerrar libere la memoria
    }

    static class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("Boton pulsado 3!");
            //Toolkit.getDefaultToolkit().beep(); // ejecuta un sonido al presionar el boton
        }
    }
}
