package com.Bida.component;

import com.Bida.model.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class CardHome extends javax.swing.JPanel {

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    private Color color1;
    private Color color2;
    
    public CardHome() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }
    public void setData(Model_Card data){
        ibIcon.setIcon(data.getIcon());
        ibTitle.setText(data.getTitle());
        ibValues.setText(data.getValue());
        ibDescription.setText(data.getDescription());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibIcon = new javax.swing.JLabel();
        ibTitle = new javax.swing.JLabel();
        ibValues = new javax.swing.JLabel();
        ibDescription = new javax.swing.JLabel();

        ibIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Bida/icon/stock.png"))); // NOI18N

        ibTitle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ibTitle.setForeground(new java.awt.Color(255, 255, 255));
        ibTitle.setText("Title");

        ibValues.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ibValues.setForeground(new java.awt.Color(255, 255, 255));
        ibValues.setText("Values");

        ibDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ibDescription.setForeground(new java.awt.Color(255, 255, 255));
        ibDescription.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ibIcon)
                    .addComponent(ibDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(ibValues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ibTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ibIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ibTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ibValues)
                .addGap(18, 18, 18)
                .addComponent(ibDescription)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void paint(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gr = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(gr);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight()/2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight()/2) - 20, getHeight()/2 + 20, getHeight(), getHeight());
        super.paint(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibDescription;
    private javax.swing.JLabel ibIcon;
    private javax.swing.JLabel ibTitle;
    private javax.swing.JLabel ibValues;
    // End of variables declaration//GEN-END:variables
}
