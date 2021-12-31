import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aithematic extends JFrame implements ActionListener {

    JLabel label;
    JTextField field1,field2;
    JButton button1,button2;


    public Aithematic(){
        setTitle("Aithematic");
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
        field1=new JTextField();
        field1.setBounds(220,100,100,25);
        add(field1);

        label =new JLabel();
        label.setForeground(Color.black);
        label.setFont(new Font("Arial",Font.BOLD,15));
        label.setBounds(160,90,300,45);
        add(label);

        field2=new JTextField();
        field2.setBounds(240,100,100,25);
        add(field2);



        setLayout(null);
        setSize(500, 400);
        setVisible(true);



    }
    public static void main(String[] args) {new Aithematic().setVisible(true);


    }



    @Override
    public void actionPerformed(ActionEvent e) {


    }


    }

