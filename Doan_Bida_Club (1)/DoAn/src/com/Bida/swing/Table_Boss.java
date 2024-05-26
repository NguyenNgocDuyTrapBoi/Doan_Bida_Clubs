package com.Bida.swing;

import com.Bida.model.StatusType_Boss;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Table_Boss extends JTable{
    public Table_Boss(){
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                Table_Header header = new Table_Header(o + "");
                if (i1 == 5) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int i, int i1) {
                if(i1 != 5){
                    Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, i, i1);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if(isSelected){
                        com.setForeground(new Color(231, 238, 13));
                    }else{
                        com.setForeground(new Color(102, 102, 102));
                    }
                    return com;
                }else{
                    StatusType_Boss type = (StatusType_Boss) value;
                    CellStatus cell = new CellStatus(type);
                    return cell;
                }
                
            }
        });
    }
    public void addRow(Object[] row){
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
}
    