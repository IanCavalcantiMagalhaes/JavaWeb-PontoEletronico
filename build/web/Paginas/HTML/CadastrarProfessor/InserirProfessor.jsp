<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>



<html>
<head><link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="MeuCss/Visual.css" rel="stylesheet">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
        <div class="col-sm-3 col-md-3 pull-right">
        <form class="navbar-form" role="search">
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
            <div class="input-group-btn">
                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
            </div>
        </div>
        </form>
        </div>
  </div>
</nav>
<title>Adicionar produto a lista</title>
</head>
<body>
<section class="Sessao" >

    <form action="Inserir.jsp">
        <table border="1">
            <thead>
                <tr>
                    <th><p>Nome produto </p></th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td> <p>Nome</p><input type="text" name="Nome" value="" /></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td><p>CPF</p><input type="text" name="CPF" value="" /></td>
                    <td></td>
                    <td></td>
                </tr>
            </tbody>
        </table>

    
   
        <input type="hidden" name="Açao" value="Cadastrar" />
        <input type="hidden" name="TipoEntidade" value="Professor" />
        
    <input type="submit" value="Executa" />
 </form>

</section>


</body>
</html>
