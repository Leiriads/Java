/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author DevL
 */
public class IMG {
    
    public void showIcon(JLabel label) {
        String imagePath = "src/main/java/Img/ifpr.jpg";
        ImageIcon icon = new ImageIcon(imagePath);
        int width = label.getWidth();
        int height = label.getHeight();
        icon.setImage(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        label.setIcon(icon);
    }
}
