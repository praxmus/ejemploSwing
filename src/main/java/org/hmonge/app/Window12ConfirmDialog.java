package org.hmonge.app;

import javax.swing.*;
import java.awt.*;

public class Window12ConfirmDialog extends JFrame {

    Container panel;

    public Window12ConfirmDialog() throws HeadlessException {
        super("Confirmar antes de ejecutar una tarea.");

        panel = getContentPane();
        panel.setLayout(new FlowLayout());

        JPanel formPanel = new JPanel(new GridLayout(4,2,4,4));

        JLabel name = new JLabel("Nombre: ", JLabel.RIGHT);
        JTextField nameField = new JTextField();
        formPanel.add(name);
        formPanel.add(nameField);

        JLabel lastName = new JLabel("Apellido: ", JLabel.RIGHT);
        JTextField lastNameField = new JTextField();
        formPanel.add(lastName);
        formPanel.add(lastNameField);

        JLabel taxNumber = new JLabel("Rut: ", JLabel.RIGHT);
        JTextField taxNumberField = new JTextField();
        formPanel.add(taxNumber);
        formPanel.add(taxNumberField);

        JRadioButton morning = new JRadioButton("Grupo mañana", true);
        JRadioButton afternoon = new JRadioButton("Grupo tarde");
        formPanel.add(morning);
        formPanel.add(afternoon);

        int option = JOptionPane.showConfirmDialog(
                this,
                formPanel,
                "Introduzca los datos",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        System.out.println(option);

        if (option == JOptionPane.OK_OPTION){
            System.out.println("Se ha seleccionado OK");
            JOptionPane.showMessageDialog(
                    this,
                    "Ejecutado con exito!",
                    "Alerta",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else if (option == JOptionPane.CANCEL_OPTION){
            System.out.println("Se ha seleccionado cancelar");
            JOptionPane.showMessageDialog(
                    this,
                    "Ejecutado con error!",
                    "Alerta",
                    JOptionPane.ERROR_MESSAGE
            );
        }

        //setVisible(true);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Window12ConfirmDialog();
    }
}
