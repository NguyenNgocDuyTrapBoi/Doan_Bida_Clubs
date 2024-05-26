package com.Bida.swing;

import com.Bida.model.StatusType_Boss;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class TableStatus_Boss extends JLabel{

    public StatusType_Boss getType() {
        return type;
    }

    public TableStatus_Boss() {
        setForeground(Color.WHITE);
        
    }
    private StatusType_Boss type;
    
    public void setType(StatusType_Boss type){
        this.type = type;
        setText(type.toString());
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(type != null){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gr;
        if (type == StatusType_Boss.WORKING) {
                gr = new GradientPaint(0, 0, new Color(17, 153, 142), 0, getHeight(), new Color(56, 239, 125));
            } else if (type == StatusType_Boss.DAYOFF) {
                gr = new GradientPaint(0, 0, new Color(242, 153, 74), 0, getHeight(), new Color(242, 201, 76));
            } else if (type == StatusType_Boss.QUITJOB){
                gr = new GradientPaint(0, 0, new Color(237, 33, 58), 0, getHeight(), new Color(147, 41, 30));
            } else {
                gr = new GradientPaint(0, 0, new Color(117, 127, 154), 0, getHeight(), new Color(215, 221, 232));
            }
        g2.setPaint(gr);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1);
        }
        super.paintComponent(g);
    }
    
}
