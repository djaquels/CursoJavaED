<%-- 
    Document   : ressumar
    Created on : Jan 17, 2019, 3:36:15 PM
    Author     : daniel
--%>
<%
    
  int r = Integer.parseInt(request.getAttribute("respuesta").toString());
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>La suma es:</h1>
        <p>
            <%= r %>
        </p>
        
    </body>
</html>
