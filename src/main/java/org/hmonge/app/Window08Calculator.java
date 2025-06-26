package org.hmonge.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window08Calculator extends JFrame implements ActionListener {

    Container container;
    JTextField numberA, numberB, result;

    public static final String CALCULATOR_ADD = "Suma";
    public static final String CALCULATOR_SUBTRACTION = "Resta";
    public static final String CALCULATOR_MULTIPLY = "Multiplica";
    public static final String CALCULATOR_DIVIDE = "Divide";
    public static final String CALCULATOR_CLOSE = "Salir";

    public Window08Calculator() throws HeadlessException {
        super("Ejemplo Calculadora");

        container = getContentPane();
        container.setLayout(new BorderLayout());

        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);

        JMenu menu = new JMenu("Operaciones");
        JMenu closeMenu = new JMenu("Cerrar");

        JMenuItem itemAdd = new JMenuItem(CALCULATOR_ADD);
        JMenuItem itemSubstrac = new JMenuItem(CALCULATOR_SUBTRACTION);
        JMenuItem itemDivide = new JMenuItem(CALCULATOR_DIVIDE);
        JMenuItem itemMultiply = new JMenuItem(CALCULATOR_MULTIPLY);
        JMenuItem itemClose = new JMenuItem(CALCULATOR_CLOSE);

        menu.add(itemAdd);
        menu.add(itemSubstrac);
        menu.add(itemDivide);
        menu.add(itemMultiply);
        closeMenu.add(itemClose);

        bar.add(menu);
        bar.add(closeMenu);

        JPanel panel = new JPanel();

        panel.add(new JLabel("Numero 1"));
        panel.add(numberA = new JTextField(3));
        panel.add(new JLabel("Numero 2"));
        panel.add(numberB = new JTextField(3));
        panel.add(new JLabel("Resultado"));
        panel.add(result = new JTextField(5));
        result.setEditable(false);
        result.setBackground(Color.white);

        container.add(panel, BorderLayout.CENTER);

        itemAdd.addActionListener(this);
        itemSubstrac.addActionListener(this);
        itemDivide.addActionListener(this);
        itemMultiply.addActionListener(this);

        itemClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
        //setSize(500,200);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Window08Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String operation = e.getActionCommand();
        int a = Integer.parseInt(numberA.getText().trim());
        int b = Integer.parseInt(numberB.getText().trim());
        int resultado = 0;

        switch (operation){
            case CALCULATOR_ADD:
                resultado = a + b;
            break;
            case CALCULATOR_SUBTRACTION:
                resultado = a - b;
            break;
            case CALCULATOR_DIVIDE:
                if (b == 0){
                    JOptionPane.showMessageDialog(null, "No se puede dividir en cero, infinito!","Error de entrada", JOptionPane.ERROR_MESSAGE);
                    //throw new ArithmeticException("No se puede dividir en cero, infinito");
                }
                resultado = a / b;
            break;
            case CALCULATOR_MULTIPLY:
                resultado = a * b;
            break;
        }

        result.setText(String.valueOf(resultado));
    }
}
