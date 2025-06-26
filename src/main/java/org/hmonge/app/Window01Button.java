package org.hmonge.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window01Button extends JFrame {

    public static void main(String[] args) {
        new Window01Button();
    }

    public Window01Button(){
        super("Ejemplo de Boton y Eventos");

        JButton button = new JButton("Aceptar");
        button.setSize(100,50); // para darle tamaño al boton
        //button.addActionListener(this);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boton pulsado 2!");
            }
        });
        button.addActionListener(new ButtonClickListener());

        getContentPane().add(button); //agregar el boton al frame
        setSize(200,100); // para darle tamaño al frame
        setVisible(true); // para que el frame se haga visible
        setDefaultCloseOperation(EXIT_ON_CLOSE); // para que al cerrar libere la memoria
    }

    static class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("Boton pulsado 3!");
            Toolkit.getDefaultToolkit().beep(); // ejecuta un sonido al presionar el boton
        }
    }

    /*
    @Override
    public void actionPerformed(ActionEvent e) { //metodo que ejecuta una accion
        System.out.println("Boton pulsado 1!");
    }
    */
}
