package org.hmonge.app;

import javax.swing.*;
import java.awt.*;

public class Window11OptionDialog extends JFrame {

    Container container;

    public Window11OptionDialog() throws HeadlessException {
        super("Ventana de dialogo de opciones!");

        container = getContentPane();
        container.setLayout(new FlowLayout());

        Object[] options = {"Si OK", "No", "Quisas mas tarde!"};

        int value = JOptionPane.showOptionDialog(
                null,
                "Desea continuar?",
                "Confirmar alguna opcion",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        System.out.println(value);

        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Window11OptionDialog();
    }
}
