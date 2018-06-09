/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoPrincipal;

import Professor.Professor;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author PC CASA
 */
@Entity
public class Principal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
public String AçoesInsertUpdateDelete(String TipoEntidade,String Açoes,String Condiçao,ArrayList Informaçoes) throws SQLException{//Condiçao tera valor where para insert,update e delete
    //Informaçoes podera ter dados para insert e update
    //Condiçao tera ID da entidade
    String resposta="";
    if(TipoEntidade!=null){
        
        if(TipoEntidade.equals("Professor")){
            Professor Prof=new Professor();
            resposta=Prof.Principal(Açoes,Condiçao,Informaçoes);
            
        }if(TipoEntidade.equals("Curso")){

        }
        
    }else{
        resposta="Erro";
    }
    
    return resposta;
}
public ResultSet AçoesSelect(String TipoEntidade,String TipoCondiçao,String Condiçao) throws SQLException{//Condiçao tera valor where para insert,update e delete
    //Condiçao tera ID da entidade
    String resposta="";
    ResultSet RS=null;
    if(TipoEntidade!=null){
        
        if(TipoEntidade.equals("Professor")){
            Professor Prof=new Professor();
            RS=Prof.Pesquisar(TipoCondiçao,Condiçao);
            
        }if(TipoEntidade.equals("Curso")){

        }
        
    }else{
        resposta="Erro";
    }
    //setResultado(RS);
    return RS;
}
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Principal)) {
            return false;
        }
        Principal other = (Principal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MetodoPrincipal.Principal[ id=" + id + " ]";
    }
    
}
