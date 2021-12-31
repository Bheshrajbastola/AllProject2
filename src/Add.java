import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add extends JFrame implements ActionListener {
    JLabel label;
    JTextField text1,text2;
    JButton Button;


    public Add() {
        setTitle("ADD");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 160, 600, 400);
        setResizable(false);
        setLayout(null);

        //for background
        getContentPane().setBackground(Color.white);


        label=new JLabel();
        label.setForeground(Color.black);
        label.setFont(new Font("Arial",Font.BOLD,15));
        label.setBounds(140,90,300,45);
        add(label);

        //for  name
        text1=new JTextField();
        text1.setBounds(220,100,100,25);
        add(text1);



        //for password
        label=new JLabel();
        label.setForeground(Color.black);
        label.setFont(new Font("Arial",Font.BOLD,15));
        label.setBounds(140,150,300,45);
        add(label);

        //for  password
        text2=new JTextField();
        text2.setBounds(220,155,100,25);
        add(text2);

//Button
        Button=new JButton("+");
        Button.setBounds(220,220,100,30);
        add(Button);



        Button.addActionListener(this);

        setLayout(null);
        setSize(500, 400);
        setVisible(true);




    }

    public static void main(String[] args) {
        new Add().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a=Integer.parseInt(text1.getText());
        int b=Integer.parseInt(text2.getText());
        int c=0;

        if(e.getSource().equals(Button)) {
            c = a + b;

            label.setText(String.valueOf(c));
        }else {
            System.out.println("error");
        }
    }


}

