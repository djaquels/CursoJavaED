<%-- 
    Document   : INDEX
    Created on : Jan 17, 2019, 2:41:46 PM
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        .selecionado {
            background: black;
            color:#fff;
        }
    </style>
    <body>
        <jsp:include page="WEB-INF/partials-dinamic/menu.jsp">    
            <jsp:param name="pagina_a" value="inicio"/>
        </jsp:include>

        <h1>Hello World!</h1>
         <%@include file="WEB-INF/partials-static/footer.html" %>
         <p> 
        <%
             
            int a = 5,b =5;
            int c  = a +b ;
            out.print("El resultado es: "+c);
            %> </p>
    </body>
</html>
