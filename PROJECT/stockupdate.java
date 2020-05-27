import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class stockupdate extends JFrame implements ActionListener
{

 JLabel l1,l2,l3,l4,l5;
  JTextField f2,f3,f4;
 JComboBox b1;
 JButton a1,a2,a3,a4;
 
public stockupdate()
{ setLayout(null);
  l1=new JLabel("Stock Update Screen");
  l1.setBounds(350,80,400,100);

  l2=new JLabel("Item Code");
  l2.setBounds(300,200,100,30); 

 l3=new JLabel("Item Name");
 l3.setBounds(300,300,100,30);
 
 l4=new JLabel("Rate");
 l4.setBounds(300,400,100,30);

 l5=new JLabel("QOH");
 l5.setBounds(300,500,100,30);
 
  b1=new JComboBox();
  b1.setBounds(400,200,100,30);
  b1.addFocusListener(new FocusAdapter()
                    {  public void focusLost(FocusEvent h)
                       { getdetails();  }
                     });
                          
  f2=new JTextField(20);  	
  f2.setBounds(400,300,100,30);
  
   f3=new JTextField(20);  	
   f3.setBounds(400,400,100,30); 

  f4=new JTextField(20);  	
  f4.setBounds(400,500,100,30);

  a1=new JButton("Modify");
  a1.setBounds(200,600,80,50);
  a1.addActionListener(this);


  a2=new JButton("Delete");
  a2.setBounds(300,600,80,50);
  a2.addActionListener(this);
 
  a3=new JButton("Clear");
  a3.setBounds(400,600,80,50);
  a3.addActionListener(this);
 
  a4=new JButton("Cancel");
  a4.setBounds(500,600,80,50);
  a4.addActionListener(this);
 
