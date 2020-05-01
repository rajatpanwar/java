<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
    <head> 
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
       <title>Accept User Page</title> 
    </head> 
    <body> 
        <h1>Verifying Details</h1> 
        
        <jsp:useBean id="snr" class="pkg.Test"/> 
          
        <%-- Set the value of the created bean using form data --%> 
        <jsp:setProperty name="snr" property="user"/> 
        <jsp:setProperty name="snr" property="pass"/> 
          
        <%-- Display the form data --%> 
        The Details Entered Are as Under<br/> 
        <p>Username : <jsp:getProperty name="snr" property="user"/></p> 
        <p>Password : <jsp:getProperty name="snr" property="pass"/></p> 
          
        <%-- Validate the user using the validate() of  
             ValidateUser.java class 
        --%> 
        <%if(snr.validate("Rajat", "Rajat.97")){%> 
            Welcome page on successful<br/> 
        <%}else{%> 
            display wrong authentication page<br/> 
        <%}%>   
    </body> 

</html> 
