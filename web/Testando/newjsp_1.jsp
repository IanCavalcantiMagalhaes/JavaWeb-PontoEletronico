<%-- 
    Document   : newjsp
    Created on : 27/02/2018, 17:14:35
    Author     : PC CASA
--%>
<%@page import="Banco.ConectarBanco"%>


 <script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
 <script src="https://igorescobar.github.io/jQuery-Mask-Plugin/js/jquery.mask.min.js"></script>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
    
            .TelaDeFundo{background-image:url(http://carloswgama.com.br/cesmac/scripts/fundo_cachorro.png); background-repeat: repeat;background-attachment: fixed;
        }section{
            position: relative;background-color: rgb(219, 230, 228); left:25% ;height: 100%;width: 50%;
        }header{
            position:relative;height: 8%;background-color: #4caf50;
        }.AlinharETamanhoDoCampoDeTexto{
            position: absolute;left: 200px;width:300px; 
        }#BotaoSair{
            background-color: #4caf50;
            padding: 15px 32px;
            color:white;
            border:solid white;
            border-radius: 10px;
            margin-left:90%;
        }.FonteDeTexto{
            font-family:arial ;
          
        } 
        </style>
<link href="CSS/Decorar.css">  
<script>
$(document).ready(function(){
  alert('jQuery Loaded!');//<i>italico,<u>sublinhado,<strong>negrito,<Strike>risco/Tachado.<audio src="" controls="Controls" type="audio.mp3" autoplay=""/>
});
function Executa(){
               
                
   //  alert($("#Uma"));   
            
                  
    }
</script>

<script>


    $(document).ready(function(){
         $("#Data").mask('00/00/00');
     });
    </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
         
      
    </head>
    <body class="TelaDefundo">
        <header class="FonteDeTexto">Pesquisar nome 
            <div style="margin-left: 30%;"> Bem-Vindo  <a href="" id="BotaoSair">Sair</a></div>
            
            
            
</header>
        <section>
     
        <table>
            <thead>
                <tr>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><img src="http://lorempixel.com/300/300/cats" style=" border-radius: 25px;"/></td>
                    <td>
        <ul><div>Preço consulta</div>
            <li >Gato(R$ 50)</li>
            <li>Cachorro(R$ 70)</li>
            <li>Passaro(<strike>R$ 40</strike> por R$ 20)</li>
        </ul>
        </td>
                </tr>
                
            </tbody>
        </table> 
           <br>             
           <form action="">
               <fieldset style="border-color:gray;">
            <legend> Formulario: </legend>
          
                <label for="um">Dono:</label><input type="text" name="Dono"  placeholder="carlos" id="um" class="AlinharETamanhoDoCampoDeTexto"/><br><br>
                <label for="dois">Nome do animal:</label><input type="text" name="AnimalNome" value="" placeholder="bob" id="dois" class="AlinharETamanhoDoCampoDeTexto"/><br><br>
                <label for="Data">Dono:</label>  <input type="date" name="" value="" id="Data" class="AlinharETamanhoDoCampoDeTexto"/><br><br>
            <div>Raças:  </div>
            <input type="radio" name="Raça" value="" checked="checked" />Gato
            <input type="radio" name="Raça" value="" />Cachorro
            <input type="radio" name="Raça" value="" />Passaro
           <br>
            <textarea name="" rows="4" cols="40">
            </textarea><br>
            <input type="submit" value="Confirmar" onclick="Executa() "/>
             </fieldset>
        </form>
        </section>
         </body>
</html>
