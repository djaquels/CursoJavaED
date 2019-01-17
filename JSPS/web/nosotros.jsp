<%-- 
    Document   : nosotros
    Created on : Jan 17, 2019, 2:49:31 PM
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <jsp:include page="WEB-INF/partials-dinamic/menu.jsp">    
            <jsp:param name="pagina_a" value="nosotros"/>
        </jsp:include>
        <h1>Paǵina donde explicamos quienes somos</h1>
        <%@include file="WEB-INF/partials-static/footer.html" %>
    </body>
</html>
