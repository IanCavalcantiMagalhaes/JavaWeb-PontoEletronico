/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC CASA
 */
//-- CARGOS
//CREATE TABLE cargos (
//	id serial primary key,
//	NomeCargos varchar not null,
//	salario numeric
//);
//
//INSERT INTO cargos (NomeCargos, salario) values ('Professor Tempo Integral', 1000), ('Professor Tempo Parcial', 500)
//, ('Horista', 200);
//
//
//    CREATE TABLE Curso(
//id serial primary key,
//NomeCurso varchar not null unique,
//Turno varchar not null
//);
//INSERT INTO Curso(NomeCurso,Turno) VALUES ('Direito','Matutino'),('Engenharia','Vespertino')
//,('Sistema de informaçao','Noturno'),('Curso de magica','Matutino');
//
//CREATE TABLE Periodo(
//id serial primary key,
//NomePeriodo varchar not null unique,
//Curso_id integer REFERENCES Curso(id)
//);
//
//INSERT INTO Periodo(NomePeriodo,Curso_id) VALUES ('1ºPeriodo de Direito',1),('2ºPeriodo de Direito',1),('3ºPeriodo de Direito',1),('4ºPeriodo de Direito',1),
//('1ºPeriodo de Engenharia',2),('2ºPeriodo de Engenharia',2),('3ºPeriodo de Engenharia',2),('4ºPeriodo de Engenharia',2),('1°Periodo de magica',4);
//
//CREATE TABLE Materia(
//id serial primary key,
//Nome varchar not null unique,
//Periodo_id integer REFERENCES Periodo(id) 
//
//);
//
//INSERT INTO Materia(Nome,Periodo_id)VALUES ('Direitos Civis',1),('Direitos Processuais',2),('Direito Penal',1),('Direito Tributário',2);
//INSERT INTO Materia(Nome,Periodo_id)VALUES ('Ciencias exatas',5),('Tecnologia das Construções.',5);
//
//-- SELECT * FROM Curso as C,Periodo as P WHERE C.NomeCurso='Direito' AND C.id=P.Curso_id 
//
//-- SELECT * FROM Curso as C,Periodo as P,Materia as M WHERE C.NomeCurso='Direito' AND P.DescriçaoDoPeriodo='2ºPeriodo de Direito' AND C.id=P.Curso_id AND P.id=M.Periodo_id 
//
//-- FUNCIONARIOS
//CREATE TABLE funcionario (
//	id serial primary key,
//	nome varchar not null,
//      EstaTrabalhando boolean,
//      Cargo_ID integer REFERENCES Cargos(id),
//  CPF varchar not null unique,
//  telefone varchar not null ,
//  endereço varchar,
//   carteira_De_Trabalho varchar,
//  cep varchar not null,
//  CargaHorariaAtual numeric,
//  CargaHorariaFixa numeric,
//  PorHora numeric,
//  TempoDevendo numeric,
//  Devendo boolean,
//  TempoExtra numeric,
//  Extra boolean
//);

//CREATE TABLE Entrada_Saida(
//     Funcionario_id integer REFERENCES Funcionario(id),
//     Chegada varchar,
//     Saida varchar
//);
//CREATE TABLE Digitais(
//id serial primary key,
//Funcionario_id integer references Funcionario(id),
//Biometria bytea
//
//);
//CREATE TABLE Levantamentos_Anteriores(
//     Funcionario_id integer REFERENCES Funcionario(id),    
//     Data varchar,
//     MudancaStatus varcahar
//    
//
//);
//  CREATE TABLE Lista_de_Materias(--guardara todas as materias que o professor ensina
//  id serial primary key,
//  Materia_id integer REFERENCES Materia(id),
//  Funcionario_id integer REFERENCES funcionario(id)
//);
//
//CREATE TABLE Materia_Tempo(--guardara todos os dias e horas de uma materia
//  id serial primary key,
//  Materia_id integer REFERENCES materia(id),
//  diaDaSemana varchar,
//  Horario_Da_Aula varchar
//);
//CREATE TABLE Usuario(
//
//NomeUsuario varchar unique,
//Senha varchar
//);
//INSERT INTO Usuario(NomeUsuario,Senha)VALUES('Ian','1234');
//INSERT INTO funcionario(Nome)VALUES('Ian');
//INSERT INTO Lista_de_Materias(funcionario_id,materia_id)VALUES(1,1),(1,2),(1,5);
//INSERT INTO Informacao(CPF,telefone,endereço,carteira_De_Trabalho)VALUES('1234','123456789','Rua...',12345);

//jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull,com.mysql.jdbc.Driver,root,1997
//mysqldump -uroot -p1997 --all-databases>E:\Backup.sql
//mysqldump -uroot -p1997 test>E:\Backup.sql
public class ConectarBanco {
  public  Statement stm;
  public ResultSet rs;
  private  String driver="com.mysql.Driver";
  private  String caminho="jdbc:mysql://localhost:3306/test";
  private   String usuario="root";
  private   String senha="1234";
  public Connection conn;
    public void ConectaBanco(){
        System.setProperty("jdbc.Driver",driver);
        try{
        conn=DriverManager.getConnection(caminho ,usuario,senha);
        //JOptionPane.showMessageDialog(null,"Conectado");
        //System.out.print("Conectado");
        }catch(SQLException ex){
         JOptionPane.showMessageDialog(null,ex.getMessage());
            System.out.println(ex.getMessage());
            System.out.print("Falhou");
        }
    }
    public void executaSQL(String sql) throws SQLException{
   stm= (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
   rs=stm.executeQuery(sql);
 }
    public void desconecta(){
        try{
          conn.close();  
        }catch(SQLException ex){
            
        
        
    }
}
public void backupdobanco() throws IOException{
    String yourCommand = "mysqldump -h localhost -u root -p 1997 -c --add-drop-table --add-locks --all --quick --lock-tables [name of the database] > sqldump.sql";
Runtime.getRuntime().exec(yourCommand);
    
    
}
    //void executaSQL(String sql) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }


    
    }

  

    
   

  

