e<%-- 
    Document   : AddVaccineToDb
    Created on : Dec 1, 2021, 8:57:03 PM
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
           <%@ taglib uri="/WEB-INF/tlds/Vaccination" prefix="Vaccination" %>
             <% String type = request.getParameter("type"); %>
           <% String totalNumber = request.getParameter("totalNumber"); %>
   <Vaccination:insert table="vaccines" values="${type},${totalNumber} "></Vaccination:insert>
           
           
           
           
           
    </body>
</html>
