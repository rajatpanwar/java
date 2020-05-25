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
 a1=new JButton("Login");
  a1.setBounds(150,430,80,50);
  a1.addActionListener(this);
 
  a2=new JButton("Create User");
  a2.setBounds(250,430,200,50);
  a2.addActionListener(this);
  
  a3=new JButton("Exit");
  a3.setBounds(480,430,80,50);
  a3.addActionListener(this);
  
 
  add(l1);
  add(l2);
  add(l3);
  add(b1);
  add(f1);
  add(a1);
  add(a2);
  add(a3);
 }
 
public void actionPerformed(ActionEvent h)
{
   if(h.getActionCommand()=="Login")
    {    try  
            { Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
              Statement Stmt=con.createStatement(); //query create krnek lye use
              String query="Select * from TBLlogin where username='"+f1.getText()+"' and password='"+b1.getText()+"'";  //call the text and password wd the help of gettext()
              ResultSet rs= Stmt.executeQuery(query); //jo query hm likte h use execute krte h
              int flag=0;
              while(rs.next())   // id and passwd ko match krne k lye y two line likhi h
              { flag++;  }
  
              if(flag==0)
              JOptionPane.showMessageDialog(null,"User not Found");
              
              else
              {JOptionPane.showMessageDialog(null,"Login Successful");   //next web page opn ho jayega yhaa s
              jmenudemo m=new jmenudemo();   //  
               m.setVisible(true);
               m.setSize(800,800);
               m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame k upr cross operation ko chlaane k lye 
               m.setTitle("Main Menu");  
               dispose();}       // jb previous page ko gaayab krnenk lye
            }   
 
            catch(Exception e)
            {System.out.println("error catched:"+e);}
    }  
   
  if(h.getActionCommand()=="Exit")
   { System.exit(0); } 

  if(h.getActionCommand()=="Create User")
   {  createuser x=new createuser();     //create a new class of oter page
    x.setVisible(true);
    x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    x.setTitle("CREATE USER");  
    x.setSize(800,800);
    dispose();
   } 
}


