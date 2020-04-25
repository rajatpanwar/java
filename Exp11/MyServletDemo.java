import javax.servlet.http.*; 
import javax.servlet.*; 
import java.io.*; 
public class MyServletDemo extends HttpServlet { 
   public void doGet(HttpServletRequest req,HttpServletResponse res) 
   throws ServletException,IOException 
   {  
     res.setContentType("text/html"); 
     PrintWriter pwriter=res.getWriter(); 

     String name = req.getParameter("uname");
     String age = req.getParameter("uage");
     pwriter.println("Name: "+name); 
     pwriter.println("Age: "+age);
     //req.setContentType("text/html");
    // PrintWriter pwriter=req.getWriter();

     //ServletContext object creation
     ServletContext context=getServletContext();

     //fetching values of initialization parameters and printing it
     String usrname=context.getInitParameter("uname");
     pwriter.println("sap id:"+usrname);
     String usremail=context.getInitParameter("uemail");
     pwriter.println("Email Id is:"+usremail);
     //pwriter.close();
     
  }
}
