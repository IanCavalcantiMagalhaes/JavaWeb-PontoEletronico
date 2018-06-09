<%-- 
    Document   : TelaDeLogin
    Created on : 28/12/2017, 03:37:58
    Author     : PC CASA
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String a="OI"; %>
<!DOCTYPE html>
<html>
    <head> <link href="MeuCss/Visual.css" rel="stylesheet">

     <script>  
    
    $(document).ready(function(){
         $(#Formulario1).mask('000.000.000-00');
     });
    </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<style>
  #Fomulario1{width: 200px;  position:relative; top :-10px;}
  
  #Formulario2{width: 200px;}
  
  #Imagem{width: 100px;height: 25px;  position:relative; bottom: 10px; right: -50px; color: green;}
  
  .TelaDeFundo{background-image:url(Imagem/general-night-golden-gate-bridge-hd-wallpapers-golden-gate-bridge-wallpaper.jpg);
          background-repeat: no-repeat;background-attachment: fixed;}
</style>

    </head>
    <body class="TelaDeFundo">
        <table align="center" style="border:1px solid black;">
            <thead>
                <tr>
                    <th style="width: 70px;color: green">Ola</th>
                    <th style="width: 70px;color: green">Ola</th>
                </tr>
            </thead>
       
        </table>
    
        <form action="../Login" style="color: white; text-align: center;">
        <h1>Hello World! Usuario=Ian Senha=</h1>
        <input type="text" name="Fomulario1" value="" placeholder="Digite seu nome" id="Fomulario1"/><br>
      <input type="text" name="Senha" value="" placeholder="Digite senha"  id="Formulario2"/><br><br>
      <input type="image" src="Imagem/BotaoEntrar.PNG" value="Entrar" id="Imagem" /> 

        </form>

        
  
    </body>
</html>
