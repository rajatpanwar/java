import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class stockentry extends JFrame implements ActionListener
{

 JLabel l1,l2,l3,l4,l5;
  JTextField f1,f2,f3,f4;
 JButton a1,a2,a3;

 public stockentry()
{ setLayout(null);
  Font f=new Font("Arial Black",Font.BOLD|Font.ITALIC,30);
  l1=new JLabel("Stock Entry Screen");
  l1.setFont(f);
  l1.setBounds(200,20,500,200);

  l2=new JLabel("Item Code");
  l2.setBounds(250,200,200,30); 

 l3=new JLabel("Item Name");
 l3.setBounds(250,300,100,30);
 
 l4=new JLabel("Rate");
 l4.setBounds(250,400,100,30);

 l5=new JLabel("QOH");
 l5.setBounds(250,500,100,30);
 
 f1=new JTextField(20);
 f1.setBounds(350,200,100,30);

  f2=new JTextField(20);  	
  f2.setBounds(350,300,100,30);
  
   f3=new JTextField(20);  	
   f3.setBounds(350,400,100,30); 

  f4=new JTextField(20);  	
  f4.setBounds(350,500,100,30);

  a1=new JButton("Insert");
  a1.setBounds(220,600,80,50);
  a1.addActionListener(this);


  a2=new JButton("Clear");
  a2.setBounds(320,600,80,50);
  a2.addActionListener(this);
 
  a3=new JButton("Cancel");
  a3.setBounds(420,600,80,50);
  a3.addActionListener(this);
  add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(l5);
  add(f2);
  add(f1);
  add(f3);
  add(f4);
  add(a1);
  add(a2);
  add(a3);
 f1.setEditable(false);
  addicode();
}

void addicode()
{            try
              { Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
              Statement Stmt=con.createStatement();
              String query="select icode from TBLstock";
              ResultSet rs= Stmt.executeQuery(query);
              int flag=0;
              while(rs.next())
              { 
                flag=rs.getInt("icode");
              }

             if(flag==0)
             {f1.setText("1000");}
            
             else
             {flag=flag+1;
              f1.setText(""+flag);
             }
                 con.close();
            }

   catch(Exception e)
   {System.out.println("error ctched:"+e);}
} 

public void actionPerformed(ActionEvent h)
{
   if(h.getActionCommand()=="Insert")
    {     try
            { Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
              Statement Stmt=con.createStatement();
              String query1="Select * from TBLstock where iname='"+f2.getText()+"'";
              ResultSet rs= Stmt.executeQuery(query1);
              int flag=0;
              while(rs.next())
              { flag++;  }
              
              if(flag==0)
              {String query="insert into TBLstock(icode,iname,rate,qoh) values("+f1.getText()+",'"+f2.getText()+"',"+f3.getText()+","+f4.getText()+")";
              int x=Stmt.executeUpdate(query);
              JOptionPane.showMessageDialog(null,"Item Added");}
  
               else
              {JOptionPane.showMessageDialog(null,"Item already added");}
               con.close();
             }
     catch(Exception e)
   {System.out.println("error ctched:"+e);}
} 

public void actionPerformed(ActionEvent h)
{
   if(h.getActionCommand()=="Insert")
    {     try
            { Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
              Statement Stmt=con.createStatement();
              String query1="Select * from TBLstock where iname='"+f2.getText()+"'";
              ResultSet rs= Stmt.executeQuery(query1);
              int flag=0;
              while(rs.next())
              { flag++;  }
              
              if(flag==0)
              {String query="insert into TBLstock(icode,iname,rate,qoh) values("+f1.getText()+",'"+f2.getText()+"',"+f3.getText()+","+f4.getText()+")";
              int x=Stmt.executeUpdate(query);
              JOptionPane.showMessageDialog(null,"Item Added");}
  
               else
              {JOptionPane.showMessageDialog(null,"Item already added");}
               con.close();
             }
  
            catch(Exception e)
            {JOptionPane.showMessageDialog(null,"error caught"+""+e); }
  
            f1.setText("");
            f2.setText("");
            f3.setText("");
            f4.setText("");
            addicode();
        
   }  
   
  if(h.getActionCommand()=="Clear")
   { f1.setText("");
     f2.setText("");
     f3.setText("");
     f4.setText("");

   }
  
  if(h.getActionCommand()=="Cancel")
  { jmenudemo m=new jmenudemo();
    m.setVisible(true);
    m.setSize(800,800);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m.setTitle("Main Menu"); 
    dispose();
  }


}

  public static void main(String args[])
  { stockentry q=new stockentry();
    q.setVisible(true);
    q.setSize(800,800);
    q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    q.setTitle("Stock Entry"); 
  }

}   

