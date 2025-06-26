package org.hmonge.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window07CurrencyConverter extends JFrame implements ActionListener {

    Container panel;
    JButton buttonEu, buttonUsd, buttonReset;
    JTextField mount;

    public static final String CURRENCY_DOLLAR = "Dolar";
    public static final String CURRENCY_EUROS = "Euros";

    public Window07CurrencyConverter() throws HeadlessException {
        super("Conversor de Monedas");

        mount = new JTextField(10);

        buttonReset = new JButton("Reset");
        buttonEu = new JButton(CURRENCY_EUROS);
        buttonUsd = new JButton(CURRENCY_DOLLAR);
        buttonEu.addActionListener(this);
        buttonUsd.addActionListener(this);
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mount.setText("");
                panel.setBackground(Color.lightGray);
            }
        });

        panel = getContentPane();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.lightGray);
        panel.add(mount);
        panel.add(buttonEu);
        panel.add(buttonUsd);
        panel.add(buttonReset);

        setVisible(true);
        setSize(500,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Window07CurrencyConverter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Float value = Float.valueOf(mount.getText());
        String textCurreny = e.getActionCommand();

        switch (textCurreny){
            case CURRENCY_DOLLAR:
                value = (float) (value/504.63);
                panel.setBackground(Color.blue);
            break;
            case CURRENCY_EUROS:
                value = (float) (value/579.50);
                panel.setBackground(Color.green);
            break;
        }

        mount.setText(String.valueOf(value));
    }
}
