package Swing;

//package Swing.TODO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class RegisterPage {
    RegisterPage(){
        JFrame RegisterPage = new JFrame("Registration page");
        RegisterPage.getContentPane().setBackground( Color.PINK);

        JLabel wName= new JLabel("REGISTER NOW");
        wName.setBounds(200,20,190,20);


       /* JLabel heading = new JLabel(" Data about user");
        heading.setBounds(200,20,190,20);*/

        JLabel UserN= new JLabel("USER NAME");
       UserN.setBounds(120,50,80,20);

        JTextField  NameTF = new JTextField();
       NameTF.setBounds(250,50,100,20);

        JLabel Email = new JLabel("E-MAIL");
        Email.setBounds(120,75,80,30);

        JTextField emailTF = new JTextField();
        emailTF.setBounds(250,80,100,20);

        JLabel Password = new JLabel("PASSWORD");
        Password.setBounds(120,110,80,20);

        JTextField PassTF = new JTextField();
       PassTF.setBounds(250,110,100,20);

        JButton submit = new JButton("Register");
        submit.setBounds(175,150,100,30);
        submit.setBackground(Color.cyan);
       // btn.setForeground(Color.GRAY);

        submit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = NameTF.getText();
                String email =  emailTF.getText();
                String password= PassTF.getText();

                System.out.println(name);
                System.out.println(email);
                System.out.println(password);

                new LoginPage();
                RegisterPage.dispose();
            }
        });

        JButton reset = new JButton("Reset");
        reset.setBounds(140 ,120,100,30);
        reset.setBackground(Color.pink);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NameTF.setText("");
                emailTF.setText("");
                PassTF.setText("");
            }
        });
        RegisterPage .add(wName);
        RegisterPage.add(UserN);
        RegisterPage.add( NameTF);
        RegisterPage.add(Email);
        RegisterPage.add(emailTF);
        RegisterPage.add(Password);
        RegisterPage.add(PassTF);
        RegisterPage.add(submit);
        RegisterPage.add(reset);

        RegisterPage.setVisible(true);
        RegisterPage.setLayout(null);
        RegisterPage.setSize(500,500);
        RegisterPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new RegisterPage();
    }
}

