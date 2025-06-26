package org.hmonge.app;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloWorldWindow {
    public static void main(String[] args) {
        createAndShowWindow();
    }

    public static void createAndShowWindow(){

        JFrame.setDefaultLookAndFeelDecorated(true); // para asignar una decoracion al frame
        JFrame frame = new JFrame("Hola Mundo Swing!");
        JLabel text = new JLabel("Hola Mundo!");

        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("Cerrando ventana con exito!");
                System.exit(0);
            }
        });
        frame.getContentPane().add(text); // para agregar el label al frame
        frame.setVisible(true); // para que el frame se haga visible
        frame.pack(); // para que se ajusta al contenido
    }
}