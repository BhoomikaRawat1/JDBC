package Swing;

import javax.swing.*;
import java.awt.*;


public class ProfilePage {
    ProfilePage()
    {
        JFrame profilepage = new JFrame("Profile Page");
        profilepage.getContentPane().setBackground( Color.PINK);

        JLabel name=new JLabel("Name:-");
        name.setBounds(120,50,80,30);

    JLabel email= new JLabel("E-mail:-");
        email.setBounds(120,70,80,30);

        JButton title1 =new JButton("Title"+"text");
        title1.setBounds(100, 120,300,50);

        JButton title2 =new JButton("Title"+"text");
        title2.setBounds(100, 190,300,50);

        JButton add = new JButton("+");
        add.setBounds(400,400,50,30);

        add.addActionListener(e -> {
            new TextPage();
            profilepage.dispose();
        });

        profilepage.add(name);
        profilepage.add(email);
        profilepage.add(title1);
        profilepage.add(title2);
        profilepage.add(add);

        profilepage.setSize(500,500);
        profilepage.setLayout(null);
        profilepage.setVisible(true);
        profilepage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ProfilePage();
    }
}