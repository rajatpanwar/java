mport java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jmenudemo extends JFrame implements ActionListener

 {JMenuBar b1;             //create  bar
  JMenu m1,m2,m3,m4;   //y list show krti h jo jmenu bar m click krne s aati h
  JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;     //item
  
  public jmenudemo()
 { 
   b1=new JMenuBar();
   setJMenuBar(b1);
     
   m1=new JMenu("Stock");
   m2=new JMenu("Transaction");
   m3=new JMenu("Report");
   m4=new JMenu("quit");
   
   b1.add(m1);
   b1.add(m2);
   b1.add(m3);
   b1.add(m4);
