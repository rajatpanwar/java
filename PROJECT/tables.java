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
    
