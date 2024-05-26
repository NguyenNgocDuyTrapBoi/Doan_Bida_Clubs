package com.Bida.form;

import com.Bida.model.Model_Card;
import com.Bida.model.StatusType_Boss;
import com.Bida.swing.Scrollbar;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Form_Home_Boss extends javax.swing.JPanel {
    public Form_Home_Boss() {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/Bida/icon/stock.png")), "Stock Total", "$200000", "Increased by 60%"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/Bida/icon/flag.png")), "Unique Visitors", "$15000", "Increased by 25%"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/Bida/icon/profit.png")), "Total Profit", "$300000", "Increased by 70%"));
        // add Row;
        spTable.setVerticalScrollBar(new Scrollbar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        table_Boss1.addRow(new Object[]{"Duy Thanh", "duythanh@gmail.com", "11111", "25 Apr,2018", "$2500", StatusType_Boss.WORKING});
        table_Boss1.addRow(new Object[]{"Minh Tuan", "minhtuan@gmail.com", "22222", "25 Apr,2018", "$900", StatusType_Boss.WORKING});
        table_Boss1.addRow(new Object[]{"Anh Huy", "anhhuy@gmail.com", "33333", "25 Apr,2018", "$2250", StatusType_Boss.WORKING});
        table_Boss1.addRow(new Object[]{"Tran Quy", "tranquy@gmail.com", "44444", "25 Apr,2018", "$3000", StatusType_Boss.WORKING});
        table_Boss1.addRow(new Object[]{"Ngoc Thien", "ngocthien@gmail.com", "55555", "25 Apr,2018", "$1707", StatusType_Boss.WORKING});
        table_Boss1.addRow(new Object[]{"Huy Hoang", "huyhoang@gmail.com", "66666", "25 Apr,2018", "$1550", StatusType_Boss.WORKING});
        table_Boss1.addRow(new Object[]{"Quoc Dinh", "quocdinh@gmail.com", "77777", "25 Apr,2018", "$2750", StatusType_Boss.WORKING});
        table_Boss1.addRow(new Object[]{"Quoc Khang", "quockhang@gmail.com", "88888", "25 Apr,2018", "$1000", StatusType_Boss.DAYOFF});
        table_Boss1.addRow(new Object[]{"Ngoc Trung", "ngoctrung@gmail.com", "99999", "25 Apr,2018", "$1000", StatusType_Boss.DAYOFF});
        table_Boss1.addRow(new Object[]{"Xuan Bao", "xuanbao@gmail.com", "010101", "25 Apr,2018", "$1000", StatusType_Boss.DAYOFF});
        table_Boss1.addRow(new Object[]{"Vi Cuong", "vicuong@gmail.com", "123123", "25 Apr,2018", "$1000", StatusType_Boss.DAYOFF});
        table_Boss1.addRow(new Object[]{"Phi Hung", "phihung@gmail.com", "141414", "25 Apr,2018", "$0", StatusType_Boss.QUITJOB});
        table_Boss1.addRow(new Object[]{"An Thuyen", "anthuyen@gmail.com", "54565", "25 Apr,2018", "$0", StatusType_Boss.QUITJOB});
        table_Boss1.addRow(new Object[]{"Bao Huy", "baohuy@gmail.com", "66757", "25 Apr,2018", "$0", StatusType_Boss.DISMISS});
        table_Boss1.addRow(new Object[]{"Tien Linh", "tienlinh@gmail.com", "123441", "25 Apr,2018", "$0", StatusType_Boss.DISMISS});
        table_Boss1.addRow(new Object[]{"Hong Dat", "hongdat@gmail.com", "090504", "25 Apr,2018", "$0", StatusType_Boss.DISMISS});
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new com.Bida.component.CardHome();
        card2 = new com.Bida.component.CardHome();
        card3 = new com.Bida.component.CardHome();
        panelBorder1 = new com.Bida.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table_Boss1 = new com.Bida.swing.Table_Boss();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("STAFF LIST:");

        table_Boss1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Phone", "Joined", "Salary", "Status", "Notes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table_Boss1);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(spTable)
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 935, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.Bida.component.CardHome card1;
    private com.Bida.component.CardHome card2;
    private com.Bida.component.CardHome card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private com.Bida.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.Bida.swing.Table_Boss table_Boss1;
    // End of variables declaration//GEN-END:variables

}
