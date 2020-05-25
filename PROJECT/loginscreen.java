import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class loginscreen extends JFrame implements ActionListener
{

 JLabel l1,l2,l3;
 JPasswordField b1;
 JTextField f1;
 JButton a1,a2,a3;

 public loginscreen()
{ setLayout(null);
 Font f=new Font("Arial Black",Font.BOLD|Font.ITALIC,30);
  l1=new JLabel("LOGIN SCREEN");
  l1.setFont(f);
  l1.setBounds(210,100,400,100);

  l2=new JLabel("username");
  l2.setBounds(240,230,100,30); 

 l3=new JLabel("password");
 l3.setBounds(240,330,100,30);
 
 f1=new JTextField(20);
 f1.setBounds(340,230,100,30);

  b1=new JPasswordField(20);  	
 
 b1.setBounds(340,330,100,30);
