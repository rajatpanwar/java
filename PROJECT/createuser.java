import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class createuser extends JFrame implements ActionListener
{

 JLabel l1,l2,l3;
 JTextField f1;
 JPasswordField p1;
 JButton a1,a2,a3;
 
  public createuser()
 {setLayout(null);
  l1=new JLabel("CREATE USER");
  l1.setBounds(300,100,100,100);

  l2=new JLabel("username");
  l2.setBounds(200,200,100,30); 

  l3=new JLabel("password");
  l3.setBounds(200,300,100,30);
 
  f1=new JTextField(20);
  f1.setBounds(300,200,100,30);

  p1=new JPasswordField(20);  	
  p1.setBounds(300,300,100,30);
 
  a1=new JButton("Create");
  a1.setBounds(150,400,80,50);
  a1.addActionListener(this);
 
  a2=new JButton("clear");
  a2.setBounds(250,400,80,50);
  a2.addActionListener(this);
  
  a3=new JButton("cancel");
  a3.setBounds(350,400,80,50);
  a3.addActionListener(this);
