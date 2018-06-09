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
import javax.swing.JOptionPane;

/**
 *
 * @author PC CASA
 */
public class LevantamentoDaSemana {
 //  boolean Devendo;    boolean Extra; double CargaHorariaFixa; double CargaHorariaAtual; double TempoDevendo;double TempoExtra;int id;

   
   
   

 
    public void LevantamentoDeSemana() throws SQLException{//Esse metodo devera registrar as 4 possibilidades (devendo=true,extra=true/devendo=false,extra=true/devendo=true,extra=false)
             Connection conecta =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1997");
        String sql="SELECT * FROM funcionario";
        int i=0;
         double SobrasAdicionais,TempoAdicional,fez,deveria,Diferença,devendo;
         int Indentificar=0;
        String STATUS="";
        //Obs:Uma pessoa que esta devendo nao ira poder fazer hora extra
                 PreparedStatement p = conecta.prepareStatement(sql);
       ResultSet rs= p.executeQuery();
        while(rs.next()){
            
            boolean Devendo=rs.getBoolean("Devendo");//fazer variaveis inicial fixada para quando sofrer UPDATE(Alteraçao) de true para false ou false para true nao entrar numa possibilidade errada
            boolean Extra=rs.getBoolean("Extra");//EX:Devendo true entrar num if(devendo=true e extra=true) sofrer update virar false e entrar em outro if(devendo=false e extra=true) indentificado como false
            fez=rs.getDouble("CargaHorariaAtual");
            deveria=rs.getDouble("CargaHorariaFixa");
            double TempoDevendo=rs.getDouble("TempoDevendo");
            double TempoExtra=rs.getDouble("TempoExtra");
            Indentificar=rs.getInt("id");
            
            if(rs.getInt("Cargo_id")==1 ||rs.getInt("Cargo_id")==2){//codigo expecifico para esses dois cargos
                
            if(fez<deveria){//nao fez o horario devido---POSSIBILIDADE
                
          devendo= deveria-fez;
            if(Devendo==true){
                
                String sql2="UPDATE funcionario set devendo=true,TempoDevendo=TempoDevendo+? WHERE id=?";
           PreparedStatement ps= conecta.prepareStatement(sql2);
           
          ps.setDouble(1,deveria-fez);
            ps.setInt(2,Indentificar);
             ps.executeUpdate();
             STATUS+="Ele acumulou divida: "+(rs.getDouble("TempoDevendo")+devendo+"/");
            }if(Devendo==false){
                String sql2="UPDATE funcionario set devendo=true,TempoDevendo=? WHERE id=?";
           PreparedStatement ps= conecta.prepareStatement(sql2);
           
          ps.setDouble(1,deveria-fez);
            ps.setInt(2,Indentificar);
             ps.executeUpdate();
             STATUS+="Ele agora esta devendo: "+(deveria-fez)+"/";
            }
            
        }if(fez>deveria){//Se cumpriu o horario---POSSIBILIDADE
            if(Devendo==true && Extra==true){//Se devendo e com Extra---POSSIBILIDADE 1°
             Diferença= fez - deveria;//Para saber a diferença 
            SobrasAdicionais=TempoDevendo-Diferença;//subtrair a diferença com o tempo que ele deve no sistema

	        if(SobrasAdicionais<=0.00){//Se divida zerar
			
				String sql3="UPDATE Funcionario SET devendo=false,TempoDevendo=0 WHERE id=?";
                                PreparedStatement ps2= conecta.prepareStatement(sql3);
                                ps2.setInt(1,Indentificar);
                                ps2.executeUpdate();
                                
                                STATUS+="Deixou de dever: "+0+"/";
                          if(0<SobrasAdicionais+rs.getDouble("TempoExtra")){//Se nao sobrar extras
                              String sql4="UPDATE Funcionario SET Extras=false,TempoExtra=0 WHERE id=?";
                                PreparedStatement ps3= conecta.prepareStatement(sql3);
                                ps3.setInt(1,Indentificar);
                                ps3.executeUpdate();
                                
                                STATUS+="Completou HoraExtra: "+0+"/";
                              
                          }if(0>SobrasAdicionais+rs.getDouble("TempoExtra")){//Se sobrar extras
                              String sql4="UPDATE Funcionario SET Extras=false,TempoExtra=? WHERE id=?";
                                PreparedStatement ps3= conecta.prepareStatement(sql3);
                                ps3.setDouble(1,SobrasAdicionais+rs.getDouble("TempoExtra"));
                                ps3.setInt(2,Indentificar);
                                ps3.executeUpdate();
                                
                                STATUS+="Completou HoraExtra: "+0+"/";
                              
                          }
                }if(SobrasAdicionais>0){//Se a divida nao zerar
			        String sql2="UPDATE funcionario set devendo=true,TempoDevendo=TempoDevendo-? WHERE id=?";
                                PreparedStatement ps= conecta.prepareStatement(sql2);
                                ps.setDouble(1,SobrasAdicionais);
                                ps.setInt(2,Indentificar);
                                ps.executeUpdate();
				
                                STATUS+="Diminuiu a divida:"+SobrasAdicionais+"/";
			}
                
        } }
	if(Devendo==true && Extra==false){//Se stiver devendo e sem extra---POSSIBILIDADE 2°
            
            Diferença= fez - deveria;//Para saber a diferença 
            SobrasAdicionais=TempoDevendo-Diferença;//subtrair a diferença com o tempo que ele deve no sistema

	        if(SobrasAdicionais<=0.00){//Se divida zerar
			
				String sql3="UPDATE Funcionario SET devendo=false,TempoDevendo=0 WHERE id=?";
                                PreparedStatement ps2= conecta.prepareStatement(sql3);
                                ps2.setInt(1,Indentificar);
                                ps2.executeUpdate();
                                
                                STATUS+="Deixou de dever: "+0+"/";
                
                }if(SobrasAdicionais>0){//Se a divida nao zerar
			        String sql2="UPDATE funcionario set devendo=true,TempoDevendo=TempoDevendo-? WHERE id=?";
                                PreparedStatement ps= conecta.prepareStatement(sql2);
                                ps.setDouble(1,SobrasAdicionais);
                                ps.setInt(2,Indentificar);
                                ps.executeUpdate();
				
                                STATUS+="Diminuiu a divida:"+SobrasAdicionais+"/";
			}
                
        }
        if(Extra==true && Devendo==false){//se estiver com extra mas nao devendo---POSSIBILIDADE 3°
		Diferença=fez-deveria;
		TempoAdicional=TempoExtra-Diferença;
                if(TempoAdicional<=0){//
                    PreparedStatement ps= conecta.prepareStatement("UPDATE Funcionario set Extra=false,TempoExtra=0 WHERE id=?");
                    ps.setInt(1,Indentificar);
                    ps.executeUpdate();
                   
                                STATUS+="Ele completou hora extra/";
                }if(TempoAdicional>0){
                    String sql3="UPDATE funcionario SET TempoExtra=TempoExtra-? WHERE id=?";
		PreparedStatement ps= conecta.prepareStatement(sql3);
		ps.setDouble(1,TempoAdicional);
                ps.setInt(2,Indentificar);
		ps.executeUpdate();
                
                                STATUS+="Ele diminuiu Hora extra: "+TempoAdicional+"/";
                }
        
        }


		
        }if(rs.getInt("Cargo_id")==3){
           double pagamento=rs.getDouble("CargaHorariaAtual")*rs.getDouble("Porhora");
           
                                STATUS+="voce deve ao horista: "+pagamento+"/";
                                   PreparedStatement ps= conecta.prepareStatement("UPDATE Funcionario set CargaHorariaAtual=0 WHERE id=?");
                    ps.setInt(1,Indentificar);
                    ps.executeUpdate();i++; 
              
        }
        
        
      
    }
    
    JOptionPane.showMessageDialog(null,"Levantamento desta semana foi completado");
    }
    
