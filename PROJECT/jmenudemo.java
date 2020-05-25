import java.awt.*;
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
   public void actionPerformed(ActionEvent h)
{  	if(h.getSource()==i1)
     	{ stockentry q=new stockentry();
          q.setVisible(true);
          q.setSize(800,800);
          q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          q.setTitle("Stock Entry"); 
          dispose();
        }
  
   	if(h.getSource()==i2)
	 {stockupdate k=new stockupdate();
          k.setVisible(true);
          k.setSize(800,800);
          k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          k.setTitle("Stock Update"); 
          dispose(); 
          }
   	
        if(h.getSource()==i3)
   	 {stockupdate k=new stockupdate();
          k.setVisible(true);
    	  k.setSize(800,800);
    	  k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  k.setTitle("Stock Update"); 
            dispose();
          }
 if(h.getSource()==i4)
      	{  issuescreen l=new issuescreen();
           l.setVisible(true);
           l.setSize(800,800);
           l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           l.setTitle("Issue Screen"); 
           dispose();      
          }
 
	if(h.getSource()==i5)
     	{ issuescreen l=new issuescreen();
    	  l.setVisible(true);
    	  l.setSize(800,800);
    	  l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  l.setTitle("Issue Screen");
           dispose();
        }

	if(h.getSource()==i6)
     	{tables l=new tables();
         l.setVisible(true);
         l.setSize(800,800);}

	if(h.getSource()==i7)
     	{}

	if(h.getSource()==i8)
     	{}

	if(h.getSource()==i9)
     	{}

	if(h.getSource()==i10)
     	{System.exit(0); }

  }

