import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.text.*;
import java.util.Date;

public class issuescreen extends JFrame implements ActionListener
{

 JLabel l1,l2,l3,l4,l5,l6,l7;
  JTextField f2,f3,f4,f5,f6;
 JComboBox b1;
 JButton a1,a2,a3;
public issuescreen()
{ setLayout(null);
  l1=new JLabel("Issue Screen");
  l1.setBounds(400,10,200,50);

  l2=new JLabel("Item Code");
  l2.setBounds(300,110,100,30); 

 l3=new JLabel("Item Name");
 l3.setBounds(300,150,100,30);
 
 l4=new JLabel("Rate");
 l4.setBounds(300,250,100,30);

 l5=new JLabel("QOH");
 l5.setBounds(300,350,100,30);
 
 l6=new JLabel("DOI");
 l6.setBounds(300,450,100,30);
  
 l7=new JLabel("Qty Issued");
 l7.setBounds(300,550,100,30);
 
 
  b1=new JComboBox();
  b1.setBounds(400,110,100,30);
  b1.addFocusListener(new FocusAdapter()
                    {  public void focusLost(FocusEvent h)
                       { getdetails();  }
                     });
                       
  f2=new JTextField(20);  	
  f2.setBounds(400,150,100,30);
  
   f3=new JTextField(20);  	
   f3.setBounds(400,250,100,30); 

  f4=new JTextField(20);  	
  f4.setBounds(400,350,100,30);

  f5=new JTextField(20);  	
  f5.setBounds(400,450,100,30);

 f6=new JTextField(20);  	
  f6.setBounds(400,550,100,30);

  a1=new JButton("Issue");
  a1.setBounds(200,590,80,50);
  a1.addActionListener(this);


  a2=new JButton("Clear");
  a2.setBounds(300,590,80,50);
  a2.addActionListener(this);
 
  a3=new JButton("Cancel");
  a3.setBounds(400,590,80,50);
  a3.addActionListener(this);

