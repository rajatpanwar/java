package pkg1;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DateServlet extends HttpServlet
{

  public void doGet(HttpServletRequest request, HttpServletResponse
  response) throws ServletException, IOException
  {

    PrintWriter pw = response.getWriter();

    Date today = new Date();

     pw.println("<html>"+"<body bgcolor=\"#999966\"></html>");    //we can make a colored  background with the help of this line

     //<h1>Date and Time with Servlet</h1>
     pw.println("<b>"+ today+"</b></body>"+ "</html>");    //  print current date and time

   }
}
