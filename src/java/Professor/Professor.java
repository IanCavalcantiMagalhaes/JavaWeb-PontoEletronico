/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Professor;

import Banco.ConectarBanco;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.JOptionPane;

/**
 *
 * @author PC CASA
 */
@Entity
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public ResultSet Resultado;
    public ResultSet ResultadoDeRelacionamentos;

    public ResultSet getResultadoDeRelacionamentos() {
        return ResultadoDeRelacionamentos;
    }

    public void setResultadoDeRelacionamentos(ResultSet ResultadoDeRelacionamentos) {
        this.ResultadoDeRelacionamentos = ResultadoDeRelacionamentos;
    }
    public String Resposta;
    ConectarBanco conecta=new ConectarBanco();
    
    public String getResposta() {
        return Resposta;
    }

    public void setResposta(String Resposta) {
        this.Resposta = Resposta;
    }

    public ResultSet getResultado() {
        return Resultado;
    }

    public void setResultado(ResultSet Resultado) {
        this.Resultado = Resultado;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
public void AçoesProcura(String TipoCondiçao,String Condiçao) throws SQLException{//Condiçao tera valor where para insert,update e delete
    //Condiçao tera ID da entidade
    String resposta="";
    ResultSet RS=null;
       
           Professor Prof=new Professor();
            RS=Prof.Pesquisar(TipoCondiçao,Condiçao);
       
            
      
    
}
    
    
    public ResultSet Pesquisar(String TipoCondiçao,String Condiçao) throws SQLException{
        ResultSet RS=null;
        
            if(TipoCondiçao.equals("id")){
               RS= PesquisarId(Condiçao);
            }
        
        
        return RS;
    }
    public ResultSet PesquisarId(String Condiçao) throws SQLException{//
        ConectarBanco conecta=new ConectarBanco();
        conecta.ConectaBanco();
        
        String Selecionar="SELECT id,nome,CPF FROM Funcionario WHERE id LIKE ?";
       int i=0;
        PreparedStatement p = conecta.conn.prepareStatement(Selecionar);
        ResultSet RS=p.executeQuery();
        
        //setResultado(RS);
        return RS;
    }
    public void MostrarTodosOsDadosDeUmProfessor(String Condiçao) throws SQLException{//Pegar Todos os dados de um professor
        
        conecta.ConectaBanco();
        
        procuraMateriasDeProfessor(Condiçao);
        
        String Selecionar="SELECT * FROM Funcionario WHERE id=?";
        PreparedStatement p = conecta.conn.prepareStatement(Selecionar);
        ResultSet RS=p.executeQuery();
        
        setResultado(RS);
      
    }
   public void procuraMateriasDeProfessor(String id) throws SQLException{
       int ID_Funcionario=Integer.parseInt(id);
       
       ResultSet RS=null,RS2=null;int i=0;
       String s="";
       
       String selecionar="SELECT * FROM funcionarios,funcionarios_materias "
               + "WHERE funcionarios.id=funcionarios_materias.funcionario_id ";//Procura relaçoes
            while(RS.next()){
                int ID_Materia=0;//materia id
                s+="SELECT * FROM materias INNER JOIN periodos ON materias.periodo_id=periodos.id "
                                       + "INNER JOIN cursos ON periodos.curso_id=cursos.id "
                                       + "WHERE id=ID_Materia";
                
                if(RS.next()){//caso tenha proximo ira adicionar UNION //https://stackoverflow.com/questions/867194/java-resultset-how-to-check-if-there-are-any-results
                    s+=" UNION ";//https://stackoverflow.com/questions/2290363/how-to-combine-two-resultsets-in-java
                }
                
            }
                //Executar select
                //RS2=p.executQuery();//Executara fora do if
            setResultadoDeRelacionamentos(RS2);
   }
   public void AçoesInsertUpdateDelete(String Açoes,String Condiçao,ArrayList Informaçoes) throws SQLException{//Condiçao tera valor where para insert,update e delete
    //Informaçoes podera ter dados para insert e update
    //Condiçao tera ID da entidade
    String resposta="";
            Professor Prof=new Professor();
           if(Açoes.equals("Cadastrar")){
               
           }
            
        
        
    
    
    
}
   public void Cadastrar(ArrayList Informaçoes) throws SQLException{
        ResultSet rs;
        ConectarBanco conecta=new ConectarBanco();
   conecta.ConectaBanco();
        
        String Selecionar ="INSERT INTO funcionario(Nome,CPF) VALUES (?,?)";
        
    PreparedStatement p = conecta.conn.prepareStatement(Selecionar);

           p.setString(1,(String)Informaçoes.get(0));
           p.setString(2,(String)Informaçoes.get(1));
           p.executeUpdate();
           
           
    }
    public void Atualizar(){
    
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Professor.Professor[ id=" + id + " ]";
    }
    
}
//
//public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		JOptionPane.showMessageDialog(null,((ArrayList) retorno().get(1)).get(0));	
//		
//		//JOptionPane.showMessageDialog(null, retorno().get(0));	
//		
//
//	}
//	public static ArrayList retorno(){
//		ArrayList A=new ArrayList<>();
//		ArrayList B=new ArrayList<>();
//		
//		A.add("Ola");B.add("Ian");
//		A.add("OI");B.add("Jose");
//		
//		ArrayList Lista=new ArrayList<>();
//		Lista.add(A);
//		Lista.add(B);
//		return Lista;
//	}