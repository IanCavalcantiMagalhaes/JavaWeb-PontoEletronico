/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManipularBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cesmac
 */
public class Cadastrar {
    
    public void ProfessorAdicionar(String nome,String CPF) throws SQLException{
         ResultSet rs;
   
     Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1997");
        
        String Selecionar ="INSERT INTO funcionario(Nome,CPF) VALUES (?,?)";
        
    PreparedStatement p = conn.prepareStatement(Selecionar);

           p.setString(1,nome);
           p.setString(2,CPF);
          rs= p.executeQuery();
        
    }
    
}
