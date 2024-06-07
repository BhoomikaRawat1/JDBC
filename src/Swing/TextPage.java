package Swing;

//package Swing.TODO;

import javax.swing.*;
import java.awt.*;

public class TextPage {
    TextPage(){
        JFrame textpage= new JFrame("Text Page");
        textpage.getContentPane().setBackground( Color.PINK);

        JLabel title = new JLabel("Title");
        title.setBounds(20,20,50,30);

        JLabel text =new JLabel("Text");
        text.setBounds(20,40,50,30);

        textpage.add(text);
        textpage.add(title);
        textpage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textpage.setLayout(null);
        textpage.setVisible(true);
        textpage.setSize(500,500);
    }
    public static void main(String[] args) {
        new  TextPage();
    }
}