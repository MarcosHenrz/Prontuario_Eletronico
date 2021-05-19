/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.Connection;
import modelo.beans.BeansMedico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoMedico {
   private Connection conecta;
   
   public DaoMedico(){
       this.conecta = new DAO().conecta();
   }
    
    
    public void salvar (BeansMedico med){
        String sql = "insert into tb_medicos(id_medico,nome_medico,crm,rg_medico, cpf_medico, especialidade, telefone) values(?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt  = conecta.prepareStatement(sql);
            stmt.setInt(1, med.getId_medico());
            stmt.setString(2, med.getNome());
            stmt.setInt(3, med.getCrm());
            stmt.setString(4, med.getRg());
            stmt.setString(5, med.getCpf());
            stmt.setString(6, med.getEspecialidade());
            stmt.setString(7, med.getTelefone());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }    
    }
    
    public void alterar(BeansMedico med){
        String sql = "update tb_medicos set nome_medico=?, crm=?, rg_medico=?, cpf_medico=?, especialidade=?, telefone=? where id_medico=?";
      
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, med.getNome());
            stmt.setInt(2, med.getCrm());
            stmt.setString(3, med.getRg());
            stmt.setString(4, med.getCpf());
            stmt.setString(5, med.getEspecialidade());
            stmt.setString(6, med.getTelefone());
            stmt.setInt(7, med.getId_medico());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }    
        
    }
    
    
     public List<BeansMedico> pesquisarMedicos(String nome){
        String sql = "select * from tb_medicos where nome_medico like ? order by nome_medico";
        ResultSet rs;
        List<BeansMedico> medico = new ArrayList<BeansMedico>();
        try{
           PreparedStatement stmt = conecta.prepareStatement(sql);
           stmt.setString(1, nome);
           rs = stmt.executeQuery();
           while(rs.next()){
               BeansMedico m = new BeansMedico();
               
               m.setId_medico(rs.getInt("id_medico"));
               m.setNome(rs.getString("nome_medico"));
               m.setCrm(rs.getInt("crm"));
               m.setRg(rs.getString("rg_medico"));
               m.setCpf(rs.getString("cpf_medico"));
               m.setEspecialidade(rs.getString("especialidade"));
               m.setTelefone(rs.getString("telefone"));
               medico.add(m);
           }
           rs.close();
           stmt.close();
           return medico;
        }catch (SQLException e) {
            throw new RuntimeException (e);  
        }
    }
    
    
    public void excluir(BeansMedico med){
         String sql = "delete from tb_medicos where id_medico=?";          
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, med.getId_medico());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }
        
    }
    
    
    public List<BeansMedico> listarMedicos(){
        String sql = "select * from tb_medicos";
        ResultSet rs;
        List<BeansMedico> medico = new ArrayList<BeansMedico>();
        try{
           PreparedStatement stmt = conecta.prepareStatement(sql);
           rs = stmt.executeQuery();
           while(rs.next()){
               BeansMedico med = new BeansMedico();
               
               med.setId_medico(rs.getInt("id_medico"));
               med.setNome(rs.getString("nome_medico"));
               med.setCrm(rs.getInt("crm"));
               med.setRg(rs.getString("rg_medico"));
               med.setCpf(rs.getString("cpf_medico"));
               med.setEspecialidade(rs.getString("especialidade"));
               med.setTelefone(rs.getString("telefone"));
               medico.add(med);
           }
           rs.close();
           stmt.close();
           return medico;
        }catch (SQLException e) {
            throw new RuntimeException (e);  
        }
      
    }
}

