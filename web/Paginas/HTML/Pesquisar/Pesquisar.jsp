<%@page import="Banco.ConectarBanco"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="ManipularBanco.ResultadoDePesquisa"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<% ResultadoDePesquisa RP=new ResultadoDePesquisa(); ConectarBanco conecta=new ConectarBanco();
Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
conecta.ConectaBanco(); %>

 <script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
 <script src="https://igorescobar.github.io/jQuery-Mask-Plugin/js/jquery.mask.min.js"></script>
<!DOCTYPE html>
<html>
    <head>  <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="MeuCss/Visual.css" rel="stylesheet">
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Adicionar professor</a></li>
      <li><a href="#">Levantamento da semana</a></li>
      <li><a href="#">Pesquisar</a></li>
    </ul>
      </head>
      <body>
          <section  class="Sessao">
              <form action="/TEST/ServletProfessor">
                    <input type="hidden" name="Açao" value="Pesquisar" />
                    <select name="TipoEntidade">
                        <option value="Professor">Professor</option>
                        <option></option>
                        <option></option>
                        <option></option>
                        <option></option>
                    </select>
                    <select name="TipoCondiçao">
                        <option value="id">id</option>
                        <option></option>
                        <option></option>
                        <option></option>
                        <option></option>
                    </select>
                    <input type="text" name="Condiçao" value="" />
                       <input type="submit" value="Procurar" name="" />
              </form>
    <%//if(request.getParameter("CampoPesquisa")!=null){%>
            <%//if(request.getParameter("TipoEntidade").equals("Professor")){%>
             <table border="1">
                 <thead>
                     <tr>
                         <th>Nome</th>
                         <th>CPF</th>
                         <th></th>
                     </tr>
                 </thead>
                 <tbody>

                     <tr>
                         <td>Nome:</td>
                         <td>CPF:</td>
                         <td><input type="hidden" name="" value="<%//RS.getString("id");%>" />
                             <form action="/TEST/ServletProfessor" method="GET">
                                 <input type="hidden" name="Açao" value="Selecionar" />
                                 <input type="hidden" name="TipoCondiçao" value="id" />
                                 <input type="hidden" name="Condiçao" value="<%//RS.getString("id");%>" />
                                 <input type="submit" value="Visualizar(de ID:<%//=RS.getString("id");%>)" />
                             </form>
                         </td>
                     </tr>

                 </tbody>
             </table>
         <%//}%>
<%//}%>
            </div>
        </div>
      </nav>
      
</section>
   </body>
</html>
