package com.Bida.form;

import com.Bida.model.Model_Card;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Form_Home_Staff extends javax.swing.JPanel {
    public Form_Home_Staff() {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/Bida/icon/off.png")), "Special Offer #1", "3 hours", "20% OFF"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/Bida/icon/off.png")), "Special Offer #2", "5 hours", "25% OFF"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/Bida/icon/off.png")), "Special Offer #3", "7 hours", "15% OFF - 1 Free Food&Drink"));
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new com.Bida.component.CardHome();
        card2 = new com.Bida.component.CardHome();
        card3 = new com.Bida.component.CardHome();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Bida/icon/backgrounf.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.Bida.component.CardHome card1;
    private com.Bida.component.CardHome card2;
    private com.Bida.component.CardHome card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    // End of variables declaration//GEN-END:variables

}
