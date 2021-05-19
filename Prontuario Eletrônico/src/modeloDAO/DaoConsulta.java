/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.beans.BeansConsulta;
import modelo.beans.BeansMedico;

public class DaoConsulta {
    
    private Connection conecta;
    
    public DaoConsulta(){
        this.conecta = new DAO().conecta();
    }
      
    public void salvar(BeansConsulta consulta) {
     String sql = "insert into tb_consultas(COD_CONSULTA, nome_paciente, nome_medico, data_consulta, hora) values(?,?,?,?,?)";
        
     try {
         PreparedStatement stmt  = conecta.prepareStatement(sql);
            stmt.setInt(1, consulta.getCodConsulta());
            stmt.setString(2, consulta.getNomePaciente());
            stmt.setString(3, consulta.getMedico());
            stmt.setString(4, consulta.getData());
            stmt.setString(5, consulta.getHora());
            stmt.execute();
            stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
    }
    
     public void alterar(BeansConsulta consulta){
        String sql = "update tb_consultas set nome_paciente=?, nome_medico=?, data_consulta=?, hora=? where cod_consulta=?";
      
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, consulta.getNomePaciente());
            stmt.setString(2, consulta.getMedico());
            stmt.setString(3, consulta.getData());
            stmt.setString(4, consulta.getHora());
            stmt.setInt(5, consulta.getCodConsulta());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }
    }
     
    public List<BeansConsulta> pesquisarConsultas(String nome){
        String sql = "select * from tb_consultas where nome_paciente like ? order by nome_paciente";
        ResultSet rs;
        List<BeansConsulta> consulta = new ArrayList<BeansConsulta>();
        try{
           PreparedStatement stmt = conecta.prepareStatement(sql);
           stmt.setString(1, nome);
           rs = stmt.executeQuery();
           while(rs.next()){
               BeansConsulta con = new BeansConsulta();
               
               con.setCodConsulta(rs.getInt("cod_consulta"));
               con.setNomePaciente(rs.getString("nome_paciente"));;
               con.setMedico(rs.getString("nome_medico"));
               con.setData(rs.getString("data_consulta"));
               con.setHora(rs.getString("hora"));
              
               consulta.add(con);
           }
           rs.close();
           stmt.close();
           return consulta;
        }catch (SQLException e) {
            throw new RuntimeException (e);  
        }
    }  
     
     
     public void excluir(BeansConsulta consulta){
         String sql = "delete from tb_consultas where cod_consulta=?";          
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, consulta.getCodConsulta());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }
        
    }
     
      public List<BeansConsulta> listarConsultas(){
        String sql = "select * from tb_consultas";
        ResultSet rs;
        List<BeansConsulta> consulta = new ArrayList<BeansConsulta>();
        try{
           PreparedStatement stmt = conecta.prepareStatement(sql);
           rs = stmt.executeQuery();
           while(rs.next()){
               BeansConsulta con = new BeansConsulta();
               
               con.setCodConsulta(rs.getInt("cod_consulta"));
               con.setNomePaciente(rs.getString("nome_paciente"));;
               con.setMedico(rs.getString("nome_medico"));
               con.setData(rs.getString("data_consulta"));
               con.setHora(rs.getString("hora"));
              
               consulta.add(con);
           }
           rs.close();
           stmt.close();
           return consulta;
        }catch (SQLException e) {
            throw new RuntimeException (e);  
        }
      
    }

}