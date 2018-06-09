/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManipularBanco;

import Banco.ConectarBanco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC CASA
 */
//mysqldump -uroot -p1997 --all-databases>E:\Backup.sql
//mysqldump -uroot -p1997 test>E:\Backup.sql
public class ResultadoDePesquisa {
    String nome;
    ConectarBanco conecta = new ConectarBanco();
    
       public void PesquisaPrincipal(String PesquisarQueDado,String PesquisarPorQualDado){
           if(PesquisarQueDado.equals("Professor")){
               if(PesquisarPorQualDado.equals("id")){
                   
               }
           }
       }
        
    public ResultSet PesquisarNome(String nome) throws SQLException{
        ResultSet rs;
   
     Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1997");
        
        String Selecionar ="SELECT * FROM c"
            + " WHERE Nome LIKE ?";

    PreparedStatement p = conn.prepareStatement(Selecionar);

           p.setString(1,nome+"%");
          rs= p.executeQuery();
         
         return rs;

        
        
    }public ResultSet PesquisaPorID(String ID) throws SQLException{
        conecta.ConectaBanco();
        String Selecionar ="SELECT * FROM funcionario as f"
            + " WHERE ID=? ";
    //INSERT INTO Funcionario(nome,EstaTrabalhando,Cargo_id,CPF,telefone,endereço,Carteira_De_Trabalho,
    //CEP,cargahorariaatual,CargaHorariaFixa,PorHora,TempoDevendo,Devendo,TempoExtra,Extra)
    //VALUES(Ian,false,112345,1223455,Rua sei la,98765,55555555,0,40,0,0,false,0,false)


     PreparedStatement p = conecta.conn.prepareStatement(Selecionar);

             p.setInt(1,Integer.parseInt(ID));
         
            ResultSet rs= p.executeQuery();
            return rs;
            
    }public String Ola(){
        
      return "Ola";  
    } public void SelecionarDadosDoProfessor(String id) throws SQLException{
        ResultSet rs;
             Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1997");
        PreparedStatement ps=conn.prepareStatement("SELECT * FROM Funcionario WHERE id=?");
        ps.setInt(1,Integer.parseInt(id));
        rs=ps.executeQuery();
        
       
    }
    public Connection EstabelecerConexao() throws SQLException{
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1997");
        return conn;
    }
}
