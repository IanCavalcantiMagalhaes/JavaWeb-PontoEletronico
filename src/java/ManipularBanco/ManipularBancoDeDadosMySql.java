/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManipularBanco;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC CASA
 */
public class ManipularBancoDeDadosMySql {//As alteraçoes podem afetar outras partes do codigo fonte
    
    public void BackupMysql(String user,String Password,String Nomedatabase){
        String caminho="c:Program files/mysql/mysql server 5.7/bin>";
     //mysqldump -uroot -p1997 --all-databases>E:\Backup.sql
//mysqldump -uroot -p1997 test>E:\Backup.sql 
String executarComandoNoCmd="";
        executarComandoNoCmd = "mysqldump -ur"+user+" -p"+Password+" "+Nomedatabase+">E:\\Backup.sql ";
        
    }public void RestoreMysql(String user,String Password,String Nomedatabase) throws IOException{
        String caminho="c:"+"program files"+"/mysql/"+"mysql server 5.7"+"/bin>";//por ter espaço deve separa os textos
     //mysqldump -uroot -p1997 --all-databases>E:\Backup.sql
//mysqldump -uroot -p1997 test>E:\Backup.sql 
String executarComandoNoCmd="";
        executarComandoNoCmd = "mysqldump -u"+user+" -p"+Password+" "+Nomedatabase+"<E:\\Backup.sql ";
        
        
            Runtime.getRuntime().exec(caminho+executarComandoNoCmd);
        
    }public void AlterarNomeDaTabela(String NomeTabela,String NovoNomeTabela){
        
        String x="RENAME TABLE "+NomeTabela+" TO "+NovoNomeTabela;
        
    }public void AlterarNomeDaColuna(String NomeTabela,String NomeColuna,String NovoNomeColuna){
        
        String x="ALTER TABLE "+NomeTabela+" CHANGE "+NomeColuna+" "+NovoNomeColuna;
    }public void AdicionarRestriçao(String NomeTabela,String NomeColuna,String NomeDaRestriçao,String TipoDeRestriçao){
        //TipoDeRestriçao podem ser UNIQUE,NOT NULL,PRIMARY KEY,FOREIGN KEY e etc
        String x="ALTER TABLE "+NomeTabela+" ADD CONSTRAINT "+NomeDaRestriçao+" "+TipoDeRestriçao+" ("+NomeColuna+")";
    }public void RemoverRestriçao(String NomeTabela,String NomeColuna,String NomeDaRestriçao,String TipoDeRestriçao){
    
        String x="ALTER TABLE "+NomeTabela+" DROP CONSTRAINT "+NomeDaRestriçao+" ";
    }public void CriarTrigger(){
      String sql="CREATE TRIGGER BackupFuncionario BEFORE REMOVE ON Funcionario "
              + "FOR EACH ROW "
              + "BEGIN INSERT INTO FuncionariosExcluidos(Nome)VALUES(old.nome) END";
    }
}
