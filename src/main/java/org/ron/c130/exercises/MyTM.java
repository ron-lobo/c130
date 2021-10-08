package org.ron.c130.exercises;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

class MyTM implements TableModel {

    public int getRowCount() {
        return 1000000;
    }

    public int getColumnCount() {
        return 10;
    }

    public String getColumnName(int columnIndex) {
        return "col" + columnIndex;
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return rowIndex + "," + columnIndex;
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    public void addTableModelListener(TableModelListener l) {
    }

    public void removeTableModelListener(TableModelListener l) {
    }
}
