<%-- 
    Document   : DadosDoProfessor
    Created on : 14/03/2018, 01:21:29
    Author     : PC CASA
--%>
<%@page import="ManipularBanco.ResultadoDePesquisa"%>

<%@page import="java.sql.ResultSet"%>
<% ResultadoDePesquisa RP=new ResultadoDePesquisa(); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  <link href="MeuCss/Visual.css" rel="stylesheet"><link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="TelaDeFundo">
        <section class="Sessao">
        <%String nome="";
    RP.SelecionarDadosDoProfessor("1"); //ID vira de pesquisar
    nome=RP.getNome();
%>
        
        <div class="row">
  <div class="col-md-4">
    <p><strong>ID do Professor</strong></p>
    <p></p>
  </div>
  <div class="col-md-4">
    <p><strong>Nome do professor</strong></p>
    <p><%=nome%></p>
  </div>
  <div class="col-md-4">
    <p><strong>CPF do Professor</strong></p>
    <p></p>
  </div>
   <div class="col-md-4">
    <p><strong>CEP do Professor</strong></p>
    <p></p>
  </div>
</div>
        </section>
    </body>
</html>
