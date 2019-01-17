<% 
     String p = request.getParameter("pagina_a");  
 %>
<nav>
            <ul>
                <li><a href="/JSPS" class="<% out.print(p.equals("inicio")? "selecionado":"");%>"> Inicio</a></li>
                <li><a href="/JSPS/nosotros.jsp" class="<% out.print(p.equals("nosotros")? "selecionado":"");%>">Nosotros</a></li>
            </ul>
  </nav>
<p>
   
</p>