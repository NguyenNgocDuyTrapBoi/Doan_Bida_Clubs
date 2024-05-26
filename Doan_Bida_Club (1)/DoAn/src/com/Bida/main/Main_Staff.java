package com.Bida.main;

import LoginAndSignup.JFrame_LOGIN;
import com.Bida.event.EventMenuSelected;
import com.Bida.form.*;
import com.Bida.form.Form_PoolTables;
import com.Bida.form.Form_Customers;
import com.Bida.loading.SloadScreen;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Main_Staff extends javax.swing.JFrame {
    public Main_Staff() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        menu1.initMoving(Main_Staff.this);
        menu1.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index) {
                if(index == 3){
                    setForm(new Form_Home_Staff());
                }else if(index == 4){
                    setForm(new Form_PoolTables());
                }else if(index == 5){
                    setForm(new Form_Customers());
                }else if(index == 9){
                    setForm(new Form_Account());
                }else if(index == 10){
                    setForm(new Form_Tao_Hoa_Don());
                }else if(index == 11){
                    int a = JOptionPane.showConfirmDialog(null, "Do you really want to Logout?","Select Options:", JOptionPane.YES_NO_OPTION);
                    if(a == 0){
                        JFrame_LOGIN JL = new JFrame_LOGIN();
                        JL.setVisible(true);
                        JL.pack();
                        JL.setLocationRelativeTo(null);
                        dispose();
                    }
                }
            }
        });
        setForm(new Form_Home_Staff());
    }
    private void setForm(JComponent com){
        mainPanel2.removeAll();
        mainPanel2.add(com);
        mainPanel2.repaint();
        mainPanel2.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.Bida.swing.PanelBorder();
        menu1 = new com.Bida.component.Menu_Staff();
        header2 = new com.Bida.component.Header();
        mainPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setPreferredSize(new java.awt.Dimension(1210, 638));

        mainPanel2.setOpaque(false);
        mainPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.Bida.component.Header header2;
    private javax.swing.JPanel mainPanel2;
    private com.Bida.component.Menu_Staff menu1;
    private com.Bida.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
