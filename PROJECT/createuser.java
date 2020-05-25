import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class createuser extends JFrame implements ActionListener
{

 JLabel l1,l2,l3;
 JTextField f1;
 JPasswordField p1;
 JButton a1,a2,a3;
 
  public createuser()
 {setLayout(null);
  l1=new JLabel("CREATE USER");
  l1.setBounds(300,100,100,100);

  l2=new JLabel("username");
  l2.setBounds(200,200,100,30); 

  l3=new JLabel("password");
  l3.setBounds(200,300,100,30);
 
  f1=new JTextField(20);
  f1.setBounds(300,200,100,30);

  p1=new JPasswordField(20);  	
  p1.setBounds(300,300,100,30);
 
  a1=new JButton("Create");
  a1.setBounds(150,400,80,50);
  a1.addActionListener(this);
 
  a2=new JButton("clear");
  a2.setBounds(250,400,80,50);
  a2.addActionListener(this);
  
  a3=new JButton("cancel");
  a3.setBounds(350,400,80,50);
  a3.addActionListener(this);
  add(l1);
  add(l2);
  add(l3);
  add(p1);
  add(f1);
  add(a1);
  add(a2);
  add(a3);
 }

public void actionPerformed(ActionEvent h)
{String s=h.getActionCommand();
  if(s.equals("Create"))
   {   try  
          {   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
              Statement Stmt=con.createStatement();
              String query="Select * from TBLlogin where username='"+f1.getText()+"' and password='"+p1.getText()+"'";
              ResultSet rs= Stmt.executeQuery(query);
              int flag=0;
              while(rs.next())     //jo id and pass type kya h user n vo database m h yaa ni h
              { flag++;  }
              
             

              if(flag==0)
              { String a=f1.getText().trim();  // .trim islye use hota h ki jo hum username ans pass bhrte h uske aage  or peeche spaces hote h to y unko htaa deta h
                String b=p1.getText().trim();
                if(a.equals("") && b.equals(""))   // agr hm pass and user ko empty chodte h  to y error show kr dega   
               {JOptionPane.showMessageDialog(null,"fields cannot be empty");}

              else
              {String query1="insert into TBLlogin(username,password) values('"+f1.getText()+"','"+p1.getText()+"')";
              int x=Stmt.executeUpdate(query1);
	      JOptionPane.showMessageDialog(null,"User created successfully");
               
              loginscreen q=new loginscreen();   //jb user create ho jayga to y class automatically login wale page pr chli jayegi lkr
              q.setVisible(true);
              q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              q.setTitle("LOGIN SCREEN");  
              q.setSize(800,800);
              dispose();
              }
              } 
 
              else
              { JOptionPane.showMessageDialog(null,"User already exists");
                f1.setText("");
                p1.setText("");    
		f1.requestFocus();
              }

              con.close();
         }
  
            catch(Exception e)
            {JOptionPane.showMessageDialog(null,"error caught"+""+e); }

  
    

 }

  if(s.equals("clear"))     //is button s sare  
   {f1.setText("");      //iska use field m data  ko set krne k lye
    p1.setText("");
   }

  if(s.equals("cancel"))           //return to login screen if we reached from glti s
  {loginscreen q=new loginscreen();
    q.setVisible(true);
    q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    q.setTitle("LOGIN SCREEN");  
    q.setSize(800,800);
    dispose();
  }

}
public static void main(String args[])
{ createuser x=new createuser();
    x.setVisible(true);
    x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    x.setTitle("CREATE USER");  
    x.setSize(800,800);



}
}




