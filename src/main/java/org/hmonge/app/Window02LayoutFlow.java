package org.hmonge.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window02LayoutFlow extends JFrame {

    public static void main(String[] args) {
        new Window02LayoutFlow();
    }

    public Window02LayoutFlow(){
        super("Ejemplo de Boton y Eventos");

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));

        for (int i = 0; i <= 10; i++){
            JButton button = new JButton("Aceptar".concat(String.valueOf(i)));
            button.addActionListener(new ButtonClickListener());

            // button.setSize(100,50); // para darle tamaño al boton
            button.setPreferredSize(new Dimension(200,100));
            panel.add(button); //agregar el boton al frame
        }

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
