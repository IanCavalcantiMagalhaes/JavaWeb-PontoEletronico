/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC CASA
 */
public class DadosPerfil {
    public static ResultSet ResultadoDeColeta(String id) throws SQLException, ClassNotFoundException{
  Connection conn;
        
              Class.forName("com.mysql.jdbc.Driver");
             conn= DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull","root","1997");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM c WHERE id=?");
        ps.setInt(1,Integer.parseInt(id));
        ResultSet rs=ps.executeQuery();
        
         return rs;
    }
     public static String ValidaçaoDeSenha(String Nome,String senha) throws ClassNotFoundException, SQLException{
              String Validaçao="";
         if(senha!=null){
             
             Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull","root","1997");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM c WHERE Nome=? and senha=?");
        ps.setInt(1,Integer.parseInt(Nome));
         ps.setInt(2,Integer.parseInt(senha));
        
                 ResultSet rs=ps.executeQuery();
                 if(rs==null){
                    Validaçao="Senha Incorreta";
                 }else{
                      Validaçao="Senha Correta";
                 }
                 
                 
           
         }return Validaçao;//o retorno pode ser 'Senha Incorreta','Senha Correta' ou ''
         
         
     }
     public static String LiberarTexto(String Escolha) throws ClassNotFoundException, SQLException{
         String SomentLer="";
         if(Escolha.equals("Ler")){
             SomentLer="readonly";
         }if(Escolha.equals("Editar")){
             SomentLer="";
         }
         return SomentLer;
     }
    public static String ComandoJS(String Validaçao){
        String JS="";
        if(Validaçao=="Senha Incorreta" || Validaçao==""){
            JS="<script>\n" +
"            function executa(){\n" +
"                alert(\"OLA\");\n" +
"            var e = document.getElementById(\"Escolha_id\");\n" +
"\n" +
"var txt = e.options[e.selectedIndex].text;\n" +
"            if(txt===\"Ler\"){\n" +
"                document.getElementById(\"Senha_id\").style.display = \"none\";\n" +
"               \n" +
"            }if(txt===\"Editar\"){\n" +
"                 document.getElementById(\"Senha_id\").style.display = \"block\";" +
"              \n" +
"            }\n" +
"            \n" +
"            \n" +
"        }</script>";
        }if(Validaçao=="Senha Correta"){
            JS="";
        }
        return JS;
    }
    
}
    