    //metodos abaixo ainda nao utilizados
public void  setarDados(boolean Devendo,boolean Extra){//ira setar todos os valores que serao necssarios para Levantamento da semana
    setDevendo(Devendo);
    setExtra(Extra);
}

               
           public boolean isDevendo() {
        return Devendo;
    }

    public void setDevendo(boolean Devendo) {
        this.Devendo = Devendo;
    }

    public boolean isExtra() {
        return Extra;
    }

    public void setExtra(boolean Extra) {
        this.Extra = Extra;
    }

    public double getCargaHorariaFixa() {
        return CargaHorariaFixa;
    }

    public void setCargaHorariaFixa(double CargaHorariaFixa) {
        this.CargaHorariaFixa = CargaHorariaFixa;
    }

    public double getCargaHorariaAtual() {
        return CargaHorariaAtual;
    }

    public void setCargaHorariaAtual(double CargaHorariaAtual) {
        this.CargaHorariaAtual = CargaHorariaAtual;
    }

    public double getTempoDevendo() {
        return TempoDevendo;
    }

    public void setTempoDevendo(double TempoDevendo) {
        this.TempoDevendo = TempoDevendo;
    }

    public double getTempoExtra() {
        return TempoExtra;
    }

    public void setTempoExtra(double TempoExtra) {
        this.TempoExtra = TempoExtra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
       



}