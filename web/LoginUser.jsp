<%-- 
    Document   : LoginUser.jsp
    Created on : Dec 1, 2021, 3:19:14 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

          <%
              String email = request.getParameter("email"); 
              String password = request.getParameter("password"); 

//                out.println(email);
//                out.println(password);
          %>
           
        <%@ taglib uri="/WEB-INF/tlds/LoginUserTld" prefix="Login" %>
        
        <Login:LoginUserHandler email="${email}" password="${password}"/>
       

    </body>
</html>
