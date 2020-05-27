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
 add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(l5);
  add(f2);
  add(b1);
  add(f3);
  add(f4);
  add(a1);
  add(a2);
  add(a3);
  add(a4);
  
  geticodes();
}
void geticodes()
{      try
         {Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
              Statement Stmt=con.createStatement();
              String query="select icode from TBLstock";
              ResultSet rs= Stmt.executeQuery(query);
              while(rs.next())
              {
                b1.addItem(rs.getInt("icode"));
              } 
             con.close();
          }
     
            catch(Exception e)
            {System.out.println("error catched:"+e);}
 }            


void getdetails()
{           try
             { Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
              Statement Stmt=con.createStatement();
              String query1="select * from TBLstock where icode="+b1.getSelectedItem().toString();
              ResultSet rs= Stmt.executeQuery(query1);
              while(rs.next())
              {f2.setText(rs.getString("iname"));
               f3.setText(""+rs.getInt("rate"));
               f4.setText(""+rs.getInt("qoh"));
              }
              con.close();
             }

 	   catch(Exception e)
  	   {System.out.println("error ctched:"+e);}
  	   
} 
 
public void actionPerformed(ActionEvent h)
{
   if(h.getActionCommand()=="Modify")
    {       try
              {Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
              Statement Stmt=con.createStatement();
              String query2="update TBLstock set iname='"+f2.getText()+"',rate="+f3.getText()+",qoh="+f4.getText()+" "+"where icode="+b1.getSelectedItem();
              int x=Stmt.executeUpdate(query2);
              JOptionPane.showMessageDialog(null,"Item Modified");
               f2.setText("");
               f3.setText("");
               f4.setText("");
               con.close();}
              
         catch(Exception e)
         {System.out.println("error ctched:"+e);}
         
   }  
   if(h.getActionCommand()=="Clear")
   { 
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

 if(h.getActionCommand()=="Delete")
   {
           try
              {Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
              Statement Stmt=con.createStatement();
              String query3="Delete from TBLstock where icode="+b1.getSelectedItem();
              int ans=JOptionPane.showConfirmDialog(null,"Are you sure?");
             
              if(ans==JOptionPane.YES_OPTION)
               { int x=Stmt.executeUpdate(query3);
                JOptionPane.showMessageDialog(null,"Item Deleted");
                f2.setText("");
                f3.setText("");
                f4.setText("");
                b1.removeAllItems();
                geticodes();                 
                  }
                con.close();
              }
              catch(Exception e)
              {System.out.println("error ctched:"+e);}
              
    }


}

public static void main(String args[])
  { stockupdate k=new stockupdate();
    k.setVisible(true);
    k.setSize(800,800);
    k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    k.setTitle("Stock Update"); 
  }

}   
   
