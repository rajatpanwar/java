import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;


public class tables extends JFrame
{ JTable t1;
  JScrollPane p1;

    tables()
  { setLayout(new FlowLayout());
    String head[]={"icode","iname","dio","qtyissued"};
    DefaultTableModel tm=new DefaultTableModel(1,4);
    t1=new JTable();
    
    t1.setModel(tm);
    t1.setBounds(100,100,600,600);
    for(int j=0;j<4;j++)
   { tm.setValueAt(head[j],0,j);}
    p1= new JScrollPane
    (t1,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    add(p1);
   
    
 try
   {Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
    Statement Stmt=con.createStatement();
    String query="select * from TBLissue ";
    ResultSet rs= Stmt.executeQuery(query);
    while(rs.next())
    { String s[]={String.valueOf(rs.getInt(1)),rs.getString(2),rs.getString(3),String.valueOf(rs.getString(4))};
     tm.addRow(s);
    }
    con.close();
   }

  catch(Exception e)
  {System.out.println("exception catched");}

}  

public static void main(String args[])
 {tables l=new tables();
  l.setVisible(true);
  l.setSize(800,800);
  l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 }

}

    
