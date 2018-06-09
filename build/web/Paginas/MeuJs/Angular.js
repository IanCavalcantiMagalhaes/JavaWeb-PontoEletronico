/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

https://stackoverflow.com/questions/22651378/angular-js-ajax-call-with-parameters
http://newaeonweb.com.br/angularjs/2015/02/17/Ajax-request-com-angularjs/
  app.controller ('AjaxCtrl', ['$scope', function ($scope) {//Funçao utilizada em curso

    // Plain Old JavaScript Object
    var band = {
        name: " ",
        country: " "
    }

    // Atribui $scope ao objeto JavaScript
    $scope.band = band;

    //Realiza a chamada, utilizando $http
    $http ({
        method: 'GET',
        url: '//url.com.br/getband',// /TEST/Servlet
        params: {
        sampletext : "sample",//$(#Curso).val();//Curso em que peridos vao ser mostrados
        Açao: "Pesquisar",//Dizer ao servlet que sera feito pesquisar
        TipoEntidade:"Curso"//Dizer ao servlet tipo de entidade
        
    }
    })
        .sucess (function (data, status, headers, config) {
            // Atribui o retorno ao $scope
            $scope.band.name = data.band.name;
        })
        .error (function (data, status, headers, config) {
            // Se tiver error
            console.log(status);
        });
    }]);
/* <div ng-controller="AjaxCtrl">
    <p>A melhor banda do mundo</p>
    <p>{{ band.name }}, - {{ band.country}}</p>
</div>*/
