package org.hmonge.app;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

public class Window13TableModel extends JFrame {

    public Window13TableModel() throws HeadlessException {
        super("Tabla con registros o grilla.");

        JTable table = new JTable(new UserTableModel());

        JScrollPane scroll = new JScrollPane(table);

        JPanel panel = new JPanel();
        panel.add(scroll);

        getContentPane().add(panel);

        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Window13TableModel();
    }


    private static class UserTableModel extends AbstractTableModel {

        private String[] columns = {"Id", "Name", "LastName", "Email"};
        private Object[][] rows;

        public UserTableModel() {
            this.rows = new Object[5][4];

            rows[0] = new Object[]{1, "Hernando", "Monge", "correp@correo.com"};
            rows[1] = new Object[]{2, "John", "Doe", "correp@correo.com"};
            rows[2] = new Object[]{3, "Ron", "Roe", "correp@correo.com"};
            rows[3] = new Object[]{4, "Lucia", "Monge", "correp@correo.com"};
            rows[4] = new Object[]{5, "Tania", "Piniar", "correp@correo.com"};
        }

        @Override
        public int getRowCount() {
            return rows.length;
        }

        @Override
        public int getColumnCount() {
            return columns.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return rows[rowIndex][columnIndex];
        }

        @Override
        public String getColumnName(int column) {
            return columns[column];
        }
    }
}
