package com.Bida.component;

import com.Bida.event.EventMenuSelected;
import com.Bida.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class Menu_Boss extends javax.swing.JPanel {
    private EventMenuSelected event;
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
        listMenu2.addEventMenuSelected(event);
    }
            
    public Menu_Boss() {
        initComponents();
        setOpaque(false);
        listMenu2.setOpaque(false);
        init();
    }
    private void init(){
        listMenu2.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        listMenu2.addItem(new Model_Menu("", "           BOSS DASHBOARD     ", Model_Menu.MenuType.TITLE));
        listMenu2.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        listMenu2.addItem(new Model_Menu("1", "Home", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("5", "Pool Tables", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("4", "Customers", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("3", "Profits", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));

        listMenu2.addItem(new Model_Menu("", "My Data", Model_Menu.MenuType.TITLE));
        listMenu2.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));   
        listMenu2.addItem(new Model_Menu("8", "Account", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("9", "More", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("10", "Logout", Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY)); 
        listMenu2.addItem(new Model_Menu("", "copyright© HNB Entertainments", Model_Menu.MenuType.TITLE));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu2 = new com.Bida.swing.ListMenu<>();
        dateAndClock_Boss1 = new com.Bida.swing.DateAndClock_Boss();

        panelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Bida/icon/_cc4353d6-b1dc-44f7-8786-4d5a336ff6f7-removebg-preview (2) (1).png"))); // NOI18N
        jLabel1.setText("HNB Billiard Club");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dateAndClock_Boss1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dateAndClock_Boss1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(listMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gr = new GradientPaint(0, 0, Color.decode("#4A00E0"), 0, getHeight(), Color.decode("#8E2DE2"));
        g2.setPaint(gr);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        super.paintChildren(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    private int x;
    private int y;
    public void initMoving(JFrame fram){
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
            
        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                fram.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
            }
           
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.Bida.swing.DateAndClock_Boss dateAndClock_Boss1;
    private javax.swing.JLabel jLabel1;
    private com.Bida.swing.ListMenu<String> listMenu2;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
