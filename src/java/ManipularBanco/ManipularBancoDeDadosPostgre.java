/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManipularBanco;

/**
 *
 * @author PC CASA
 */
public class ManipularBancoDeDadosPostgre {
    public void AlterarNomeDaTabela(String NomeTabela,String NovoNomeTabela){
        
        String x="ALTER TABLE "+NomeTabela+" RENAME TO "+NovoNomeTabela;
        
    }public void AlterarNomeDaColuna(String NomeTabela,String NomeColuna,String NovoNomeColuna){
        
        String x="ALTER TABLE "+NomeTabela+" RENAME COLUMN "+NomeColuna+" TO "+NovoNomeColuna;
    }public void AdicionarRestriçao(String NomeTabela,String NomeColuna,String NomeDaRestriçao,String TipoDeRestriçao){
        //TipoDeRestriçao podem ser UNIQUE,NOT NULL,PRIMARY KEY,FOREIGN KEY e etc
        String x="ALTER TABLE "+NomeTabela+" ADD CONSTRAINT "+NomeDaRestriçao+" "+TipoDeRestriçao+" ("+NomeColuna+")";
    }public void RemoverRestriçao(String NomeTabela,String NomeColuna,String NomeDaRestriçao,String TipoDeRestriçao){
    
        String x="ALTER TABLE "+NomeTabela+" DROP CONSTRAINT "+NomeDaRestriçao+" ";
    }
}
