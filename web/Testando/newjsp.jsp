<%-- 
    Document   : newjsp
    Created on : 19/12/2017, 08:54:01
    Author     : PC CASA
--%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title><script>
            function executa(){
      
            var e = document.getElementById("Escolha_id");
     
var txt = e.options[e.selectedIndex].text;   
            if(txt==="Ler"){
                document.getElementById("Senha_id").style.display = "none";
       
            }if(txt==="Editar"){
                document.getElementById("Senha_id").style.display = "block";
            }   
        }
        function recarregar(){
            location.reload();
        }    
        </script>
    </head>
    <body>
   <div id="main" class="container-fluid">
     <div id="top" class="row">
 
     </div> <!-- /#top -->
 
     <hr />
     <div id="list" class="row">
     
     </div> <!-- /#list -->
 
     <div id="bottom" class="row">
     
     </div> <!-- /#bottom -->
 </div>  <!-- /#main -->
 <div id="top" class="row">
    <div class="col-md-3">
        <h2>Itens</h2>
    </div>
 
    <div class="col-md-6">
        <div class="input-group h2">
            <input name="data[search]" class="form-control" id="search" type="text" placeholder="Pesquisar Itens">
            <span class="input-group-btn">
                <button class="btn btn-primary" type="submit">
                    <span class="glyphicon glyphicon-search"></span>
                </button>
            </span>
        </div>
    </div>
 
    <div class="col-md-3">
        <a href="add.html" class="btn btn-primary pull-right h2">Novo Item</a>
    </div>
</div> <!-- /#top -->
<div class="col-md-3">
    <h2>Itens</h2>
</div>
<div class="col-md-6">
     <div class="input-group h2">
         <input name="data[search]" class="form-control" id="search" type="text" placeholder="Pesquisar Itens">
         <span class="input-group-btn">
                 <button class="btn btn-primary" type="submit">
                     <span class="glyphicon glyphicon-search"></span>
                 </button>
         </span>
     </div>
</div>
<div id="list" class="row">
 
    <div class="table-responsive col-md-12">
        <table class="table table-striped" cellspacing="0" cellpadding="0">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Header 1</th>
                    <th>Header 2</th>
                    <th>Header 3</th>
                    <th class="actions">Ações</th>
                 </tr>
            </thead>
            <tbody>
 
                <tr>
                    <td>1001</td>
                    <td>Lorem ipsum dolor sit amet, consectetur adipiscing</td>
                    <td>Jes</td>
                    <td>01/01/2015</td>
                    <td class="actions">
                        <a class="btn btn-success btn-xs" href="view.html">Visualizar</a>
                        <a class="btn btn-warning btn-xs" href="edit.html">Editar</a>
                        <a class="btn btn-danger btn-xs"  href="#" data-toggle="modal" data-target="#delete-modal">Excluir</a>
                    </td>
                </tr>
 
            </tbody>
         </table>
 
     </div>
 </div> <!-- /#list -->
 <div id="bottom" class="row">
    <div class="col-md-12">
         
        <ul class="pagination">
            <li class="disabled"><a>&lt; Anterior</a></li>
            <li class="disabled"><a>1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li class="next"><a href="#" rel="next">Próximo &gt;</a></li>
        </ul><!-- /.pagination --><input type="text" name="" value="" />
 
    </div>
</div> <!-- /#bottom -->
    </body>
</html>
