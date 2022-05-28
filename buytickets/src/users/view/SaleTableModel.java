/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import sales.sales.Sale;

/**
 *
 * @author silas
 */
public class SaleTableModel extends AbstractTableModel {

    private List<Sale> list;
    private String[] columns;

    public SaleTableModel() {
        list = new ArrayList<>();

        columns = new String[4];

        columns[0] = "ID";
        columns[1] = "Nome";
        columns[2] = "Saldo em Tickets";
        columns[3] = "Preço";

    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int index) {
        return columns[index];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sale sale = list.get(rowIndex);

        if (sale == null) {
            return null;
        }

        switch (columnIndex) {
            case 0:
                return sale.getSaleId();
            case 1:
                return sale.getName();
            case 2:
                return sale.getTicketValue();
            case 3:
                return sale.getCashValue();
            default:
                return null;
        }

    }

    public void setList(List<Sale> l) {
        list.clear();

        if (l != null) {
            list = l;
        }

        fireTableDataChanged();
    }

    public Sale get(int row) {
        return list.get(row);
    }

}
